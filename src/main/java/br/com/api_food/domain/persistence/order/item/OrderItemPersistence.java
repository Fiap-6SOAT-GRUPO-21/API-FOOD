package br.com.api_food.domain.persistence.order.item;

import br.com.api_food.domain.entity.order.item.OrderItemDomain;

import java.util.Optional;
import java.util.UUID;

public interface OrderItemPersistence {

    Optional<OrderItemDomain> findById(UUID id);

    OrderItemDomain save(OrderItemDomain orderItemDomain);
}
