package rifa

class Raffle {
	Integer number
	static belongsTo = [buyer: Buyer, seller: Seller]
	Date purchaseDate
	Date expirationDate

    static constraints = {
    	number(blank: false)
    	buyer(blank: false)
    	seller(blank: false)
    	purchaseDate(blank: false)
     }
}