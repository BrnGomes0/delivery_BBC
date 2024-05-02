package bbc.api.application.repository.order;

import bbc.api.application.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositoryOrder extends JpaRepository<Order, Long> {
}
