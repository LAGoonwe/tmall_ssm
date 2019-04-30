package com.lagoon.tmall.service;

import com.lagoon.tmall.pojo.Category;
import com.lagoon.tmall.util.Page;

import java.util.List;

/**
 * @Author WinkiLee
 * @Date 2019/4/23 14:05
 * @Description
 */
public interface CategoryService {
    List<Category> list();
    void add(Category category);
    void delete(int id);
    Category get(int id);
    void update(Category category);
}
