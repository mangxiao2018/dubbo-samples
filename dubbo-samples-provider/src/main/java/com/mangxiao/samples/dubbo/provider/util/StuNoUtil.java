package com.mangxiao.samples.dubbo.provider.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StuNoUtil {
    private static long stuNum = 0l;
    private static String date;

    /**
     * 生成学生编号
     * @return
     */
    public static synchronized String getStuNo() {
        String str = new SimpleDateFormat("yyMMddHHmm").format(new Date());
        if (date == null || !date.equals(str)) {
            date = str;
            stuNum = 0l;
        }
        stuNum++;
        long stuNo = Long.parseLong((date)) * 10000;
        stuNo += stuNum;
        return stuNo + "";
    }

    public static void main(String[] args){
        for (int i = 0; i < 1000; i++){
            System.out.println("学号:" + StuNoUtil.getStuNo());
        }
    }
}
