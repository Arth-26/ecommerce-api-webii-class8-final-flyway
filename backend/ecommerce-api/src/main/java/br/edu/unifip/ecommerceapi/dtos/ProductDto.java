package br.edu.unifip.ecommerceapi.dtos;

import java.math.BigDecimal;
import java.util.UUID;

public record ProductDto(
        String name,
        String description,
        BigDecimal price,
        UUID category) {
}
