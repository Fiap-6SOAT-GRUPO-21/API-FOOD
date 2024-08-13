package br.com.api_food.useCases.order;

import br.com.api_food.useCases.order.exceptions.OrderNotFound;
import br.com.api_food.domain.entity.order.OrderDomain;
import br.com.api_food.domain.persistence.order.OrderPersistence;
import br.com.api_food.domain.useCases.order.FindOrderById;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class FindOrderByIdImpl implements FindOrderById {

    private final OrderPersistence orderPersistence;
    @Override
    public OrderDomain execute(UUID id) {
        return orderPersistence.findById(id)
                .orElseThrow(OrderNotFound::new);
    }
}
