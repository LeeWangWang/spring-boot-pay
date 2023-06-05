package com.example.springbootpay.common.constants;

/**
 * @EnumName: PayWay
 * @Description: 支付方式
 * @Author: JoshLee
 * @Date: 2023/6/5 9:24
 * @Version: V1
 */
public enum PayWay {
    PC("PC,平板",(short)1), MOBILE("手机",(short)2);
    private Short code;
    private String name;

    PayWay(String name, Short code) {
        this.name = name;
        this.code = code;
    }

    public static String getName(Short code) {
        for (PayWay c : PayWay.values()) {
            if (c.code == code)
                return c.name;
        }
        return null;
    }

    public Short getCode() {
        return code;
    }

    public void setCode(Short code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
