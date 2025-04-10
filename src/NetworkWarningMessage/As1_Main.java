package NetworkWarningMessage;

import Utilities.Library;

import java.util.Scanner;
import java.util.ArrayList;

public class As1_Main {

    public static Scanner input = new Scanner( System.in );

    public static void run() {
        System.out.println("Assign 1 Network Messages");

//        ArrayList<As1_Message> allMessages = new ArrayList<As1_Message>();

        String[] rawMessages = {"Client3: repeated login failure",
                "Client2:filed password reset on file",
                "Server1: file not found",
                "Server3: ping not returned",
                "Server1:write file error on disk DSK1",
                "Server2:disk failure on DSK2",
                "Server2:diskette diskette",
                "Client3:    diskette disk",
                "Router1: missing packet",
                "PC4: power surge detected",
                "PC5: Error on disk3",
                "Client4: Diskette",
                "PC2:DISK",
                "Client2:diskydiskerton",
                "Thug2:dis"
        };

        ArrayList<As1_Message> allMessages = batchCreateMessages(rawMessages);

        while (true) {
            System.out.println("\nWhat do you want to do?");
            System.out.println("1. Add Message");
            System.out.println("2. Print All Messages");
            System.out.println("3. Scan for Error Messages");
            System.out.println("4. EXIT");
            int option = 0;
            try {
                option = input.nextInt();
            }
            catch (Exception e){
                System.out.println("Incorrect input type (needs integer number)");
            }
            input.nextLine();
            System.out.println();

            if (option == 1) {
                String userInput = Library.input.nextLine();
                As1_Message newMessage = new As1_Message(userInput);
                allMessages.add(newMessage);
                System.out.println(newMessage);
            } else if (option == 2) {

                System.out.println("Security Message\tMachine ID \tMachine Type  ");

                for(As1_Message m : allMessages){
//                    System.out.println(m.toString());
                    m.formatPrint();
                }

            } else if (option == 3) {
                String userInput = Library.input.nextLine();
                fuzzySearch(allMessages,userInput);

//                if(foundMessage != null){
//                    System.out.println("Warning found");
//                    foundMessage.formatPrint();
//                }
            } else if (option == 4) {
                System.out.println("Logging out. Good Bye.");        //while
                break;
            } else {
                System.out.println("That is not an available option");
            }
        }//while

    }//main

    public static ArrayList<As1_Message> batchCreateMessages(String[] messages){
        ArrayList<As1_Message> temp = new ArrayList<As1_Message>();
        for(String mStr : messages){
            temp.add(new As1_Message(mStr));
        }
        return temp;
    }

    public static void fuzzySearch(ArrayList<As1_Message> messages, String searchTerm){
//        As1_Message found = null;
        for(As1_Message m : messages){
            if(m.ScanWarning(searchTerm)){
//                System.out.println(searchTerm);
                m.formatPrint();
            }

        }
//        return null;
//        return found;
    }

}//class
