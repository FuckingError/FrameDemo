package com.qing.consumer;

import com.qing.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/9/2 下午 5:28
 */
public class TestDubbo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dubbo.xml");
        UserService userService = (UserService) context.getBean("userService");
        System.out.println("对象:"+userService.getClass());
        userService.addUser("周杰伦");
        String name = userService.getUserByName("刘清");
        System.out.println(name);
    }
}
