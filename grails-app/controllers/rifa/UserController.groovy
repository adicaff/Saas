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

    def create() {
       	def user = new User(params)
       	user.save()
    }

    def save(){
    	def user = new User(params)
    	user.properties = params
       	user.save()
    }

    def show() {
     	[users:User.listOrderByLastName()]
    }
}
