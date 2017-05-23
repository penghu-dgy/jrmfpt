package io.renren.api;

import io.renren.entity.UserEntity;
import io.renren.entity.UsersEntity;
import io.renren.service.TokenService;
import io.renren.service.UsersService;
import io.renren.utils.DateUtils;
import io.renren.utils.R;
import io.renren.utils.annotation.IgnoreAuth;
import io.renren.utils.annotation.LoginUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * API测试接口
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-03-23 15:47
 */


@RestController
@RequestMapping("/api")
@Api("项目用户接口")
public class ApiUsersController {
	@Autowired
	private UsersService usersService;
	
	@Autowired
	private TokenService tokenService;
	

	@IgnoreAuth
    @PostMapping("addyzm")

    public R addyzm(Long phone){
		System.out.println("phone="+phone);
		//1判断phone是否存在，如果存在修改，不存在，插入
		UsersEntity u =usersService.queryObject(phone);
		System.out.println("u="+u);
    	if(u==null){
    		//插入记录
    		UsersEntity users = new UsersEntity();
    		users.setPhone(phone);
    		users.setYzm("123");
    		String currentTime= DateUtils.format(new Date(), DateUtils.DATE_PATTERN);
    		
    		users.setYzmExpire(DateUtils.getExpireByMin(currentTime, 10));
    		
    		usersService.save(users);
    	}else {
    		//修改记录,跟新过期时间
    		
    		u.setYzm("123");
    		String currentTime= DateUtils.format(new Date(), DateUtils.DATE_PATTERN);
    		
    		u.setYzmExpire(DateUtils.getExpireByMin(currentTime, 10));
    		usersService.update(u);
    		
    		
    		
    	}
    	
    	//点击获取验证码的时候，先判断该手机号是否存在，如果存在，更新验证码和过期时间，不存在，插入验证码和手机号以及过期时间
    	return R.ok();
    }

    /**
     * 添加用户信息（实现用户信息的录入，录入的是电话号码和对应的区域信息）
     */
	@IgnoreAuth
    @PostMapping("addUser")
    
    public R addUser(Long phone,String province,String city,String yzm,String pwd){
    	//根据电话号码，跟新该电话号码所对应的对象
    	System.out.println("phone="+phone+" province="+province+"city = "+city);
        UsersEntity users =usersService.queryObject(phone);
        
        users.setCity(city);
        users.setProvince(province);
        users.setYzm(yzm);
        users.setPwd(pwd);
        users.setRole("10");//设置客户角色
        users.setCustState(1L);//1客户状态为正常
    	//usersService.save(users);
    	usersService.update(users);
    	//点击获取验证码的时候，先判断该手机号是否存在，如果存在，更新验证码和过期时间，不存在，插入验证码和手机号以及过期时间
    	return R.ok();
    }
	
	
	@IgnoreAuth
    @PostMapping("loginUsers")
    
    public R loginUsers(Long phone,String pwd){
    	//根据电话号码，跟新该电话号码所对应的对象
    	System.out.println("phone="+phone+"pwd = "+pwd);
        UsersEntity users =usersService.queryObject(phone);
        if(users==null){
        	R r = R.ok();
        	r.put("code", "101");
        	r.put("msg", "login fail");
        	return r;
        }else {
        	//返回token
        	
        	Map<String, Object> map = tokenService.createToken(phone);
        	return R.ok(map);
        }
       
    	
    }

   
}
