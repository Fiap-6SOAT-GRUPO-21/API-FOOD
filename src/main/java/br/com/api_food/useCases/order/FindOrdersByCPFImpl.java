package br.com.api_food.useCases.order;

import br.com.api_food.domain.entity.customer.CustomerDomain;
import br.com.api_food.domain.entity.order.OrderDomain;
import br.com.api_food.domain.persistence.order.OrderPersistence;
import br.com.api_food.domain.useCases.customer.FindCustomerByCPF;
import br.com.api_food.domain.useCases.order.FindOrdersByCPF;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FindOrdersByCPFImpl implements FindOrdersByCPF {

    private final OrderPersistence orderPersistence;
    private final FindCustomerByCPF findCustomerByCPF;
    @Override
    public List<OrderDomain> execute(String cpf) {
        CustomerDomain customerDomain = findCustomerByCPF.execute(cpf);
        return orderPersistence.findByIdCustomer(customerDomain.getId());
    }
}
