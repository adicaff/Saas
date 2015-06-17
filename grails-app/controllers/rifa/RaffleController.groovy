package rifa

class RaffleController {

    def sale() {
        if(session.user)
        	render(view: "sale")
        else
            redirect controller: 'auth', action: 'login'
     }

     def create() {
        if(session.user){
            def seller = Seller.get(session.user.id)
            def raffle = new Raffle(params)
            raffle.seller = session.user
            raffle.properties = params
           	raffle.save()
            seller.cantSales = seller.cantSales + 1
        }
        else
            redirect controller: 'auth', action: 'login'
     }

     def index() {
        if(session.user)    
         	[raffles:Raffle.listOrderByNumber()]
        else
            redirect controller: 'auth', action: 'login'
     }

     def show() {
        if(session.user){
            def raffle = Raffle.get(params.id)
            [raffle:raffle]
        }
        else{
            redirect controller: 'auth', action: 'login'
        }
     }
}
