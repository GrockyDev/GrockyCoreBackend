package employee

import grails.transaction.Transactional

import com.trial.EmployeeMaster

@Transactional
class EmployeeService {

	
	def createEmployee(def req){
			
		println "inside service"
		
		println "name = " + req.JSON.ename
		
		EmployeeMaster ins = new EmployeeMaster()
		ins.empName = req.JSON.ename
		ins.empCode = System.currentTimeMillis()
		ins.deptName = "MEchanical" 
		ins.address = "chennai"
		
		ins.save(failOnError:true)
	}
}
