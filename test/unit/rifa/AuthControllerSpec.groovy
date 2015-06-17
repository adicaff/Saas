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
    
    }

    def cleanup() {
    	//Administrator.remove(0)
    }

    void "test login redirection"() {
        given:
            controller.authService = [ 
                validateUser: { u, p -> new User(userName: u, password: p)}
            ]
    	when:
    	   controller.params['userName'] = 'admin'
    	   controller.params['password'] = 'admin'
    	   controller.login()

    	then:
    	   response.redirectedUrl == '/user/show'	
    }
}
