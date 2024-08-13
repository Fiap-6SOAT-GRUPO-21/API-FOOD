package br.com.api_food.domain.useCases.payment;

public interface UpdatePaymentStatus {

    void execute(Long merchantOrderId);
}
