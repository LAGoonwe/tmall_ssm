package com.lagoon.tmall.Comparator;

import com.lagoon.tmall.pojo.Product;

import java.util.Comparator;

/**
 * @Author WinkiLee
 * @Date 2019/4/24 12:38
 * @Description 新品比较器
 */
public class ProductDateComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return p2.getCreateDate().compareTo(p1.getCreateDate());
    }

}
