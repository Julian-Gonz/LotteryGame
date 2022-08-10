

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MegaMillionsLotto {
    //The 4 attributes are created
    private int[] winningMegaMillionsLottoNums = new int[7];
    private int winningPowerBall;
    private int[] userLottoPicks = new int[7];
    private int userPowerBall;

    public MegaMillionsLotto(){
        Random myRan = new Random();
        int aNum;
        boolean duplicatesExist;
        for(int i = 0; i<winningMegaMillionsLottoNums.length; i++){ //Creates array of the winning picks
            do {
                aNum = myRan.nextInt(70) + 1;
                duplicatesExist = checkForDuplicates(winningMegaMillionsLottoNums, aNum);
            } while(duplicatesExist);   //Checks for duplicates numbers created and changes them

                winningMegaMillionsLottoNums[i] = aNum; //Assigns the values of the array
            }
                winningPowerBall = myRan.nextInt(25) + 1;   //Assigns the winning power ball
    }

    public int[] getWinningMegaMillionsLottoNums() {
        return winningMegaMillionsLottoNums;
    }

    public void setWinningMegaMillionsLottoNums(int[] winningMegaMillionsLottoNums) {
        this.winningMegaMillionsLottoNums = winningMegaMillionsLottoNums;
    }

    public int getWinningPowerBall() {
        return winningPowerBall;
    }

    public void setWinningPowerBall(int winningPowerBall) {
        this.winningPowerBall = winningPowerBall;
    }

    public int[] getUserLottoPicks() {
        return userLottoPicks;
    }

    public void setUserLottoPicks(int[] userLottoPicks) {
        this.userLottoPicks = userLottoPicks;
    }

    public int getUserPowerBall() {
        return userPowerBall;
    }

    public void setUserPowerBall(int userPowerBall) {
        this.userPowerBall = userPowerBall;
    }
    
    public void getUserPicks(){
        Scanner keyboard = new Scanner(System.in);
        int aNum;
        boolean duplicatesExist;
        int powerBall;

        for(int i =0; i< userLottoPicks.length; i++) {  //Used to create the user lotto picks
            do {    //Enter your user pick
                System.out.println("Enter your lotto picks between numbers 1 - 70");
                aNum = keyboard.nextInt();
                while (aNum > 70 || aNum < 1) { //Makes sure value is within the right restrictions
                    System.out.println("Invalid! Enter your lotto picks between numbers 1 - 70");
                    aNum = keyboard.nextInt();
                }

                duplicatesExist = checkForDuplicates(userLottoPicks, aNum);
                if(duplicatesExist){    //Makes sure there are no duplicates
                    System.out.println("Input already used!");
                }

            } while (duplicatesExist);
                userLottoPicks[i] = aNum;   //Assigns the user pick values
        }

        for(int j = 0; j < 1; j++){ //Create power ball number
            System.out.println("Enter your power ball number between numbers 1 - 25");
            powerBall = keyboard.nextInt();
            while(powerBall > 25 || powerBall < 1) {    //Makes sure there are in the correct range
                System.out.println("Invalid! Enter your power ball number between numbers 1 - 25");
                powerBall = keyboard.nextInt();
            }
                userPowerBall = powerBall;  //Assigns the user power ball value
            }
    }
    
    public boolean checkForDuplicates(int[]anyArray, int aNum){
        boolean duplicatesExist = false;
        for(int i = 0; i< anyArray.length; i++){
            if(aNum == anyArray[i]){
                duplicatesExist = true;
                break;
            }
        }
        return duplicatesExist;
    }

    public int checkLotteryMatch(){
        int counter =0;
        for(int i = 0; i <winningMegaMillionsLottoNums.length; i++){
            for(int j = 0; j< userLottoPicks.length; j++){
                if(winningMegaMillionsLottoNums[i] == userLottoPicks[j]){
                    counter ++;
                }
            }
        }
        return counter;
    }

    @Override
    public String toString() {
        return "MegaMillionsLotto{" +
                "winningMegaMillionsLottoNums=" + Arrays.toString(winningMegaMillionsLottoNums) +
                ", winningPowerBall=" + winningPowerBall +
                ", userLottoPicks=" + Arrays.toString(userLottoPicks) +
                ", userPowerBall=" + userPowerBall +
                '}';
    }
}
