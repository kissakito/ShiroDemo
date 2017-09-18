package service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import mapper.DeptMapper;
import pojo.Dept;

@Service
public class DeptServiceImpl implements DeptService {
	
	@Resource
	private DeptMapper deptMapper;

	//查询部门信息
	public List<Dept> findDeptList() {
		
		return deptMapper.findDeptList();
	}

	//改变状态
	public void updateState(Integer[] deptIds, int i) {
		//状态的改造
		for (Integer deptId : deptIds) {
			
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("deptId", deptId);
			map.put("state", i);
			deptMapper.updateState(map);
		}
	}

	@Override
	public void deleteDepts(String[] deptIds) {
		deptMapper.deleteDepts(deptIds);
		
	}

	@Override
	public void saveDept(Dept dept) {
		deptMapper.saveDept(dept);
		
	}

	@Override
	public Dept findDeptOne(String deptId) {
		
		return deptMapper.findDeptOne(deptId);
	}

	@Override
	public List<Dept> getDeptList() {
		
		return deptMapper.getDeptList();
	}

	@Override
	public void updateDept(Dept dept) {
		
		deptMapper.updateDept(dept);
	}
	
}
