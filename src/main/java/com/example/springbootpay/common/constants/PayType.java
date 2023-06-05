package com.example.springbootpay.common.constants;

/**
 * @EnumName: PayType
 * @Description: 支付类型
 * @Author: JoshLee
 * @Date: 2023/6/5 9:10
 * @Version: V1
 */
public enum PayType {
    ALI("支付宝", (short)1), WECHAT("微信",(short)2), UNION("银联",(short)3);

    private Short code;
    private String name;

    PayType(String name, short code) {
        this.name = name;
        this.code = code;
    }

    public static String getName(Short code) {
        for (PayType c : PayType.values()) {
            if (c.getCode() == code)
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
