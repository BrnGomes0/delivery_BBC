package bbc.api.application.service.dashboard;

import bbc.api.application.dto.dashboard.DataTotalPrice;
import bbc.api.application.entity.Order;
import bbc.api.application.repository.order.IRepositoryOrder;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashboardService {

    @Autowired
    private IRepositoryOrder repositoryOrder;

    // Method for getTotalPrice
    public double getTotalPriceOrders(){
        var orders = repositoryOrder.findAll();
        return orders.stream()
                .mapToDouble(Order::getPrice)
                .sum();
    }

    // GET total orders number
    public Long getTotalNumberOrders(){
        List<Order> orders = repositoryOrder.findAll();
        return orders.stream().count();
    }
}
