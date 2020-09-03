package com.qing.service;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/9/2 下午 3:58
 */
public class UserServiceImpl implements UserService{
    @Override
    public void addUser(String name){
        System.out.println("添加用户："+name);
    }

    @Override
    public String getUserByName(String name){
        System.out.println("姓名: "+name);
        return "hello: "+name;
    }
}
