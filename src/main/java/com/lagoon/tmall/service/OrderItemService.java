package com.lagoon.tmall.service;

import com.lagoon.tmall.pojo.Order;
import com.lagoon.tmall.pojo.OrderItem;

import java.util.List;

/**
 * @Author WinkiLee
 * @Date 2019/4/24 10:47
 * @Description
 */
public interface OrderItemService {
    void add(OrderItem c);

    void delete(int id);
    void update(OrderItem c);
    OrderItem get(int id);
    List list();

    void fill(List<Order> os);

    void fill(Order o);

    int getSaleCount(int  pid);

    List<OrderItem> listByUser(int uid);
}
