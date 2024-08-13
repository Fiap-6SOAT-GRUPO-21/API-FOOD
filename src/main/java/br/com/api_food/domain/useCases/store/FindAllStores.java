package br.com.api_food.domain.useCases.store;

import br.com.api_food.domain.entity.store.StoreDomain;

import java.util.List;

public interface FindAllStores {

    List<StoreDomain> execute();
}
