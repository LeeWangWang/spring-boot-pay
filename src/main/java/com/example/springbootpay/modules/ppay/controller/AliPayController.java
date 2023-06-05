package com.example.springbootpay.modules.ppay.controller;

import com.example.springbootpay.common.model.Product;
import com.example.springbootpay.common.model.Result;
import com.example.springbootpay.modules.ppay.service.AliPayService;
import com.example.springbootpay.modules.ppay.util.PayUtils;
import com.yungouos.pay.util.PaySignUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName: AliPayController
 * @Description: 个人支付宝支付
 * @Author: JoshLee
 * @Date: 2023/6/5 15:23
 * @Version: V1
 */
@RequestMapping("/ppay")
@RestController
public class AliPayController {
    private AliPayService aliPayService;
    private PayUtils payUtils;

    /**
     * @Name: wxPay
     * @Description: 生成支付二维码
     * @Author: JoshLee
     */
    public Result wxPay(Product product) {
        return aliPayService.aliPay();
    }

    public String aliNotify(HttpServletRequest request) {
        try {
            String key = payUtils.getAliPayProperties.getKey();
            boolean flag = PaySignUtil.checkNotifySign(request, key);
            if (flag) {
                String outTradeNo = request.getParameter("outTradeNo");
                System.out.println("订单编号为：" + outTradeNo);
                /*
                * 数据库相关操作
                */
                return "SUCCESS";
            } else {
                return "ERROR";
            }
        } catch (Exception e) {
            return "ERROR";
        }
    }
}
