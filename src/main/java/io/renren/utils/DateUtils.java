package io.renren.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期处理
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2016年12月21日 下午12:53:33
 */
public class DateUtils {
	/** 时间格式(yyyy-MM-dd) */
	public final static String DATE_PATTERN = "yyyy-MM-dd";
	/** 时间格式(yyyy-MM-dd HH:mm:ss) */
	public final static String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
	
	public static String format(Date date) {
        return format(date, DATE_PATTERN);
    }

    public static String format(Date date, String pattern) {
        if(date != null){
            SimpleDateFormat df = new SimpleDateFormat(pattern);
            return df.format(date);
        }
        return null;
    }
    
    /**
     * 将当前时间推迟多少个月
     * @param startTime
     * @param month
     * @return
     */
    public static String getExpireByMonty(String startTime,int month){
		Calendar c = Calendar.getInstance(); 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String[] s = startTime.split("-");
		c.set(Calendar.YEAR, Integer.parseInt(s[0]));
		c.set(Calendar.MONTH, Integer.parseInt(s[1])-1);
		c.set(Calendar.DATE, Integer.parseInt(s[2]));		
		c.add(Calendar.MONTH, month);
		 Date end =c.getTime();
		 String s_end = sdf.format(end);
		 return s_end;
	}
    /**
     * 将当前时间推迟多少天
     * @param startTime
     * @param day
     * @return
     */
    public static String getExpireByDay(String startTime,int day){
		Calendar c = Calendar.getInstance(); 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String[] s = startTime.split("-");
		c.set(Calendar.YEAR, Integer.parseInt(s[0]));
		c.set(Calendar.MONTH, Integer.parseInt(s[1])-1);
		c.set(Calendar.DATE, Integer.parseInt(s[2]));
		c.add(Calendar.DATE, day);

		 Date end =c.getTime();
		 String s_end = sdf.format(end);
		 return s_end;
	}
    /**
     * 
     * @param startTime
     * @param minute
     * @return
     */
    public static String getExpireByMin(String startTime,int minute){
		Calendar c = Calendar.getInstance(); 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String[] s = startTime.split("-");
		c.set(Calendar.YEAR, Integer.parseInt(s[0]));
		c.set(Calendar.MONTH, Integer.parseInt(s[1])-1);
		c.set(Calendar.DATE, Integer.parseInt(s[2]));
		c.add(Calendar.MINUTE, minute);

		 Date end =c.getTime();
		 String s_end = sdf.format(end);
		 return s_end;
	}
}
