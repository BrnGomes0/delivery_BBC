package bbc.api.application.entity;

import bbc.api.application.dto.order.DataRegisterOrder;
import bbc.api.application.extern.StatusOrder;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "order_table")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "order_id")
public class Order {
    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long order_id;

    private String name;

    private Double price;

    private StatusOrder statusOrder;

    private LocalTime time_created;

    private LocalDate date_created;

    private Boolean isConfirm;

    // Creating a constructor
    public Order(DataRegisterOrder dataRegisterOrder){
        this.name = dataRegisterOrder.name();
        this.price = dataRegisterOrder.price_order();
        this.statusOrder = dataRegisterOrder.statusOrder();
        this.date_created = LocalDate.now();
        this.time_created = LocalTime.now();
        this.isConfirm = false;
    }
}
