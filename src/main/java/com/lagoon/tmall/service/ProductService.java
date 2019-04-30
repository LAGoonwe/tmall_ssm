package com.lagoon.tmall.service;

import com.lagoon.tmall.pojo.Category;
import com.lagoon.tmall.pojo.Product;

import java.util.List;

/**
 * @Author WinkiLee
 * @Date 2019/4/24 9:39
 * @Description
 */
public interface ProductService {
    void add(Product p);
    void delete(int id);
    void update(Product p);
    Product get(int id);
    List list(int cid);
    void setFirstProductImage(Product p);

    void fill(List<Category> cs);

    void fill(Category c);

    void fillByRow(List<Category> cs);

    void setSaleAndReviewNumber(Product p);
    void setSaleAndReviewNumber(List<Product> ps);

    List<Product> search(String keyword);
}
