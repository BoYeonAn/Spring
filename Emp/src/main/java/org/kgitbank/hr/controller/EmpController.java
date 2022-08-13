package org.kgitbank.hr.controller;
import java.util.List;

import org.kgitbank.hr.model.dao.IEmpRepository;
import org.kgitbank.hr.model.vo.DeptVO;
import org.kgitbank.hr.model.vo.EmpVO;
import org.kgitbank.hr.model.vo.JobVO;
import org.kgitbank.hr.model.vo.LocationVO;
import org.kgitbank.hr.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
public class EmpController {
	
	@Autowired
	private EmpService empService;

	
	@GetMapping({"/home","/"})
	public String home() {
		return "home";	
	}
	@GetMapping("/list")
	public String list(Model model) {
		List<EmpVO> empList=empService.getEmpList();
		model.addAttribute("empList",empList);
		return "list";
	}
	
	@GetMapping("/info")
	public String info(Model model, int empId) {
		EmpVO emp= empService.getEmpInfo(empId);
		model.addAttribute("emp",emp);
		return "info";
	}
	@GetMapping("/search")
	public String searchPage() {
		return "search";
	}
	@GetMapping("/deptSearch")
	public String searchByDeptId(Model model, int deptId) {
		List<EmpVO> empList = empService.getEmpListByDeptId(deptId);
		model.addAttribute("empList",empList);
		return "list";
	}
	@GetMapping("/empSearch")
	public String searchByEmptId(Model model, int empId) {
		EmpVO emp = empService.getEmpInfo(empId);
		model.addAttribute("emp",emp);
		return "Info";
}
	@GetMapping("/insert")
	public String insertEmp(Model model) {
		List<JobVO> jobList=empService.getJobList();
		List<EmpVO> manList=empService.getManagerList();
		List<DeptVO> deptList=empService.getDeptList();
		model.addAttribute("jobList",jobList);
		model.addAttribute("manList",manList);
		model.addAttribute("deptList",deptList);
		return "insert";
	}
	
	@PostMapping("/insert")
	public String insertEmp(EmpVO emp) {
		empService.insertEmp(emp);
		return "redirect:/list";
	}
	
	@GetMapping("/job/insert")
	public String insertJob() {
		return "jobInsert";
	}
	@PostMapping("/job/insert")
	public String insertJob(JobVO job) {
		empService.insertJob(job);
		return "redirect:/insert";
	}
	@GetMapping("/job/list")
	public String getJobList(Model model) {
		List<JobVO> jobList=empService.getJobList();
		model.addAttribute("jobList",jobList);
		return "jobList";
	}
	@GetMapping("/jobInfo/{jobId}")
		public String getJobInfo(@PathVariable String jobId, Model model) {
			JobVO job=empService.getJobInfo(jobId);
			model.addAttribute("job",job);
			return "jobInfo";
		
	}
	@GetMapping("/update/{employeeId}")
	public String updateEmp(@PathVariable int employeeId, Model model) {
		List<JobVO> jobList=empService.getJobList();
		List<EmpVO> manList=empService.getManagerList();
		List<DeptVO> deptList=empService.getDeptList();
		model.addAttribute("jobList",jobList);
		model.addAttribute("manList",manList);
		model.addAttribute("deptList",deptList);
		EmpVO emp=empService.getEmpInfo(employeeId);
		model.addAttribute("emp",emp);
		return "insert";
	}
	
	@PostMapping("/update")
	public String updateEmp(EmpVO emp) {
		empService.updateEmp(emp);
		return "redirect:/info?empId="+emp.getEmployeeId();
	}
	@GetMapping("/delete")
	public String deleteEmp(int employeeId) {
		empService.deleteEmp(employeeId);
		return "redirect:/list";
	}
	@GetMapping("/dept/insert")
	public String inserDept(Model model) {
		List<LocationVO> localList=empService.getLocalList();
		model.addAttribute("localList",localList);
		return "deptInsert";
	}
	@PostMapping("/dept/insert")
	public String insertDept(DeptVO dept) {
		empService.insertDept(dept);
		return "redirect:/deptList";
	}
	@GetMapping("/ajax")
	public String ajax() {
		return "ajax";
	}
	@GetMapping(value="/example", produces="application/text;charset=UTF-8")
	@ResponseBody
	public String example(String userId) {
		return "ajax 데이터:"+userId;
	}
}