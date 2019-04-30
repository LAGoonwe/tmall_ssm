package com.lagoon.tmall.Comparator;

import com.lagoon.tmall.pojo.Product;

import java.util.Comparator;

/**
 * @Author WinkiLee
 * @Date 2019/4/24 12:39
 * @Description 销量比较器
 */
public class ProductSaleCountComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return p2.getSaleCount()-p1.getSaleCount();
    }

}
