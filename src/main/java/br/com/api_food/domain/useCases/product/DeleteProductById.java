package br.com.api_food.domain.useCases.product;

import java.util.UUID;

public interface DeleteProductById {

    void execute(UUID id);
}
