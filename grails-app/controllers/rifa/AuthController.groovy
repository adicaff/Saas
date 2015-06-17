package rifa

class AuthController {

	def authService
    
    def login() {
    	if(session.user){
            redirect controller: 'user', action: 'show'
        }
        else{
            def user = authService.validateUser(params.userName,params.password) 
        	if(user) {
        		session.user = user
        		redirect controller: 'user', action: 'show'
            }
    	}
     }
}