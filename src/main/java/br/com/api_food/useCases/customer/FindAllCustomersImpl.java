package br.com.api_food.useCases.customer;

import br.com.api_food.domain.entity.customer.CustomerDomain;
import br.com.api_food.domain.persistence.customer.CustomerPersistence;
import br.com.api_food.domain.useCases.customer.FindAllCustomers;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FindAllCustomersImpl implements FindAllCustomers {

    private final CustomerPersistence customerPersistencePort;

    @Override
    public List<CustomerDomain> execute() {
        return customerPersistencePort.findAll();
    }
}
