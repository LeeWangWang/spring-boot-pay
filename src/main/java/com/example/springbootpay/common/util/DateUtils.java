package com.example.springbootpay.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: DateUtils
 * @Description: 日期操作类
 * @Author: JoshLee
 * @Date: 2023/6/5 8:50
 * @Version: V1
 */
public class DateUtils {
    private final static SimpleDateFormat sdfYear = new SimpleDateFormat("yyyy");
    private final static SimpleDateFormat sdfDay = new SimpleDateFormat("yyyy-MM-dd");
    private final static SimpleDateFormat sdfDays = new SimpleDateFormat("yyyyMMdd");
    private final static SimpleDateFormat sdfTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * @Name: getTime
     * @Description: 获取yyyy-MM-dd HH:mm:ss格式
     * @Author: JoshLee
     */
    public static String getTime() {
        return sdfTime.format(new Date());
    }

    /**
     * @Name: getTimestamp
     * @Description: 获取时间戳
     * @Author: JoshLee
     */
    public static String getTimestamp() {
        return String.valueOf(System.currentTimeMillis() / 1000);
    }
}
