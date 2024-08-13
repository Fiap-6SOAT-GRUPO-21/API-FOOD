package br.com.api_food.useCases.store;

import br.com.api_food.domain.entity.store.StoreDomain;
import br.com.api_food.domain.persistence.store.StorePersistence;
import br.com.api_food.domain.useCases.store.FindAllStores;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FindAllStoresImpl implements FindAllStores {

    final StorePersistence storePersistence;

    @Override
    public List<StoreDomain> execute() {
        return storePersistence.findAll();
    }
}
