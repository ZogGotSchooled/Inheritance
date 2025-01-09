package TwoD_Arrays;

public class Ex2_TicTacToe {
    public static void run() {

        String[][] tictactoe = new String[3][3];

        setupBoard(tictactoe);

        print2DString(tictactoe);
        System.out.println();

        tictactoe[0][1] = "X";
        print2DString(tictactoe);
        System.out.println();
        System.out.println("The winner is " + checkWinner(tictactoe));
        System.out.println();

        int moves = 1;
//        //Two Player version
//        while( true ){
//            System.out.println("Enter your row");
//            int row = Library.input.nextInt();
//            System.out.println("Enter your column");
//            int col = Library.input.nextInt();


//            moves++;
//            print2DString(tictactoe);
//            String winner = checkWinner(tictactoe);
//            System.out.println("The winner is " + winner);
//            if(!winner.equals("no one yet!") || moves == 9){
//                break;
//            }

//
//        }//while





    }// run

    public static String checkWinner(String[][] tictactoe) {
        //*** Only works for rows

        // use a for loop to check if a row is a winner
        for (int r = 0; r < tictactoe.length; r++) {
            if (!tictactoe[r][0].equals(" ") && tictactoe[r][0].equals(tictactoe[r][1]) && tictactoe[r][0].equals(tictactoe[r][2])) {
                return tictactoe[r][0];
            }
        }
        return "no one yet!";
    }

    public static void print2DString(String[][] arr) {
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                System.out.print("|" + arr[r][c] );
            }
            System.out.println("|");
        }

    }// print2dString

    public static void setupBoard(String[][] tictactoe) {
        for (int r = 0; r < tictactoe.length; r++) {
            for (int c = 0; c < tictactoe[r].length; c++) {
                tictactoe[r][c] = " ";
            }
        }
    }// end
}
