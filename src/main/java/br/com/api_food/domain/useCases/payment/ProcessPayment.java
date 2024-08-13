package br.com.api_food.domain.useCases.payment;

import br.com.api_food.application.dtos.payment.PaymentIntegrationOrder;
import br.com.api_food.application.dtos.payment.PaymentIntegrationResult;

public interface ProcessPayment {

    PaymentIntegrationResult processPayment(PaymentIntegrationOrder paymentIntegrationOrder);

}
