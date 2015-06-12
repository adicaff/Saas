package rifa

class Raffle {
	Integer number
	static belongsTo = [seller: Seller]
	Date purchaseDate
	Date expirationDate
    String email

    static constraints = {
    	number(blank: false)
    	//buyer(blank: false)
    	seller(blank: false)
    	purchaseDate(blank: false)
     }
}