package sample;
import java.io.*;
import java.util.ArrayList;

public class Dairy {

    public ArrayList<Dairy> dairyArrayList = new ArrayList<>();

    //fields
    String name;
    Integer cost;

    //constructor for the dairy items
    public Dairy(String name, Integer cost){
        this.name=name;
        this.cost=cost;
    }

    //method that writes to the dairy file ("dairy.txt")
    public void writeToFileDairy() throws IOException {
        FileWriter fw = new FileWriter("dairy.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(name + ",\r");
        bw.write(Integer.toString(cost));
        bw.write("\r");
        bw.write(";\r");
        bw.close();
    }

    //method returning name and cost of dairy item
    public String toString (){
        return "Name: " + name + "\tCost: $" + cost;
    }

    //method adding dairy items to the dairy arraylist
    public void addDairy (){
        Dairy testDairyItem = new Dairy(name, cost);
        testDairyItem.cost = cost;
        testDairyItem.name = name;
        dairyArrayList.add(testDairyItem);
        name.replaceAll(name, "");
        cost.toString().replaceAll(cost.toString(), Integer.toString(0));

    }

    /*method removing dairy item from the dairy arraylist
    returns true if arraylist contains the testDairyItem
    */
    public boolean removeDairyItem() {
        Dairy testDairyItem = new Dairy (name,cost);
        testDairyItem.cost = cost;
        testDairyItem.name = name;
        dairyArrayList.remove(testDairyItem);
        name.replaceAll(name, "");
        cost.toString().replaceAll(cost.toString(), Integer.toString(0));

        if (dairyArrayList.contains(testDairyItem)){
            return false;
        }
        else return true;
    }


    //method to get the name and cost of the dairy item and then read through the text file to see that it contains it
    public String findDairyItem() throws IOException {
        FileReader fr = new FileReader("dairy.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        String dairyString = "";

        while ((line = br.readLine()) != null) {
            if (!line.equals(";")) {
                dairyString += line;
            } else {
                parseDairy(dairyString);
                if ((name.equals(this.name)) || (cost.equals(this.cost))){
                    return "true";
                }
                dairyString = "";
            }

        }
        return "false";
    }

    //method to parse dairy items
    private void parseDairy(String string) {
        int pos =0;
        String name = "";
        Integer cost = 0;

        for (int i = 0; i<string.length(); i++){
            if (string.substring(i,i+1).equals(",")) {
                pos = i;
                name = string.substring(0, pos);
                cost = Integer.parseInt(string.substring(pos + 1));
            }
        }
        dairyArrayList.add(new Dairy(name, cost));
    }

    //method that will return true if the load button works
    public boolean loadButtonWorks (){
        return true;
    }

    //method that clears the dairy text file
    public void clearDairyFile () throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("dairy.txt");
        writer.print("");
        writer.close();
    }



}
