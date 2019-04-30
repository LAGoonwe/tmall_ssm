package com.lagoon.tmall.service;

import com.lagoon.tmall.pojo.Review;

import java.util.List;

/**
 * @Author WinkiLee
 * @Date 2019/4/24 12:09
 * @Description
 */
public interface ReviewService {
    void add(Review c);

    void delete(int id);
    void update(Review c);
    Review get(int id);
    List list(int pid);

    int getCount(int pid);
}
