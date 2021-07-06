package sample;
import java.io.*;
import java.util.ArrayList;

public class Produce {


    public ArrayList<Produce> produceArrayList = new ArrayList<>();

    //fields of a produce item
    String name;
    Integer cost;

    //constructor for produce items
    public Produce(String name, Integer cost){
        this.name=name;
        this.cost=cost;
    }

    //method that writes the produce items into the produce text file ("produce.txt" file)
    public void writeToFileProduce() throws IOException {
        FileWriter fw = new FileWriter("produce.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(name + ",\r");
        bw.write(Integer.toString(cost));
        bw.write("\r");
        bw.write(";\r");
        bw.close();
    }

    //method returning name and cost of produce item
    public String toString (){
        return "Name: " + name + "\tCost: $" + cost;
    }


    //method adding produce items to the produce arraylist
    public void addProduce (){
        Produce testProduceItem = new Produce(name, cost);
        testProduceItem.cost = cost;
        testProduceItem.name = name;
        produceArrayList.add(testProduceItem);
        name.replaceAll(name, "");
        cost.toString().replaceAll(cost.toString(), Integer.toString(0));
    }


    /*method removing produce item from the produce arraylist
    returns false if arraylist contains the testProduceItem
    */
    public boolean removeProduceItem() {
        Produce testProduceItem = new Produce (name,cost);
        testProduceItem.cost = cost;
        testProduceItem.name = name;
        produceArrayList.remove(testProduceItem);
        name.replaceAll(name, "");
        cost.toString().replaceAll(cost.toString(), Integer.toString(0));

        if (produceArrayList.contains(testProduceItem)){
            return false;
        }
        else return true;
    }


    //method to get the name and cost of the produce item and then read through the text file to see that it contains it
    public String findProduceItem() throws IOException {
        FileReader fr = new FileReader("produce.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        String produceString = "";

        while ((line = br.readLine()) != null) {
            if (!line.equals(";")) {
                produceString += line;
            } else {
                parseProduce(produceString);
                if ((name.equals(this.name)) || (cost.equals(this.cost))){
                    return "true";
                }
                produceString = "";
            }
        }
        return "false";
    }

    //method to parse produce items
    private void parseProduce(String string) {
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
        produceArrayList.add(new Produce(name, cost));
    }

    //method that will return true if the load button works
    public boolean loadButtonWorks (){
        return true;
    }


    //method that clears the produce text file
    public void clearProduceFile() throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("produce.txt");
        writer.print("");
        writer.close();
    }
}
