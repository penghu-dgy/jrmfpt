package io.renren.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * InnoDB free: 11264 kB
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-05-17 15:23:34
 */
public class StudentEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Long sno;
	//
	private String sname;
	//
	private Long sage;
	//
	private String ssex;

	/**
	 * 设置：
	 */
	public void setSno(Long sno) {
		this.sno = sno;
	}
	/**
	 * 获取：
	 */
	public Long getSno() {
		return sno;
	}
	/**
	 * 设置：
	 */
	public void setSname(String sname) {
		this.sname = sname;
	}
	/**
	 * 获取：
	 */
	public String getSname() {
		return sname;
	}
	/**
	 * 设置：
	 */
	public void setSage(Long sage) {
		this.sage = sage;
	}
	/**
	 * 获取：
	 */
	public Long getSage() {
		return sage;
	}
	/**
	 * 设置：
	 */
	public void setSsex(String ssex) {
		this.ssex = ssex;
	}
	/**
	 * 获取：
	 */
	public String getSsex() {
		return ssex;
	}
}
