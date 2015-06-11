package rifa

class AuthController {

	def authService
    def login() {
    	def user = authService.validateUser(params.userName,params.password) 
    	if(user) {
    		session.user = user
            println user
    		redirect controller: 'user', action: 'index'
    		//def token = authService.getToken(user)
    		//render token
    	}
        println 'no logeo'
     }
}
