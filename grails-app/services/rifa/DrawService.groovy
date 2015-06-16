package rifa

import grails.transaction.Transactional
import java.util.Random

@Transactional
class DrawService {

	private Random random = new Random();
    def getWinnerRaffle() {
    	println "&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&"
    	println "ENTROOOOOO"
    	def raffles = Raffle.getAll()
    	int index = random.nextInt(raffles.size())
    	println "&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&"
    	println index
	    raffles.get(index)
    }
}
