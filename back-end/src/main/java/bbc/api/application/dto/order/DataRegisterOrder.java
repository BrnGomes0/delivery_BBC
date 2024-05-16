package bbc.api.application.dto.order;

import bbc.api.application.extern.StatusOrder;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DataRegisterOrder(
        @NotBlank
        String name,
        @NotNull
        StatusOrder statusOrder,
        @NotNull
        Double price_order
) {
}
