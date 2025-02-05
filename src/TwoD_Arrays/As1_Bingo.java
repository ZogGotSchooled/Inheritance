package TwoD_Arrays;

import Utilities.Library;

import static Utilities.Library.generateArray;
import static Utilities.Library.myRandom;

public class As1_Bingo {

    static char[] bingo = {'B', 'I', 'N', 'G', 'O'};

    public static void run(){

        int[][] scorecard = new int[5][5];

        scorecard[0] = generateArray(5, 1, 15); //B
        scorecard[1] = generateArray(5, 16, 30); //I
        scorecard[2] = generateArray(5, 31, 45); //N
        scorecard[3] = generateArray(5, 46, 60); //G
        scorecard[4] = generateArray(5, 61, 75); //O


        printCard(scorecard);

        int count = 0;
        while(count < 1000){
            System.out.println();

            Library.input.nextLine();


            int calledNum = myRandom(1,75);
            System.out.println("Called number: "+calledNum);
            boolean crossedOffNumber = tryCrossOffNumber(scorecard, calledNum);

            if(!crossedOffNumber){
                System.out.println(calledNum+" not on scorecard.");
            }

            printCard(scorecard);

            boolean win = checkCard(scorecard);
            if(win)
            {
                System.out.println("BINGOO!!!!!");
                break;
            }

        }
    }
    
    public static boolean checkCard(int[][] card){
        boolean yippee = false;
        for (int i = 0; i < card.length; i++) {
            yippee = testColumn(card, i);
            if(yippee) return yippee;
        }

        for (int i = 0; i < card.length; i++) {
            yippee = testRow(card[i]);
            if(yippee) return yippee;

        }
        return yippee;
    }

    public static boolean testColumn(int[][] grid, int colNum){
        for (int i = 0; i < grid.length; i++) {
            if(grid[i][colNum] > 0) return false;
        }
        return true;
    }

    public static boolean testRow(int[] eachRow){
        for (int i = 0; i < eachRow.length; i++) {
            if(eachRow[i] > 0) return false;

        }
        return true;
    }






    public static boolean tryCrossOffNumber(int[][] card, int search){
        boolean crossedOffANumber = false;

        for (int i = 0; i < card.length; i++) {
            for (int j = 0; j < card[i].length; j++) {
                if(card[i][j] == search){
                    card[i][j] = -card[i][j];
                    crossedOffANumber = true;
                }
            }
        }

        return crossedOffANumber;
    }

    public static void printCard(int[][] card){
        for (int i = 0; i < card.length; i++) {
            System.out.print(bingo[i]+": ");
            for (int j = 0; j < card[i].length; j++) {

                if(card[i][j] >= 0) System.out.print(" ");
                if(Math.abs(card[i][j]) < 10) System.out.print(" ");

                System.out.print(card[i][j]+" ");


            }
            System.out.println();
        }
    }
}



