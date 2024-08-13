package br.com.api_food.domain.useCases.order.item;

import br.com.api_food.domain.entity.order.item.OrderItemDomain;

public interface CreateNewOrderItem {

    OrderItemDomain execute(OrderItemDomain orderItemDomain);
}
