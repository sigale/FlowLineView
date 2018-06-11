package com.core.sigel.sibase.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author sigel
 * @version 1.0
 * @date 2018/6/1 11:36
 * @copyRight 四川金信石信息技术有限公司
 * @since 1.0
 */
public class DateTimeUtils {

    public static final String YYYY_MM_DD = "yyyy-MM-dd";
    public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM_dd HH:mm:ss";

    public static String getCurrDateTime(){
        SimpleDateFormat format = new SimpleDateFormat(YYYY_MM_DD_HH_MM_SS);
        Date currDate = new Date();
        return  format.format(currDate);
    }
}
