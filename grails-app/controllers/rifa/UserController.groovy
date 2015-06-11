package rifa

class UserController {

    def index() {
    	
    }

    def login() {
        render(view: "login")
    }

    def signup() {
        render(view: "signup")
    }

    def save(){
        if(params.password == params.confirmPassword){
            def user
            if(params.selRole == 'Admin'){
            	user = new Administrator(params)
            }
        	else{
                if(params.selRole == 'Seller'){
                    user = new Seller(params)
                }
                else{
                    user = new Buyer(params)
                }
            }
            user.properties = params
           	user.save()
        }
    }

    def show() {
     	[users:User.listOrderByLastName()]
    }
}
