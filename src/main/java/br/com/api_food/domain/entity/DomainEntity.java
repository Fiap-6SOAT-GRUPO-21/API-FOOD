package br.com.api_food.domain.entity;

import lombok.Data;

import java.util.UUID;

@Data
public abstract class DomainEntity {

    private UUID id;
}
