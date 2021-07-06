package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CreateDairy {
    //Fields
    private static String name;
    private static Integer cost;
    private static FileReader fr;
    private static BufferedReader br;
    private static ArrayList<Dairy> dairyArr = new ArrayList<>();

    //method that creates the dairy items
    public static ArrayList<Dairy> createAllDairy(String fileName) throws IOException {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        String dairyString = "";

        //finding the name and the cost of the dairy item
        while ((line = br.readLine()) != null ){
            if (!line.equals(";")){
                dairyString += line;
            }else {
                parseDairy(dairyString);
                dairyString ="";
            }
        }

        return dairyArr;

    }

    //method that parses the dairy items
    private static void parseDairy (String string){
        int pos =0;
        String name = "";
        Integer cost = 0;

        for (int i = 0; i<string.length(); i++){
            if (string.substring(i,i+1).equals(",")){
                pos=i;
                name= string.substring(0,pos);
                cost =Integer.parseInt(string.substring(pos+1));

            }
        }

        dairyArr.add(new Dairy(name, cost));
    }


}
