package br.com.api_food.domain.useCases.category;

import java.util.UUID;

public interface DeleteCategoryById {

    void execute(UUID id);
}
