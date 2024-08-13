package br.com.api_food.useCases.customer;

import br.com.api_food.domain.entity.customer.CustomerDomain;
import br.com.api_food.domain.persistence.customer.CustomerPersistence;
import br.com.api_food.domain.useCases.customer.UpdateCustomer;
import br.com.api_food.domain.useCases.store.FindStoreById;
import br.com.api_food.useCases.customer.exceptions.CustomerNotFound;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateCustomerImpl implements UpdateCustomer {

    private final CustomerPersistence customerPersistencePort;
    private final FindStoreById findStoreById;
    private final ModelMapper modelMapper;

    @Override
    public CustomerDomain execute(CustomerDomain updateCustomerDomain) {
        CustomerDomain domain = customerPersistencePort.findById(updateCustomerDomain.getId())
                .orElseThrow(CustomerNotFound::new);

        findStoreById.execute(updateCustomerDomain.getIdStore());
        modelMapper.map(updateCustomerDomain, domain);

        return customerPersistencePort.save(domain);
    }
}
