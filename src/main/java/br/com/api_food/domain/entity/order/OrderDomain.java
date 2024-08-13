package br.com.api_food.domain.entity.order;

import br.com.api_food.domain.entity.DomainEntity;
import br.com.api_food.domain.entity.customer.CustomerDomain;
import br.com.api_food.domain.entity.order.enums.StatusOrder;
import br.com.api_food.domain.entity.order.item.OrderItemDomain;
import br.com.api_food.domain.entity.payment.PaymentDomain;
import br.com.api_food.domain.entity.payment.enums.PaymentStatus;
import br.com.api_food.domain.entity.store.StoreDomain;
import br.com.api_food.domain.useCases.product.FindProductById;
import br.com.api_food.domain.useCases.product.FindProductByIdAndIdStore;
import br.com.api_food.domain.useCases.store.FindStoreById;
import br.com.api_food.useCases.order.exceptions.EmptyOrderItems;
import br.com.api_food.useCases.order.exceptions.OrderPaymentApproved;
import br.com.api_food.useCases.order.item.exceptions.EmptyQuantityItems;
import br.com.api_food.useCases.product.exceptions.ProductNotFound;
import br.com.api_food.useCases.store.exceptions.StoreInactive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDomain extends DomainEntity {

    private List<OrderItemDomain> items;
    private StatusOrder status;
    private BigDecimal total;
    private UUID idCustomer;
    private CustomerDomain customer;
    private UUID idStore;
    private StoreDomain store;
    private UUID idPayment;
    private PaymentDomain payment;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public void validatedStore(FindStoreById findStoreById) {
        StoreDomain storeDomain = findStoreById.execute(this.getIdStore());

        if (!storeDomain.isActive())
            throw new StoreInactive();

        this.setStore(storeDomain);
        this.setIdStore(storeDomain.getId());
    }

    public void validatedQuantityItems(List<OrderItemDomain> items) {
        if (items.isEmpty()) {
            throw new EmptyOrderItems();
        }

        if (items.stream().anyMatch(item -> item.getQuantity() == 0)) {
            throw new EmptyQuantityItems();
        }
    }

    public void validatedItemOrException(FindProductByIdAndIdStore findProductByIdAndIdStore) {
        this.getItems().forEach(item ->
                item.setProduct(findProductByIdAndIdStore.execute(item.getIdProduct(), this.getIdStore())));
    }

    public void calculateTotal(FindProductById findProductById) {
        this.setTotal(this.getItems().stream()
                .map(item -> findProductById.execute(item.getIdProduct())
                        .getPrice().multiply(BigDecimal.valueOf(item.getQuantity())))
                .reduce(BigDecimal::add)
                .orElseThrow(ProductNotFound::new));
    }

    public void validatedPayments() {
        if (this.getPayment() != null && this.getPayment().getStatus().equals(PaymentStatus.APPROVED))
            throw new OrderPaymentApproved();
    }
}
