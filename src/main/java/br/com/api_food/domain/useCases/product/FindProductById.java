package br.com.api_food.domain.useCases.product;

import br.com.api_food.domain.entity.product.ProductDomain;

import java.util.UUID;

public interface FindProductById {

    ProductDomain execute(UUID id);
}
