package io.renren.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import io.renren.dao.StudentDao;
import io.renren.entity.StudentEntity;
import io.renren.service.StudentService;



@Service("studentService")
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;
	
	@Override
	public StudentEntity queryObject(Long sno){
		return studentDao.queryObject(sno);
	}
	
	@Override
	public List<StudentEntity> queryList(Map<String, Object> map){
		return studentDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return studentDao.queryTotal(map);
	}
	
	@Override
	public void save(StudentEntity student){
		studentDao.save(student);
	}
	
	@Override
	public void update(StudentEntity student){
		studentDao.update(student);
	}
	
	@Override
	public void delete(Long sno){
		studentDao.delete(sno);
	}
	
	@Override
	public void deleteBatch(Long[] snos){
		studentDao.deleteBatch(snos);
	}
	
}
