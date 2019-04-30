package com.lagoon.tmall.Comparator;

import com.lagoon.tmall.pojo.Product;

import java.util.Comparator;

/**
 * @Author WinkiLee
 * @Date 2019/4/24 12:37
 * @Description 人气比较器
 */
public class ProductReviewComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p2.getReviewCount()-p1.getReviewCount();
    }
}
