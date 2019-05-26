/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: StringUtils
 * Author:   cretin
 * Date:     5/26/19 12:36
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.roll.utils;

/**
 * 〈〉
 *
 * @author cretin
 * @create 5/26/19
 * @since 1.0.0
 */
public class StringUtils {
    public static boolean isEmpty(String text) {
        if ( text == null || text.trim().equals("") ) {
            return true;
        }
        return false;
    }
}