package com.lagoon.tmall.service;

import com.lagoon.tmall.pojo.Product;
import com.lagoon.tmall.pojo.PropertyValue;

import java.util.List;

/**
 * @Author WinkiLee
 * @Date 2019/4/24 10:20
 * @Description
 */
public interface PropertyValueService {

    void init(Product p);
    void update(PropertyValue pv);

    PropertyValue get(int ptid,int pid);
    List<PropertyValue> list(int pid);
}
