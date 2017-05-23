package io.renren.service;

import io.renren.entity.StudentEntity;

import java.util.List;
import java.util.Map;

/**
 * InnoDB free: 11264 kB
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-05-17 15:23:34
 */
public interface StudentService {
	
	StudentEntity queryObject(Long sno);
	
	List<StudentEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(StudentEntity student);
	
	void update(StudentEntity student);
	
	void delete(Long sno);
	
	void deleteBatch(Long[] snos);
}
