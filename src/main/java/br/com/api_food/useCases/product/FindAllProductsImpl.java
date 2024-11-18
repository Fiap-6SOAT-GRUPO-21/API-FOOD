package br.com.api_food.useCases.product;

import br.com.api_food.domain.entity.product.ProductDomain;
import br.com.api_food.domain.persistence.product.ProductPersistence;
import br.com.api_food.domain.useCases.product.FindAllProducts;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FindAllProductsImpl implements FindAllProducts {

    private final ProductPersistence productPersistence;

    @Override
    public List<ProductDomain> execute() {
        return productPersistence.findAll();
    }
}
