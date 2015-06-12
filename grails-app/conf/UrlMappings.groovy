class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        //"/auth/login?" {
        //    render "rifa/auth/login"
        //}

        "/"(controller:"auth")
        "500"(view:'/error')
	}
}
