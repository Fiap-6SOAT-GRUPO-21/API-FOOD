package br.com.api_food.domain.useCases.customer;

import br.com.api_food.domain.entity.customer.CustomerDomain;

import java.util.List;

public interface FindAllCustomers {

    List<CustomerDomain> execute();
}
