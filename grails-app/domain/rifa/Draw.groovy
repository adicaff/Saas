package rifa

class Draw {
	Integer winnerNumber
	Date date
	Raffle winnerRaffle
	Raffle firstAproximation
	Raffle secondAproximation
    static constraints = { 
    	winnerNumber(blank: false)
    	winnerRaffle(blank: false)
    }

    def Draw(Integer number, Date date, Raffle winner, Raffle first, Raffle second) {	
    	def draw = new Draw()
    	draw.winnerNumber = number
    	draw.winnerRaffle = winner
    	draw.date = date
    	draw.firstAproximation = first
    	draw.secondAproximation = second
    }
}
