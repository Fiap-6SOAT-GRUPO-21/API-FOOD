package br.com.api_food.domain.useCases.product;

import br.com.api_food.domain.entity.product.ProductDomain;

import java.util.List;
import java.util.UUID;

public interface FindAllByCategoryId {

    List<ProductDomain> execute(UUID idCategory);
}
