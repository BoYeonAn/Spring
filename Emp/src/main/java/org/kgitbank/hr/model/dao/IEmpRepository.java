package org.kgitbank.hr.model.dao;
import java.util.List;

import org.kgitbank.hr.model.vo.DeptVO;
import org.kgitbank.hr.model.vo.EmpVO;
import org.kgitbank.hr.model.vo.JobVO;
import org.kgitbank.hr.model.vo.LocationVO;
public interface IEmpRepository {

	List<EmpVO> getEmpList();
	EmpVO getEmpInfo(int empId);
	void insertEmp(EmpVO emp);
	void updateEmp(EmpVO emp);
	void deleteEmp(int empId);
	List<EmpVO> getEmpListByDeptId(int deptId);
	List<JobVO> getJobList();
	List<EmpVO> getManagerList();
	List<DeptVO> getDeptList();
	void insertJob(JobVO job);
	JobVO getJobInfo(String jobId);
	List<LocationVO> getLocalList();
	
}