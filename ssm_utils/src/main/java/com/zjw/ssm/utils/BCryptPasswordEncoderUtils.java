package com.zjw.ssm.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * 加密测试
 */
public class BCryptPasswordEncoderUtils {

    private static BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    public static String encodePassword(String password){
        return bCryptPasswordEncoder.encode(password);
    }

    public static void main(String[] args) {
        String password = "111";
        //每次加密结果都不一样
        //$2a$10$OqkE/CNDdMHrHMLq2/XY6u06iAoaxR5ACzAInA5FP/WuvhyQFrrpS
        String pwd = encodePassword(password);
        System.out.println(pwd);
    }

}
