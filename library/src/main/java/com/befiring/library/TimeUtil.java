package com.befiring.library;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Wang Meng on 2017/8/24.
 */

/**
 * 时间相关工具类
 */
public class TimeUtil {

    private static final String DEFAULT_FORMAT ="yyyy-MM-dd HH:mm:ss";

    public static String getNow(){
        return getNow(DEFAULT_FORMAT);
    }

    public static String getNow(String format){
        Date date=new Date();
        SimpleDateFormat formatter=new SimpleDateFormat(format, Locale.CHINA);
        return formatter.format(date);
    }
}
