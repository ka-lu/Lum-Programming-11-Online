package sample;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CreateProduce {

    //Fields
    private static String name;
    private static Integer cost;
    private static FileReader fr;
    private static BufferedReader br;
    private static ArrayList<Produce> produceArr = new ArrayList<>();

    //method to create produce items
    public static ArrayList<Produce> createAllProduce (String fileName) throws IOException {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        String produceString = "";

        //finding the name and the cost of the produce item
        while ((line = br.readLine()) != null ){
            if (!line.equals(";")){
                produceString += line;
            }else {
                parseProduce(produceString);
                produceString ="";
            }
        }

        return produceArr;
    }


    //method that parses the produce items
    private static void parseProduce (String string){
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
        produceArr.add(new Produce(name, cost));
    }

}
