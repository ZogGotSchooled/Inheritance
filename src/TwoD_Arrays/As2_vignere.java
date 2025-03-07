package TwoD_Arrays;



public class As2_vignere {

    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String GREEN = "\033[0;32m";
    public static final String RESET = "\033[0m";

    static String encryptionkey = "SCONA";

    public static void run() {
        char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K',
                'L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[][] vigenere = createVSquare(alphabet);
        printSquare(vigenere);


        while(true){


            System.out.println("What do you want to decrypt? (decryption keyword: "+encryptionkey+", enter 'c' to change it)");
            String decryptMessage = Utilities.Library.input.nextLine().toUpperCase();
            if(decryptMessage.equals("C")){
                System.out.println("What do you want the key to be?");
                encryptionkey = Utilities.Library.input.nextLine().toUpperCase();
            }
            else {

            String decrypted = decrypt(alphabet,decryptMessage,encryptionkey);

            System.out.println(decrypted);}
        }


    }



    private static char[][] createVSquare(char[] alphabet) {
        char[][] square = new char[alphabet.length][alphabet.length];
//code to be written
        for (int i = 0; i < alphabet.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
//                square[i][j] = pythonArrayGetting(alphabet, j+i);
                square[i][j] = getVAt(alphabet, i, j);
            }

        }

        return square;

    }//createVSquare

    static char getVAt(char[] alphabet, int row, int col){
        return loopedArrayGet(alphabet, row+col);
    }

    static char loopedArrayGet(char[] array, int index){
//        return index >= 0 ? array[index] : array[array.length + index];
        return index < array.length ? array[index] : array[index % (array.length)];
    }

    public static void printSquare(char[][] square) {

        System.out.print("     ");
        //Topside headers
        for (int r = 0; r < square.length; r++){
            System.out.print(GREEN+square[r][0]+RESET+"  ");
        }
        System.out.println();

        //main square
        for (int r = 0; r < square.length; r++) {
            System.out.print(r+" "); //left side (per row) headers
            System.out.print(GREEN+square[r][0]+RESET+"  "); //left side (per row) headers

            for (int c = 0; c < square[r].length; c++) {
//                if(Math.abs(square[i][j]) < 10) System.out.print(" ");
                System.out.print(square[r][c] + "  ");
            }
            System.out.println();

        }
    }//end printSquare

    public static String decrypt(char[] alphabet, String cypherText, String key){
        String decrpytedString = "";

        for (int i = 0; i < cypherText.length(); i++) {
//            int column = indexOfChar(alphabet, cypherText.charAt(i));
//            int row = indexOfChar(alphabet, key.charAt(i%key.length()));
//            System.out.print("Chars: "+key.charAt(i%key.length()) + " and "+ cypherText.charAt(i)+", result : "+getVAt(alphabet, row, column)+" ");

//            System.out.println(" row "+row+" column "+column);

//            decrpytedString += getVAt(alphabet, row, column);

//            decrpytedString += getColFromRowAndLetter(alphabet, key.charAt(i%key.length()), cypherText.charAt(i));
            decrpytedString += getColFromRowAndLetter(alphabet, key.charAt(i%key.length()), cypherText.charAt(i));
        }


        return decrpytedString;
    }

    //returns which column corresponds with find at row
    public static char getColFromRowAndLetter(char[] alphabet, char key, char find){
//        System.out.println("key char "+key+", find "+find+" in that row");


        int standardIndexOfChar = indexOfChar(alphabet, find);
        int indexOfKey = indexOfChar(alphabet, key);
//        System.out.println("key char "+indexOfKey+key+", find "+standardIndexOfChar+find+" in that row");


//        System.out.println("standard index of "+find+" is "+standardIndexOfChar);

//        char letter = message.charAt(i);
//        decryptMessage += (char) ((letter - key.charAt(j) + 26) % 26 + 65);
//        j = ++j % key.length();


        int indexOfChar = ((standardIndexOfChar-indexOfKey + 26)%26);

//        System.out.println("Index of char "+indexOfChar);

        char decrypted = loopedArrayGet(alphabet, indexOfChar);
//        System.out.println(decrypted);

//        System.out.println("vsquare index of "+find+" is "+indexOfChar);

//        System.out.println("Index of "+find+" in row "+key+" is "+indexOfChar);
//        System.out.println();
        return decrypted;
    }

    public static int indexOfChar(char[] alphabet, char find){
        for (int i = 0; i < alphabet.length; i++) {
            if(find == alphabet[i]){
                return i;
            }
        }
        System.out.println(find+" not found in alphabet!");
        return 'q';
    }

    public static int linearSearch (char[] arr, char searchTerm){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == searchTerm){

                return i;
            }
        }
        return -1;
    }

}//end class
