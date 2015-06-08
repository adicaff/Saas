class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/user/login?" {
            render "rifa/user/login"
        }

        "/"(view:"user/index")
        "500"(view:'/error')
	}
}
