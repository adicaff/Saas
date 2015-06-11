package rifa

import grails.transaction.Transactional

@Transactional
class AuthService {
	static Map<String,User> guidMap = new HashMap<String,User>()

    def validateUser(String userName, String pass) {
    	return User.findByUserNameAndPassword(userName, pass)
    }
    def getToken(User user) {
    	String id = UUID.randomUUID().toString()
    	guidMap.id = user
    	return id
    }
}
