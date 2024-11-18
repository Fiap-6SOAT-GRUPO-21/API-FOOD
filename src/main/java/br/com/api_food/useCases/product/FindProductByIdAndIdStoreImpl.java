package br.com.api_food.useCases.product;

import br.com.api_food.domain.entity.product.ProductDomain;
import br.com.api_food.domain.persistence.product.ProductPersistence;
import br.com.api_food.domain.useCases.product.FindProductByIdAndIdStore;
import br.com.api_food.useCases.product.exceptions.ProductNotFound;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class FindProductByIdAndIdStoreImpl implements FindProductByIdAndIdStore {

    private final ProductPersistence productPersistence;

    @Override
    public ProductDomain execute(UUID idProduct, UUID idStore) {
        return productPersistence.findByIdAndIdStore(idProduct, idStore)
                .orElseThrow(() -> new ProductNotFound("Product with id " + idProduct + ", by idStore: " + idStore + " not found"));
    }
}
