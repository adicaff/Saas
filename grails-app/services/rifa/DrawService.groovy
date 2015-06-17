package rifa

import grails.transaction.Transactional
import java.util.Random

@Transactional
class DrawService {

	def mailService
	private Random random = new Random();
    def Raffle getWinnerRaffle() {
    	def raffles = Raffle.getAll()
    	int index = random.nextInt(raffles.size())
	    raffles.get(index)
    }

    def Raffle launchDraw() {
        Raffle winner = getWinnerRaffle()
        def date = new Date()
        def draw = new Draw(winner.number, date, winner, null, null)
        sendEmail(winner)
        return winner
    }

    def sendEmail(Raffle winner)	{
    	mailService.sendMail {   
    		async true
	  		to winner.email
			subject "Tu rifa ha ganado en Rifapp"
			body """Cómo estas ${winner.name}? 
Tu rifa número: ${winner.number}, ha salido sorteada.

Comunicate con ${winner.seller.userName} para acordar la entrega de tu premio.

Contacto ${winner.seller.userName}:
Nombre: ${winner.seller.firstName} ${winner.seller.lastName}
Email: ${winner.seller.email}
Telefono: ${winner.seller.phone}

Muchas gracias y felicitaciones de parte del equipo de Rifapp!!!


Te invitamos a conocer nuestro sitio: http://rifapp.herokuapp.com/"""
		}
    }
}
