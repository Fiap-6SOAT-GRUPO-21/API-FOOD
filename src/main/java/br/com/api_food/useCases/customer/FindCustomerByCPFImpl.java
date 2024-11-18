package br.com.api_food.useCases.customer;

import br.com.api_food.domain.entity.customer.CustomerDomain;
import br.com.api_food.domain.persistence.customer.CustomerPersistence;
import br.com.api_food.domain.useCases.customer.FindCustomerByCPF;
import br.com.api_food.useCases.customer.exceptions.CustomerNotFoundByCPF;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FindCustomerByCPFImpl implements FindCustomerByCPF {

    private final CustomerPersistence customerPersistencePort;

    @Override
    public CustomerDomain execute(String cpf) {
        return customerPersistencePort.findByCpf(cpf)
                .orElseThrow(CustomerNotFoundByCPF::new);
    }
}
