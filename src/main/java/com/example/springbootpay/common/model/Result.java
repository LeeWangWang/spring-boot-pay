package com.example.springbootpay.common.model;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: Result
 * @Description: 页面响应结果类
 * @Author: JoshLee
 * @Date: 2023/6/5 8:32
 * @Version: V1
 */
public class Result extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    public Result() {
        put("code", 0);
    }

    public static Result error() {
        return error(500, "未知异常，请联系管理员");
    }

    public static Result ok(Object msg) {
        Result r = new Result();
        r.put("msg", msg);
        return r;
    }

    public static Result ok(Map<String, Object> map) {
        Result r = new Result();
        r.putAll(map);
        return r;
    }

    public static Result ok() {
        Result r = new Result();
        r.put("msg", "操作成功");
        return r;
    }

    public static Boolean isOk(Result r) {
        if (r.get("code").toString().equals("0")){
            return true;
        }
        return false;
    }

    /**
     * @Name: error
     * @Description: 设定报错信息
     * @Author: JoshLee
     */
    private static Result error(int code, String msg) {
        Result r = new Result();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    @Override
    public Result put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
