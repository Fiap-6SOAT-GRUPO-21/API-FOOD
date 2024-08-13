package br.com.api_food.domain.useCases.payment;

import br.com.api_food.domain.entity.payment.PaymentDomain;

import java.util.UUID;

public interface FindPaymentById {

    PaymentDomain execute(UUID idPayment);
}
