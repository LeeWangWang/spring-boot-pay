package com.example.springbootpay.modules.ppay.util;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName: AliPayProperties
 * @Description: 支付宝工具类
 * @Author: JoshLee
 * @Date: 2023/6/5 15:26
 * @Version: V1
 */
@Data
@ConfigurationProperties(prefix = "ali.pay")
public class AliPayProperties {
    private String mchId;
    private String key;
    private String notifyUrl;
}
