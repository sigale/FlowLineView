package com.core.sigel.sibase.utils;

import android.text.TextUtils;

/**
 * @author sigel
 * @version 1.0
 * @date 2018/6/7 18:05
 * @copyRight 四川金信石信息技术有限公司
 * @since 1.0
 */
public class StringUtils  {
    public static String cleanString(String str){
        return cleanString(str,null);
    }
    public static String cleanString(String str,String replace){
        String result = str;
        if (TextUtils.isEmpty(str)){
            if (TextUtils.isEmpty(replace)){
                result = replace;
            }else{
                result = "";
            }
        }
        return result;
    }
}
