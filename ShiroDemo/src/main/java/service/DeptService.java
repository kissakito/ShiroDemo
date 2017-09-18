package service;

import java.util.List;

import pojo.Dept;

public interface DeptService {
	//查询所有的部门
	public List<Dept> findDeptList();
	
	//改变状态
	public void updateState(Integer[] deptIds, int i);
	
	//删除部门
	public void deleteDepts(String[] deptIds);
	
	//保存部门信息
	public void saveDept(Dept dept);
	
	//查询单个部门信息
	public Dept findDeptOne(String deptId);
	
	//获取部门下拉列表
	public List<Dept> getDeptList();

	public void updateDept(Dept dept);

}
