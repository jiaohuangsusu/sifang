package com.itheima.bolee.trade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description：项目启动类
 */
@SpringBootApplication(scanBasePackages = "com.itheima.bolee")
public class TradeWebStart {

    public static void main(String[] args) {
        SpringApplication.run(TradeWebStart.class, args);
    }
}
