package br.com.api_food.domain.useCases.product;

import br.com.api_food.domain.entity.product.ProductDomain;

public interface UpdateProduct {

    ProductDomain execute(ProductDomain updateProductDomain);
}
