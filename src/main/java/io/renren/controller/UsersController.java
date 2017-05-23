package io.renren.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.entity.UsersEntity;
import io.renren.service.UsersService;
import io.renren.utils.PageUtils;
import io.renren.utils.Query;
import io.renren.utils.R;


/**
 * InnoDB free: 10240 kB
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-05-23 10:58:22
 */
@RestController
@RequestMapping("users")
public class UsersController {
	@Autowired
	private UsersService usersService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("users:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<UsersEntity> usersList = usersService.queryList(query);
		int total = usersService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(usersList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{phone}")
	@RequiresPermissions("users:info")
	public R info(@PathVariable("phone") Long phone){
		UsersEntity users = usersService.queryObject(phone);
		
		return R.ok().put("users", users);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("users:save")
	public R save(@RequestBody UsersEntity users){
		usersService.save(users);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("users:update")
	public R update(@RequestBody UsersEntity users){
		usersService.update(users);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("users:delete")
	public R delete(@RequestBody Long[] phones){
		usersService.deleteBatch(phones);
		
		return R.ok();
	}
	
}
