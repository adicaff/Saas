package rifa

class UserController {

    def index() {
    	if(session.user.getClass() == rifa.Administrator)
            [users:User.listOrderByLastName()]
        else
            redirect controller: 'auth', action: 'login'
    }

    def signup() {
        if(session.user)
            redirect controller: 'user', action: 'show'
        else
            render(view: "signup")
    }

    def signout() {
        session.user = null
        redirect controller: 'auth', action: 'login'       
    }

    def save(){
        if(params.password == params.confirmPassword){
            def user
            if(params.selRole == 'Administrator'){
            	user = new Administrator(params)
            }
        	else{
                user = new Seller(params)
            }
            user.properties = params
           	user.save()
            session.user = user
        }
    }

    def show() {
        if(session.user)
         	[users:User.listOrderByLastName()]
        else
            redirect controller: 'auth', action: 'login'
    }

    def delete() {
        if(session.user.id == User.get(params.id).id){
            session.user = null
        }
        def user = User.get(params.id)
        user.delete(flush: true)
        redirect controller: 'user', action: 'index'
    }
}