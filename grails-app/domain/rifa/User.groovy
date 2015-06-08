package rifa

class User {
	String userName
	String firstName
	String lastName
	String email
	String phone


    static constraints = {
    	userName(blank: false)
        email(blank: false, email: true)
        phone(blank: false)
    }
}
