package rifa

class Seller extends User{
	Integer cantSales = 0
	
    static constraints = {
    }

    def getRafflesSold() {
    	Raffle.findAllBySeller(this)
    }
}
