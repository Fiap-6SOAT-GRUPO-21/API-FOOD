package br.com.api_food.domain.useCases.payment;

import br.com.api_food.domain.entity.order.OrderDomain;
import br.com.api_food.domain.entity.payment.PaymentDomain;
import br.com.api_food.domain.entity.payment.enums.PaymentType;

public interface MakeANewPayment {

    PaymentDomain execute(OrderDomain orderDomain, PaymentType provider, ProcessPayment processPayment);
}
