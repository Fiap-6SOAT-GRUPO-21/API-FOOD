package br.com.api_food.domain.useCases.store;

import br.com.api_food.domain.entity.store.StoreDomain;

public interface CreateNewStore {

    StoreDomain execute(StoreDomain storeDomain);
}
