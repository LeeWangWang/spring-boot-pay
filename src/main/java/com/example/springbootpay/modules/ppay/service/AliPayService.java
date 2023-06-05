package com.example.springbootpay.modules.ppay.service;

import com.example.springbootpay.common.model.Result;

/**
 * @InterfaceName: AliPayService
 * @Description: 支付宝支付
 * @Author: JoshLee
 * @Date: 2023/6/5 15:25
 * @Version: V1
 */
public interface AliPayService {
    Result aliPay();
}
