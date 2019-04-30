package com.lagoon.tmall.service;

import com.lagoon.tmall.pojo.ProductImage;

import java.util.List;

/**
 * @Author WinkiLee
 * @Date 2019/4/24 9:53
 * @Description
 */
public interface ProductImageService {

    //单个图片
    String type_single="type_single";
    //详情图片
    String type_detail="type_detail";

    void add(ProductImage pi);
    void delete(int id);
    void update(ProductImage pi);
    ProductImage get(int id);
    List list(int pid, String type);

}
