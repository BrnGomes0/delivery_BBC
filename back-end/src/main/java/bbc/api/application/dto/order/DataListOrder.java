package bbc.api.application.dto.order;

import bbc.api.application.entity.Order;
import bbc.api.application.extern.StatusOrder;

public record DataListOrder(
        Long order_id,
        String name,
        Double price_order,
        StatusOrder statusOrder,
        String date_created,
        String time_created
) {
    public DataListOrder(Order order, String date_created, String time_created){
        this(
                order.getOrder_id(),
                order.getName(),
                order.getPrice(),
                order.getStatusOrder(),
                date_created,
                time_created
        );
    }
}
