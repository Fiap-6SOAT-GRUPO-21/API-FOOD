package br.com.api_food.infra.gateways.internal.order;

import br.com.api_food.infra.interceptor.DefaultInterceptor;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "internal-api-order",
        url = "${api-url.api-order}",
        configuration = DefaultInterceptor.class
)
public interface ApiOrder {
}
