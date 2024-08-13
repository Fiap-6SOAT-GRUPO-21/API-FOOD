package br.com.api_food.domain.useCases.store;

import java.util.UUID;

public interface DeleteStoreById {

    void execute(UUID id);
}
