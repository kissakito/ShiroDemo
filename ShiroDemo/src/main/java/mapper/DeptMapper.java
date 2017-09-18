package mapper;

import java.util.List;
import java.util.Map;

import pojo.Dept;

public interface DeptMapper {
	//查询所有的部门
	public List<Dept> findDeptList();
	
	//改变状态
	public void updateState(Map<String, Object> map);
	
	//删除部门
	public void deleteDepts(String[] deptIds);
	
	//部门保存
	public void saveDept(Dept dept);
	
	//查询单个部门
	public Dept findDeptOne(String deptId);
	
	//获取部门下拉列表
	public List<Dept> getDeptList();
	
	//部门更新
	public void updateDept(Dept dept);

	
}
