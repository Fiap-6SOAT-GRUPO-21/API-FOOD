package br.com.api_food.domain.useCases.order;

import br.com.api_food.domain.entity.order.OrderDomain;

import java.util.List;

public interface FindAllOrdersOrdered {

    List<OrderDomain> execute();
}
