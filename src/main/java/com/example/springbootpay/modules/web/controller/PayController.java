package com.example.springbootpay.modules.web.controller;

import com.example.springbootpay.common.util.DateUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: PayController
 * @Description: 支付后台
 * @Author: JoshLee
 * @Date: 2023/6/5 10:49
 * @Version: V1
 */
@Api(tags = "支付后台")
@Controller
@RequestMapping(value = "pay")
public class PayController {
    private static final Logger logger = LoggerFactory.getLogger(PayController.class);

    /**
     * @Name: login
     * @Description: 登录函数
     * @Author: JoshLee
     */
    @ApiOperation(value = "登录")
    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public String login(String account, String password) {
        logger.info("登录");
        String param = "false";
        if ("admin".equals(account) && "111111".equals(password))
            param = "true";
        return param;
    }

    /**
     * @Name: main
     * @Description: 后台主界面展示
     * @Author: JoshLee
     */
    @ApiOperation(value = "后台展示")
    @RequestMapping(value = "main", method = RequestMethod.GET)
    public String main(Model model) {
        model.addAttribute("ip", "192.168.31.158");
        model.addAttribute("address", "大连");
        model.addAttribute("time", DateUtils.getTime());
        return "web/main";
    }
}
