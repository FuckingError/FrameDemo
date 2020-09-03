package com.qing.publish;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author Qing
 * @version 1.0
 * @date 2020/9/2 下午 5:03
 */
public class TestDubbo {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring-dubbo.xml"});
        System.out.println("提供者开始提供服务");
        System.in.read(); // 按任意键退出
    }
}
