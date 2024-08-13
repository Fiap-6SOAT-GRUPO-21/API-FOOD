package br.com.api_food.domain.useCases.order;

import br.com.api_food.domain.entity.order.enums.StatusOrder;

import java.util.UUID;

public interface UpdateOrderStatus {

    void execute(UUID id, StatusOrder status);
}
