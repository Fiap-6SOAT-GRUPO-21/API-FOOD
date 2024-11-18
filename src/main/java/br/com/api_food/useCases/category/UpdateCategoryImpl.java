package br.com.api_food.useCases.category;

import br.com.api_food.domain.entity.category.CategoryDomain;
import br.com.api_food.domain.persistence.category.CategoryPersistence;
import br.com.api_food.domain.useCases.category.CreateNewCategory;
import br.com.api_food.domain.useCases.category.UpdateCategory;
import br.com.api_food.useCases.category.exceptions.CategoryNotFound;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateCategoryImpl implements UpdateCategory {

    private final CategoryPersistence categoryPersistence;
    private final ModelMapper modelMapper;
    private final CreateNewCategory createNewCategory;

    @Override
    public CategoryDomain execute(CategoryDomain updateCategoryDomain) {
        CategoryDomain domain = categoryPersistence.findById(updateCategoryDomain.getId())
                .orElseThrow(CategoryNotFound::new);

        modelMapper.map(updateCategoryDomain, domain);

        return createNewCategory.execute(domain);
    }
}
