package TwoD_Arrays;

public class As2_vignere {
    public static void run() {
        char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K',
                'L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[][] vigenere = createVSquare(alphabet);
        printSquare(vigenere);
    }

    private static char[][] createVSquare(char[] alphabet) {
        char[][] square = new char[alphabet.length][alphabet.length];
//code to be written
        for (int i = 0; i < alphabet.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                square[i][j] = pythonArrayGetting(alphabet, j+i);
            }
        }

        return square;

    }//createVSquare

    static char pythonArrayGetting(char[] array, int index){
//        return index >= 0 ? array[index] : array[array.length + index];
        return index < array.length ? array[index] : array[index % (array.length - 1)];
    }

    public static void printSquare(char[][] square) {
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
//                if(Math.abs(square[i][j]) < 10) System.out.print(" ");
                System.out.print(square[i][j] + "  ");
            }
            System.out.println();

        }
    }//end printSquare

    public static int linearSearch (char[] arr, char searchTerm){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == searchTerm){

                return i;
            }
        }
        return -1;
    }

}//end class
