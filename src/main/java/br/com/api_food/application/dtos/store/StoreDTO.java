package br.com.api_food.application.dtos.store;

import br.com.api_food.application.dtos.store.payment.MercadoPagoGatewayDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StoreDTO {

    @Schema(description = "Category ID", example = "d8897bbb-868c-4163-b4c8-2e6baf356683")
    private UUID id;

    @Schema(description = "Category ID", example = "Dessert")
    @NotNull
    private String name;

    @NotNull
    private boolean active = true;

    @Schema(description = "Gateway de pagamento do Mercado Pago")
    private MercadoPagoGatewayDTO mercadoPagoGateway;

}
