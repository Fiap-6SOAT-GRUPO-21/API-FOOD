package br.com.api_food.useCases.manager;

import br.com.api_food.domain.entity.manager.ManagerDomain;
import br.com.api_food.domain.useCases.manager.UpdateManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateManagerImpl implements UpdateManager {
    @Override
    public ManagerDomain execute(ManagerDomain updateMangerDomain) {
        return null;
    }
}
