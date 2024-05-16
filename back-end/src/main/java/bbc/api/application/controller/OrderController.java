package bbc.api.application.controller;


import bbc.api.application.dto.order.DataDetailOrder;
import bbc.api.application.dto.order.DataListOrder;
import bbc.api.application.dto.order.DataRegisterOrder;
import bbc.api.application.entity.Order;
import bbc.api.application.infra.exception.OrderNotFoundException;
import bbc.api.application.service.order.OrderService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;
    @PostMapping
    public ResponseEntity<DataDetailOrder> registerOder(@RequestBody @Valid DataRegisterOrder dataRegisterOrder, UriComponentsBuilder uriBuilder){
        var oder = orderService.createAOrder(dataRegisterOrder);
        var uri = uriBuilder.path("/order/{order_id}").build(oder.order_id());
        return ResponseEntity.created(uri).body(oder);
    }
    @GetMapping("/listOrders")
    public ResponseEntity<Page<DataListOrder>> listTheOrders(@PageableDefault(size = 8, sort = {"name"})Pageable pageable){
        var listOfOrders = orderService.listOfOrders(pageable);
        return ResponseEntity.status(HttpStatus.OK).body(listOfOrders);
    }
    @PatchMapping("/{order_id}/confirm")
    public ResponseEntity<Order> confirmOrder(@PathVariable Long order_id) throws OrderNotFoundException {
        var confirmOrder = orderService.confirmOrder(order_id);
        return ResponseEntity.status(HttpStatus.OK).body(confirmOrder);
    }
}
