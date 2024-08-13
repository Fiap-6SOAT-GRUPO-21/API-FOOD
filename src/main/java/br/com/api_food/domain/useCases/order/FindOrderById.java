package br.com.api_food.domain.useCases.order;

import br.com.api_food.domain.entity.order.OrderDomain;

import java.util.UUID;

public interface FindOrderById {

    OrderDomain execute(UUID id);
}
