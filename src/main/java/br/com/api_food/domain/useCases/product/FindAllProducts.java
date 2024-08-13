package br.com.api_food.domain.useCases.product;

import br.com.api_food.domain.entity.product.ProductDomain;

import java.util.List;

public interface FindAllProducts {

    List<ProductDomain> execute();
}
