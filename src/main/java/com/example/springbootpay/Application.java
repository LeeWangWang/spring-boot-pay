package com.example.springbootpay;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Name: SpringBootPayApplication
 * @Description: 启动类(启动的时候一定要配置好支付宝、微信以及银联相关参数)
 * @Author: JoshLee
 * @Date: 2023/6/5 8:19
 * @Version: V1
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.example.springbootpay.modules")
@NacosPropertySource(dataId = "example", autoRefreshed = true)
public class Application implements WebMvcConfigurer {

    private static final Logger logger = Logger.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
