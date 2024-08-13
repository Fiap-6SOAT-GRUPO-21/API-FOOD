package br.com.api_food.domain.useCases.category;

import br.com.api_food.domain.entity.category.CategoryDomain;

import java.util.UUID;

public interface FindCategoryById {

    CategoryDomain execute(UUID id);
}
