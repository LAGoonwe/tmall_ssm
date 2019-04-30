package com.lagoon.tmall.Comparator;

import com.lagoon.tmall.pojo.Product;

import java.util.Comparator;

/**
 * @Author WinkiLee
 * @Date 2019/4/24 12:35
 * @Description 综合比较器
 */
public class ProductAllComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p2.getReviewCount()*p2.getSaleCount()-p1.getReviewCount()*p1.getSaleCount();
    }
}
