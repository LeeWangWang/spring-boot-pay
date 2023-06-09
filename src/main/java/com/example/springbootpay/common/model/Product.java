package com.example.springbootpay.common.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName: Product
 * @Description: 产品订单信息
 * @Author: JoshLee
 * @Date: 2023/6/5 8:21
 * @Version: V1
 */
@Data
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    private String productId; // 商品ID
    private String subject; // 订单描述
    private String body; // 商品描述
    private String totalFee; // 总金额（单位是分）
    private String outTradeNo; // 订单号（唯一）
    private String spbillCreateIp; // 发起人IP地址
    private String attach; //  附件数据：主要用于携带订单的自定义数据
    private Short payType; // 支付类型（1：支付宝 2：微信 3：银联）
    private Short payWay; // 支付方式（1：PC 平板 2：手机）
    private String frontUrl; // 前台回调地址 非扫码支付使用
}
