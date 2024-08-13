package br.com.api_food.domain.useCases.category;

import br.com.api_food.domain.entity.category.CategoryDomain;

public interface UpdateCategory {

    CategoryDomain execute(CategoryDomain updateCategoryDomain);
}
