package employee

import grails.rest.RestfulController

class EmployeeController extends RestfulController{

	static responseFormats = ['json', 'xml']

	def employeeService
    
	def createEmployee(){
		//request 
		//response
		//session
		//params
		
		println "inside controller"
		
		def res = employeeService.createEmployee(request)
		
		respond res , status:202
		
	}
	
}
