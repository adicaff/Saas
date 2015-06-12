package rifa

class RaffleController {

    def sale() {
    	render(view: "sale")
     }

     def create() {
        def seller = Seller.get(session.user.id)
        def raffle = new Raffle(params)
        raffle.seller = session.user
        raffle.properties = params
       	raffle.save()
     }

     def index() {
     	[raffles:Raffle.listOrderByNumber()]
     }
}
