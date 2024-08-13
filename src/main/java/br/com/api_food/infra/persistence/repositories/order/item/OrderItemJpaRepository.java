package br.com.api_food.infra.persistence.repositories.order.item;

import br.com.api_food.infra.persistence.entities.order.item.OrderItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderItemJpaRepository extends JpaRepository<OrderItemEntity, UUID> {

}
