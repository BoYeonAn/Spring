package org.kgitbank.hr.service;

import java.util.List;

import org.kgitbank.hr.model.dao.IEmpRepository;
import org.kgitbank.hr.model.vo.DeptVO;
import org.kgitbank.hr.model.vo.EmpVO;
import org.kgitbank.hr.model.vo.JobVO;
import org.kgitbank.hr.model.vo.LocationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
	@Autowired
	@Qualifier("IEmpRepository")
	IEmpRepository empRepository;
		
	public List<EmpVO> getEmpList(){
		return empRepository.getEmpList();
	}
	public EmpVO getEmpInfo(int empId) {
		return empRepository.getEmpInfo(empId);
		
	}
	public List<EmpVO> getEmpListByDeptId(int deptId){
		return empRepository.getEmpListByDeptId(deptId);
		
	}
	public List<JobVO> getJobList(){
		return empRepository.getJobList();
		
	}
	public List<EmpVO> getManagerList(){
		return empRepository. getManagerList();
		
	}
	public List<DeptVO> getDeptList(){
		return empRepository.getDeptList();
		
	}
	public void insertEmp(EmpVO emp) {
		empRepository.insertEmp(emp);
	}

	public void insertJob(JobVO job) {
		
	}
	public JobVO getJobInfo(String jobId) {
		return empRepository.getJobInfo(jobId);
	}
	public void updateEmp(EmpVO emp) {
		empRepository.updateEmp(emp);
	}
	public void deleteEmp(int employeeId) {
		
		
	}
	public List<LocationVO> getLocalList(){
		return empRepository.getLocalList(); 
	}
	public void insertDept(DeptVO dept) {
		// TODO Auto-generated method stub
		
	}
}

