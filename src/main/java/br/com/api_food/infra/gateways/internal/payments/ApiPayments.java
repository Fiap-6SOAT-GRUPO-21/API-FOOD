package br.com.api_food.infra.gateways.internal.payments;

import br.com.api_food.infra.interceptor.DefaultInterceptor;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "internal-api-payments",
        url = "${api-url.api-payment}",
        configuration = DefaultInterceptor.class
)
public interface ApiPayments {
}
