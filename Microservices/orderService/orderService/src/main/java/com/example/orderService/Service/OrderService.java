package com.example.orderService.Service;

import com.example.orderService.Model.OrderRequest;
import com.example.orderService.Model.OrderResponse;

public interface OrderService {
    public long placeOrder(OrderRequest orderRequest);

    OrderResponse getOrderDetails(long orderId);
    //OrderResponse getOrderDetails(Long OrderId);
}
