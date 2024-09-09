package br.com.api_food.domain.useCases.manager;

import java.util.UUID;

public interface DeleteManagerById {

    void execute(UUID id);
}
