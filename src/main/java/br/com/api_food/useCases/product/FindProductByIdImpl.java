package br.com.api_food.useCases.product;

import br.com.api_food.domain.entity.product.ProductDomain;
import br.com.api_food.domain.persistence.product.ProductPersistence;
import br.com.api_food.domain.useCases.product.FindProductById;
import br.com.api_food.useCases.product.exceptions.ProductNotFound;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class FindProductByIdImpl implements FindProductById {

    private final ProductPersistence productPersistence;

    @Override
    public ProductDomain execute(UUID id) {
        return productPersistence.findById(id)
                .orElseThrow(ProductNotFound::new);
    }
}
