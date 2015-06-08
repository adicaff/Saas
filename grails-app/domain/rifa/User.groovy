package rifa

class User {
	String userName
	String password
	String firstName
	String lastName
	String email
	String phone

    static constraints = {
    	userName(unique: true, blank: false)
        email(blank: false, email: true)
        phone(blank: false)
    }
}