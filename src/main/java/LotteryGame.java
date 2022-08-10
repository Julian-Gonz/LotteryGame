public class LotteryGame {

    public static void main(String[] args){
        MegaMillionsLotto aMegaMillionsLotto = new MegaMillionsLotto();
        aMegaMillionsLotto.getUserPicks();
        int matchingNums = aMegaMillionsLotto.checkLotteryMatch();  //Matches your correct guesses with prize
        if(matchingNums == 3 && aMegaMillionsLotto.getUserPowerBall()
                                != aMegaMillionsLotto.getWinningPowerBall()){
            System.out.println("Congratulations! You won a free ticket.");
        }
        else if(matchingNums ==3 && aMegaMillionsLotto.getUserPowerBall()
                                    == aMegaMillionsLotto.getWinningPowerBall()){
            System.out.println("Congratulations! You won $50.");
        }
        else if(matchingNums == 4 && aMegaMillionsLotto.getUserPowerBall()
                                    != aMegaMillionsLotto.getWinningPowerBall()){
            System.out.println("Congratulations! You won $100.");
        }
        else if(matchingNums ==4 && aMegaMillionsLotto.getUserPowerBall()
                                    == aMegaMillionsLotto.getWinningPowerBall()){
            System.out.println("Congratulations! You won $1000.");
        }
        else if(matchingNums == 5 && aMegaMillionsLotto.getUserPowerBall()
                                    != aMegaMillionsLotto.getWinningPowerBall()){
            System.out.println("Congratulations! You won $500.");
        }
        else if(matchingNums ==5 && aMegaMillionsLotto.getUserPowerBall()
                                    == aMegaMillionsLotto.getWinningPowerBall()){
            System.out.println("Congratulations! You won $5000.");
        }
        else if(matchingNums == 6 && aMegaMillionsLotto.getUserPowerBall()
                                    != aMegaMillionsLotto.getWinningPowerBall()){
            System.out.println("Congratulations! You won $1000.");
        }
        else if(matchingNums == 6 && aMegaMillionsLotto.getUserPowerBall()
                                    == aMegaMillionsLotto.getWinningPowerBall()){
            System.out.println("Congratulations! You won $10000.");
        }
        else if(matchingNums == 7 && aMegaMillionsLotto.getUserPowerBall()
                                    != aMegaMillionsLotto.getWinningPowerBall()){
            System.out.println("Congratulations! You won $50000.");
        }
        else if(matchingNums == 7 && aMegaMillionsLotto.getUserPowerBall()
                                    == aMegaMillionsLotto.getWinningPowerBall()){
            System.out.println("Congratulations! You won $500000.");
        }
        else{
            System.out.println("Sorry, no prizes today. Try again!");
        }
    }
}
