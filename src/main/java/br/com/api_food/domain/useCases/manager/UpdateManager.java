package br.com.api_food.domain.useCases.manager;

import br.com.api_food.domain.entity.manager.ManagerDomain;

public interface UpdateManager {

    ManagerDomain execute(ManagerDomain updateMangerDomain);
}
