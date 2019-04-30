package com.lagoon.tmall.service;

import com.lagoon.tmall.pojo.User;

import java.util.List;

/**
 * @Author WinkiLee
 * @Date 2019/4/24 10:36
 * @Description
 */
public interface UserService {
    void add(User c);
    void delete(int id);
    void update(User c);
    User get(int id);
    List list();
    boolean isExist(String name);
    User get(String name, String password);
}
