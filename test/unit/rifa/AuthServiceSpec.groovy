package rifa

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(AuthService)
@Mock([User, Administrator, AuthService])
class AuthServiceSpec extends Specification {
    def setup() {
    	
    }

    def cleanup() {
    }

    void "test validateUser"() {
    	given:
    		def u = new Administrator(userName: "admin", password: "admin", 
                             firstName: "admin", lastName: "admin", 
                             phone: "099212121", email: "admin@admin.com").save(flush: true)
    	when:
    	//service.params['userName'] = 'admin'
    	//params['password'] = 'admin'
    	def user = service.validateUser('admin', 'admin')

    	then:
    	user!=null
    	user.userName == "admin"
    }

    void "test unvalidUser"() {
    	given:
    		def u = new Administrator(userName: "admin", password: "admin", 
                             firstName: "admin", lastName: "admin", 
                             phone: "099212121", email: "admin@admin.com").save(flush: true)
    	when:
    	//service.params['userName'] = 'admin'
    	//params['password'] = 'admin'
    	def user = service.validateUser('admin', 'xxxx')

    	then:
    	user==null
    	//user.userName == "admin"
    }

    void "test emptyUser"() {
    	given:
    		def u = new Administrator(userName: "admin", password: "admin", 
                             firstName: "admin", lastName: "admin", 
                             phone: "099212121", email: "admin@admin.com").save(flush: true)
    	when:
    	//service.params['userName'] = 'admin'
    	//params['password'] = 'admin'
    	def user = service.validateUser('', 'xxxx')

    	then:
    	user==null
    	//user.userName == "admin"
    }
}
