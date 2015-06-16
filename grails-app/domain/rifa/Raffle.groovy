package rifa

class Raffle {
	Integer number
	static belongsTo = [seller: Seller]
	Date purchaseDate
	Date expirationDate
    String email
    String name
    String phone
    String document

    static constraints = {
    	number(unique: true, blank: false)
    	seller(blank: false)
    	purchaseDate(blank: false)
        email(blank: false)
        name(blank: false)
        phone(blank: false)
        document(blank: false)
     }
}