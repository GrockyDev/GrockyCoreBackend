package com.trial

import org.bson.types.ObjectId


class EmployeeMaster {

	static mapWith = "mongo"
	
    static constraints = {
    }
	
	
	ObjectId id
	String empName
	String empCode
	String deptName
	String address
	
	
	
}
