package br.com.api_food.domain.useCases.order;

import br.com.api_food.domain.entity.order.OrderDomain;
import br.com.api_food.domain.entity.order.item.OrderItemDomain;
import br.com.api_food.domain.entity.payment.enums.PaymentType;

import java.util.List;
import java.util.UUID;

public interface UpdateOrder {

    OrderDomain execute(UUID idOrder, String cpf, List<OrderItemDomain> items, PaymentType provider);
}
