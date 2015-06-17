package rifa

class Draw {
	Integer winnerNumber
	Date date
	Raffle winnerRaffle
    static constraints = { 
    	winnerNumber(blank: false)
    	winnerRaffle(blank: false)
    }

    def Draw(Integer number, Date date, Raffle winner) {	
    	def draw = new Draw()
    	draw.winnerNumber = number
    	draw.winnerRaffle = winner
    	draw.date = date
    }
}
