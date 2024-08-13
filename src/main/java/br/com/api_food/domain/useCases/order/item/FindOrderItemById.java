package br.com.api_food.domain.useCases.order.item;

import br.com.api_food.domain.entity.DomainEntity;

import java.util.UUID;

public interface FindOrderItemById {

    DomainEntity execute(UUID id);
}
