package br.com.api_food.domain.useCases.store;

import br.com.api_food.domain.entity.store.StoreDomain;

import java.util.UUID;

public interface FindStoreById {

    StoreDomain execute(UUID id);
}
