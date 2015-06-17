package rifa

class AutoDrawJob {
    static triggers = {
      //simple name:'simpleTrigger', startDelay:10000, repeatInterval: 30000
      cron name: 'myTrigger', startDelay:10000, cronExpression:"0 0 22 ? * FRI" 
    }

    def drawService
    def execute() {
    	println "JOb Running!!"
        def raffle = drawService.launchDraw()
        println raffle.number
    }
}