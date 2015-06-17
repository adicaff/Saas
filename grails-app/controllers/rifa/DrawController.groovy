package rifa

class DrawController {

	def drawService
    def show() 
    {
    	if(session.user){
        if(Raffle.getAll()){
            def winner = drawService.launchDraw()
    	      [winner:winner]
        }
        else{
        	//redirect controller: 'draw', action: 'error'	
          render view: 'error'
        }
   		}
   		else
   			redirect controller: 'auth', action: 'login'
    }
}