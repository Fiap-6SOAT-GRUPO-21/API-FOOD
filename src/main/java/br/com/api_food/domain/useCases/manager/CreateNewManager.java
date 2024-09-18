package br.com.api_food.domain.useCases.manager;

import br.com.api_food.domain.entity.manager.ManagerDomain;

public interface CreateNewManager {

    ManagerDomain execute(ManagerDomain managerDomain);
}
