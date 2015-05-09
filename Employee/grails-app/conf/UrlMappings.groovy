class UrlMappings {

	static mappings = {
		
		"/employee/create"(controller:"employee" ,action:"createEmployee", method:"POST")
		
		
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
