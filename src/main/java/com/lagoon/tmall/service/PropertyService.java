package com.lagoon.tmall.service;

import com.lagoon.tmall.pojo.Property;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author WinkiLee
 * @Date 2019/4/24 8:38
 * @Description 屬性接口
 */
public interface PropertyService {
    void add(Property c);
    void delete(int id);
    void update(Property c);
    Property get(int id);
    List list(int cid);
}
