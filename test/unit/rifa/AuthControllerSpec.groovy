package rifa

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(AuthController)
@Mock([User, Administrator, AuthService])
class AuthControllerSpec extends Specification {

    def setup() {
    	def user = new Administrator(userName: "admin", password: "admin", 
                             firstName: "admin", lastName: "admin", 
                             phone: "099212121", email: "admin@admin.com").save(flush: true)
    }

    def cleanup() {
    	//Administrator.remove(0)
    }

    void "test login redirection"() {
    	when:
    	params['userName'] = 'admin'
    	params['password'] = 'admin'
    	controller.login()

    	then:
    	view == '/user/show'	
    }
}
