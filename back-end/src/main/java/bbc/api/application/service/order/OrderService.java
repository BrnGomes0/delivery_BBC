package bbc.api.application.service.order;

import bbc.api.application.dto.order.DataDetailOrder;
import bbc.api.application.dto.order.DataListOrder;
import bbc.api.application.dto.order.DataRegisterOrder;
import bbc.api.application.entity.Order;
import bbc.api.application.infra.exception.OrderNotFoundException;
import bbc.api.application.repository.order.IRepositoryOrder;
import bbc.api.application.service.utils.Formatted;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class OrderService {
    @Autowired
    private IRepositoryOrder repositoryOrder;
    @Autowired
    private Formatted formattedComponent;

    // POST (Register Order)
    @Transactional
    public DataDetailOrder createAOrder(@RequestBody @Valid DataRegisterOrder dataRegisterOrder){
        Order order = new Order(dataRegisterOrder);
        repositoryOrder.save(order);
        return new DataDetailOrder(order, formattedComponent.formattedDate(formattedComponent.getCurrentDate()), formattedComponent.getCurrentTimeFormatted());
    }

     // GET (Pageable, list all orders)
    public Page<DataListOrder> listOfOrders(@PageableDefault(size = 8, sort = {"name"})Pageable pageable){
        var orders = repositoryOrder.findAll(pageable);
        return orders.map(order -> new DataListOrder(order, formattedComponent.formattedDate(order.getDate_created()), formattedComponent.getCurrentTimeFormatted()));
    }

    // PATCH
    public Order confirmOrder(@PathVariable Long order_id) throws OrderNotFoundException {
        Order order = repositoryOrder.findById(order_id)
                .orElseThrow(() -> new OrderNotFoundException("Order Not Found!"));
        order.setIsConfirm(true);
        return repositoryOrder.save(order);
    }
}
