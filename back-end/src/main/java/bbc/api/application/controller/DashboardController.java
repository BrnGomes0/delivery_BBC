package bbc.api.application.controller;

import bbc.api.application.dto.dashboard.DataTotalOrders;
import bbc.api.application.dto.dashboard.DataTotalPrice;
import bbc.api.application.service.dashboard.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    @RequestMapping("/dashboard")
public class DashboardController {

    @Autowired
    private DashboardService dashboardService;

    // GET price total
    @GetMapping("/total")
    public ResponseEntity<DataTotalPrice> returnTotalPrice(){
        var totalPrice = dashboardService.getTotalPriceOrders();
        return ResponseEntity.status(HttpStatus.OK).body(new DataTotalPrice(totalPrice));
    }

    // GET number count orders
    @GetMapping("/orders")
    public ResponseEntity<DataTotalOrders> returnNumberOrders(){
        var totalOrders = dashboardService.getTotalNumberOrders();
        return ResponseEntity.status(HttpStatus.OK).body(new DataTotalOrders(totalOrders));
    }

}
