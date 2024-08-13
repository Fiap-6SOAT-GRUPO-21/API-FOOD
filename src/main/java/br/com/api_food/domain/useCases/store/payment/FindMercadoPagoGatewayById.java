package br.com.api_food.domain.useCases.store.payment;

import br.com.api_food.domain.entity.DomainEntity;

import java.util.UUID;

public interface FindMercadoPagoGatewayById {

    DomainEntity execute(UUID id);
}
