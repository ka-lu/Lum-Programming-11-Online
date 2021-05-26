import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        //Read the file and add each line into an arraylist
        ArrayList <String> lines = new ArrayList<>();
        FileReader fr = new FileReader ("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line =br.readLine()) != null){

            lines.add(line);

        }System.out.println("Here is the arraylist:\n"+lines+"\n");

        br.close();

        //Allow user to search for a word in the text
        search();


    }

    //Method allowing user to search for a word in the text
    private static void search() throws FileNotFoundException {
        FileReader fr = new FileReader ("ProgrammingHistory.txt");
        System.out.println("Type a word to search in the text: ");


        //Try-catch encloses code that might throw exceptions and handles exceptions
    try {
            Scanner sc = new Scanner(System.in);
            LineNumberReader lnr = new LineNumberReader(fr);
            String a = sc.nextLine() + " ";
            String s = "";

            while (s!= null){
                s = lnr.readLine();
                if (s!= null && s.contains(a))
                    System.out.println("We found \"" + a + "\" at index " + lnr.getLineNumber());
            }

            lnr.close();
            fr.close();
        } catch (IOException x) {
    }

    }

    }


