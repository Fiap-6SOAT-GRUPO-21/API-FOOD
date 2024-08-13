package br.com.api_food.domain.useCases.product;

import br.com.api_food.domain.entity.product.ProductDomain;

public interface CreateNewProduct {

   ProductDomain execute(ProductDomain productDomain);
}
