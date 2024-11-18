package br.com.api_food.useCases.category;

import br.com.api_food.domain.entity.category.CategoryDomain;
import br.com.api_food.domain.persistence.category.CategoryPersistence;
import br.com.api_food.domain.useCases.category.FindCategoryById;
import br.com.api_food.useCases.category.exceptions.CategoryNotFound;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class FindCategoryByIdImpl implements FindCategoryById {

    private final CategoryPersistence categoryPersistence;

    @Override
    public CategoryDomain execute(UUID id) {
        return categoryPersistence.findById(id)
                .orElseThrow(CategoryNotFound::new);
    }
}
