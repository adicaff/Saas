package rifa

class Buyer extends User{
	static hasMany = [raffles: Raffle]
    static constraints = {
    }
}
