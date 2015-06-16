package rifa

class DrawController {

	def drawService
    def show() 
    {
    	def winner = drawService.getWinnerRaffle()
    	def date = new Date()
    	def draw = new Draw(winner.number, date, winner, null, null)
    	//drawService.sendEmail(winner.email, winner.name)
    	[winner:winner]
    }
}
