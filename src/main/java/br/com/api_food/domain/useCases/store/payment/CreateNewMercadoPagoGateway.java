package br.com.api_food.domain.useCases.store.payment;

import br.com.api_food.domain.entity.DomainEntity;
import br.com.api_food.domain.entity.store.payment.MercadoPagoGatewayDomain;

public interface CreateNewMercadoPagoGateway {

    DomainEntity execute(MercadoPagoGatewayDomain mercadoPagoGatewayDomain);
}
