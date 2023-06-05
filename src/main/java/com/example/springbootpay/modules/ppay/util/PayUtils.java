package com.example.springbootpay.modules.ppay.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @ClassName: PayUtils
 * @Description: 支付工具类
 * @Author: JoshLee
 * @Date: 2023/6/5 15:27
 * @Version: V1
 */
@Component
@Configuration
@EnableConfigurationProperties({AliPayProperties.class, WxPayProperties.class})
public class PayUtils {
    private final static Logger LOGGER = LoggerFactory.getLogger(PayUtils.class);
    private AliPayProperties aliPay;
    private WxPayProperties wxPay;

    public PayUtils(AliPayProperties aliPayProperties, WxPayProperties wxPayProperties) {
        this.aliPay = aliPayProperties;
        this.wxPay = wxPayProperties;
    }
}
