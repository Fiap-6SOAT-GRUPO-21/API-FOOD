package br.com.api_food.useCases.store;

import br.com.api_food.domain.entity.store.StoreDomain;
import br.com.api_food.domain.persistence.store.StorePersistence;
import br.com.api_food.domain.useCases.store.CreateNewStore;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateNewStoreImpl implements CreateNewStore {

    private final StorePersistence storePersistence;

    @Override
    public StoreDomain execute(StoreDomain storeDomain) {
        storeDomain = storePersistence.save(storeDomain);
        return storeDomain;
    }
}
