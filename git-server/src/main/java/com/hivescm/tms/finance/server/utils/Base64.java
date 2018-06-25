package com.hivescm.tms.finance.server.utils;

import java.io.UnsupportedEncodingException;

/**
 * @author 杨彭伟
 * @date 2018-02-24 16:40
 */
public class Base64 {
    public Base64() {
    }

    public static String getBASE64(String s) {
        if (s == null) {
            return null;
        } else {
            try {
                return getBASE64(s.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException var2) {
                var2.printStackTrace();
                return null;
            }
        }
    }

    public static String getBASE64(byte[] b) {
        byte[] rb = org.apache.commons.codec.binary.Base64.encodeBase64(b);
        if (rb == null) {
            return null;
        } else {
            try {
                return new String(rb, "UTF-8");
            } catch (UnsupportedEncodingException var3) {
                var3.printStackTrace();
                return null;
            }
        }
    }

    public static String getFromBASE64(String s) {
        if (s == null) {
            return null;
        } else {
            try {
                byte[] b = getBytesBASE64(s);
                return b == null ? null : new String(b, "UTF-8");
            } catch (UnsupportedEncodingException var2) {
                var2.printStackTrace();
                return null;
            }
        }
    }

    public static byte[] getBytesBASE64(String s) {
        if (s == null) {
            return null;
        } else {
            try {
                return org.apache.commons.codec.binary.Base64.decodeBase64(s.getBytes("UTF-8"));
            } catch (Exception var2) {
                return null;
            }
        }
    }
}
