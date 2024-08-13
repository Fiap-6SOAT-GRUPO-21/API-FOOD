package br.com.api_food.useCases.store.payment;

import br.com.api_food.domain.entity.DomainEntity;
import br.com.api_food.domain.entity.store.payment.MercadoPagoGatewayDomain;
import br.com.api_food.domain.persistence.store.payment.MercadoPagoGatewayPersistence;
import br.com.api_food.domain.useCases.store.payment.CreateNewMercadoPagoGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateNewMercadoPagoGatewayImpl implements CreateNewMercadoPagoGateway {

    private final MercadoPagoGatewayPersistence mercadoPagoGatewayPersistence;
    @Override
    public DomainEntity execute(MercadoPagoGatewayDomain mercadoPagoGatewayDomain) {
        return mercadoPagoGatewayPersistence.save(mercadoPagoGatewayDomain);
    }
}
