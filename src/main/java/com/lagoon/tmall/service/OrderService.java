package com.lagoon.tmall.service;

import com.lagoon.tmall.pojo.Order;
import com.lagoon.tmall.pojo.OrderItem;

import java.util.List;

/**
 * @Author WinkiLee
 * @Date 2019/4/24 10:47
 * @Description
 */
public interface OrderService {
    String waitPay = "waitPay";
    String waitDelivery = "waitDelivery";
    String waitConfirm = "waitConfirm";
    String waitReview = "waitReview";
    String finish = "finish";
    String delete = "delete";

    void add(Order c);

    void delete(int id);
    void update(Order c);
    Order get(int id);
    List list();

    float add(Order c,List<OrderItem> ois);
    List list(int uid, String excludedStatus);
}
