package br.com.api_food.domain.entity.store;

import br.com.api_food.domain.entity.DomainEntity;
import br.com.api_food.domain.entity.store.payment.MercadoPagoGatewayDomain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StoreDomain extends DomainEntity {
    private UUID id;

    private String name;

    private boolean active = true;

    private UUID idMercadoPagoGateway;

    private MercadoPagoGatewayDomain mercadoPagoGateway;
}
