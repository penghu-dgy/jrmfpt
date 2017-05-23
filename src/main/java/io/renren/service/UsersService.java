package io.renren.service;

import io.renren.entity.UsersEntity;

import java.util.List;
import java.util.Map;

/**
 * InnoDB free: 10240 kB
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-05-23 10:58:22
 */
public interface UsersService {
	
	UsersEntity queryObject(Long phone);
	
	List<UsersEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(UsersEntity users);
	
	void update(UsersEntity users);
	
	void delete(Long phone);
	
	void deleteBatch(Long[] phones);
}
