package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CreateBakery {
    //Fields
    private static String name;
    private static Integer cost;
    private static FileReader fr;
    private static BufferedReader br;
    private static ArrayList<Bakery> bakeryArr = new ArrayList<>();


    //method to create the bakery items
    public static ArrayList<Bakery> createAllBakery(String fileName) throws IOException {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        String bakeryString = "";

        //finding the name and the cost of the bakery item
        while ((line = br.readLine()) != null ){
            if (!line.equals(";")){
                bakeryString += line;
            }else {
                parseBakery(bakeryString);
                bakeryString ="";
            }
        }
        return bakeryArr;
    }

    //method to parse the bakery item
    private static void parseBakery (String string){
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

        bakeryArr.add(new Bakery(name, cost));
    }




}
