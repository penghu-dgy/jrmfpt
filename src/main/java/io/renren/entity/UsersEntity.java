package io.renren.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * InnoDB free: 10240 kB
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-05-23 10:58:22
 */
public class UsersEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Long phone;
	//
	private String pwd;
	//
	private String yzm;
	//
	private String yzmExpire;
	//
	private String role;
	//
	private String realname;
	//
	private Long age;
	//
	private String gender;
	//
	private String province;
	//
	private String city;
	//
	private String area;
	//
	private Long balance;
	//
	private Long refMoney;
	//
	private String picCareer;
	//
	private String identity;
	//
	private String picIdcardZ;
	//
	private String picIdcardF;
	//
	private String picHead;
	//
	private String telephone;
	//
	private String picPerCom;
	//
	private String picWorkcard;
	//
	private String picPersonalCard;
	//
	private String workOrg;
	//
	private String bank;
	//
	private String alipay;
	//
	private String wechat;
	//
	private String refLink;
	//
	private String refCode;
	//
	private String busDesc;
	//
	private String busTag;
	//
	private Long empState;
	//
	private Long custState;
	//
	private Long busState;
	//
	private String addTime;
	//
	private Long accountType;
	//
	private Long refereeCust;
	//
	private Long refereeBus;
	//
	private String bz1;
	//
	private String bz2;
	//
	private String bz3;
	//
	private Long bz4;

	/**
	 * 设置：
	 */
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	/**
	 * 获取：
	 */
	public Long getPhone() {
		return phone;
	}
	/**
	 * 设置：
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	/**
	 * 获取：
	 */
	public String getPwd() {
		return pwd;
	}
	/**
	 * 设置：
	 */
	public void setYzm(String yzm) {
		this.yzm = yzm;
	}
	/**
	 * 获取：
	 */
	public String getYzm() {
		return yzm;
	}
	/**
	 * 设置：
	 */
	public void setYzmExpire(String yzmExpire) {
		this.yzmExpire = yzmExpire;
	}
	/**
	 * 获取：
	 */
	public String getYzmExpire() {
		return yzmExpire;
	}
	/**
	 * 设置：
	 */
	public void setRole(String role) {
		this.role = role;
	}
	/**
	 * 获取：
	 */
	public String getRole() {
		return role;
	}
	/**
	 * 设置：
	 */
	public void setRealname(String realname) {
		this.realname = realname;
	}
	/**
	 * 获取：
	 */
	public String getRealname() {
		return realname;
	}
	/**
	 * 设置：
	 */
	public void setAge(Long age) {
		this.age = age;
	}
	/**
	 * 获取：
	 */
	public Long getAge() {
		return age;
	}
	/**
	 * 设置：
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * 获取：
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * 设置：
	 */
	public void setProvince(String province) {
		this.province = province;
	}
	/**
	 * 获取：
	 */
	public String getProvince() {
		return province;
	}
	/**
	 * 设置：
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * 获取：
	 */
	public String getCity() {
		return city;
	}
	/**
	 * 设置：
	 */
	public void setArea(String area) {
		this.area = area;
	}
	/**
	 * 获取：
	 */
	public String getArea() {
		return area;
	}
	/**
	 * 设置：
	 */
	public void setBalance(Long balance) {
		this.balance = balance;
	}
	/**
	 * 获取：
	 */
	public Long getBalance() {
		return balance;
	}
	/**
	 * 设置：
	 */
	public void setRefMoney(Long refMoney) {
		this.refMoney = refMoney;
	}
	/**
	 * 获取：
	 */
	public Long getRefMoney() {
		return refMoney;
	}
	/**
	 * 设置：
	 */
	public void setPicCareer(String picCareer) {
		this.picCareer = picCareer;
	}
	/**
	 * 获取：
	 */
	public String getPicCareer() {
		return picCareer;
	}
	/**
	 * 设置：
	 */
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	/**
	 * 获取：
	 */
	public String getIdentity() {
		return identity;
	}
	/**
	 * 设置：
	 */
	public void setPicIdcardZ(String picIdcardZ) {
		this.picIdcardZ = picIdcardZ;
	}
	/**
	 * 获取：
	 */
	public String getPicIdcardZ() {
		return picIdcardZ;
	}
	/**
	 * 设置：
	 */
	public void setPicIdcardF(String picIdcardF) {
		this.picIdcardF = picIdcardF;
	}
	/**
	 * 获取：
	 */
	public String getPicIdcardF() {
		return picIdcardF;
	}
	/**
	 * 设置：
	 */
	public void setPicHead(String picHead) {
		this.picHead = picHead;
	}
	/**
	 * 获取：
	 */
	public String getPicHead() {
		return picHead;
	}
	/**
	 * 设置：
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * 获取：
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * 设置：
	 */
	public void setPicPerCom(String picPerCom) {
		this.picPerCom = picPerCom;
	}
	/**
	 * 获取：
	 */
	public String getPicPerCom() {
		return picPerCom;
	}
	/**
	 * 设置：
	 */
	public void setPicWorkcard(String picWorkcard) {
		this.picWorkcard = picWorkcard;
	}
	/**
	 * 获取：
	 */
	public String getPicWorkcard() {
		return picWorkcard;
	}
	/**
	 * 设置：
	 */
	public void setPicPersonalCard(String picPersonalCard) {
		this.picPersonalCard = picPersonalCard;
	}
	/**
	 * 获取：
	 */
	public String getPicPersonalCard() {
		return picPersonalCard;
	}
	/**
	 * 设置：
	 */
	public void setWorkOrg(String workOrg) {
		this.workOrg = workOrg;
	}
	/**
	 * 获取：
	 */
	public String getWorkOrg() {
		return workOrg;
	}
	/**
	 * 设置：
	 */
	public void setBank(String bank) {
		this.bank = bank;
	}
	/**
	 * 获取：
	 */
	public String getBank() {
		return bank;
	}
	/**
	 * 设置：
	 */
	public void setAlipay(String alipay) {
		this.alipay = alipay;
	}
	/**
	 * 获取：
	 */
	public String getAlipay() {
		return alipay;
	}
	/**
	 * 设置：
	 */
	public void setWechat(String wechat) {
		this.wechat = wechat;
	}
	/**
	 * 获取：
	 */
	public String getWechat() {
		return wechat;
	}
	/**
	 * 设置：
	 */
	public void setRefLink(String refLink) {
		this.refLink = refLink;
	}
	/**
	 * 获取：
	 */
	public String getRefLink() {
		return refLink;
	}
	/**
	 * 设置：
	 */
	public void setRefCode(String refCode) {
		this.refCode = refCode;
	}
	/**
	 * 获取：
	 */
	public String getRefCode() {
		return refCode;
	}
	/**
	 * 设置：
	 */
	public void setBusDesc(String busDesc) {
		this.busDesc = busDesc;
	}
	/**
	 * 获取：
	 */
	public String getBusDesc() {
		return busDesc;
	}
	/**
	 * 设置：
	 */
	public void setBusTag(String busTag) {
		this.busTag = busTag;
	}
	/**
	 * 获取：
	 */
	public String getBusTag() {
		return busTag;
	}
	/**
	 * 设置：
	 */
	public void setEmpState(Long empState) {
		this.empState = empState;
	}
	/**
	 * 获取：
	 */
	public Long getEmpState() {
		return empState;
	}
	/**
	 * 设置：
	 */
	public void setCustState(Long custState) {
		this.custState = custState;
	}
	/**
	 * 获取：
	 */
	public Long getCustState() {
		return custState;
	}
	/**
	 * 设置：
	 */
	public void setBusState(Long busState) {
		this.busState = busState;
	}
	/**
	 * 获取：
	 */
	public Long getBusState() {
		return busState;
	}
	/**
	 * 设置：
	 */
	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}
	/**
	 * 获取：
	 */
	public String getAddTime() {
		return addTime;
	}
	/**
	 * 设置：
	 */
	public void setAccountType(Long accountType) {
		this.accountType = accountType;
	}
	/**
	 * 获取：
	 */
	public Long getAccountType() {
		return accountType;
	}
	/**
	 * 设置：
	 */
	public void setRefereeCust(Long refereeCust) {
		this.refereeCust = refereeCust;
	}
	/**
	 * 获取：
	 */
	public Long getRefereeCust() {
		return refereeCust;
	}
	/**
	 * 设置：
	 */
	public void setRefereeBus(Long refereeBus) {
		this.refereeBus = refereeBus;
	}
	/**
	 * 获取：
	 */
	public Long getRefereeBus() {
		return refereeBus;
	}
	/**
	 * 设置：
	 */
	public void setBz1(String bz1) {
		this.bz1 = bz1;
	}
	/**
	 * 获取：
	 */
	public String getBz1() {
		return bz1;
	}
	/**
	 * 设置：
	 */
	public void setBz2(String bz2) {
		this.bz2 = bz2;
	}
	/**
	 * 获取：
	 */
	public String getBz2() {
		return bz2;
	}
	/**
	 * 设置：
	 */
	public void setBz3(String bz3) {
		this.bz3 = bz3;
	}
	/**
	 * 获取：
	 */
	public String getBz3() {
		return bz3;
	}
	/**
	 * 设置：
	 */
	public void setBz4(Long bz4) {
		this.bz4 = bz4;
	}
	/**
	 * 获取：
	 */
	public Long getBz4() {
		return bz4;
	}
}
