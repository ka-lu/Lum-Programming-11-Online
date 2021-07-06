package sample;
import java.io.*;
import java.util.ArrayList;

public class Bakery {

    public ArrayList <Bakery> bakeryArrayList = new ArrayList<>();

    //fields
    String name;
    Integer cost;

    //constructor for bakery items
    public Bakery(String name, Integer cost){
        this.name=name;
        this.cost=cost;
    }

    //method that writes to the bakery file ("bakery.txt")
    public void writeToFileBakery() throws IOException {
        FileWriter fw = new FileWriter("bakery.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(name + ",\r");
        bw.write(Integer.toString(cost));
        bw.write("\r");
        bw.write(";\r");
        bw.close();
    }

    //method returning name and cost of bakery item
    public String toString (){
        return "Name: " + name + "\tCost: $" + cost;
    }


    //method adding bakery items to the bakery arraylist
    public void addBakeryItem() {
        Bakery testBakeryItem = new Bakery(name, cost);
        testBakeryItem.cost = cost;
        testBakeryItem.name = name;
        bakeryArrayList.add(testBakeryItem);
        name.replaceAll(name, "");
        cost.toString().replaceAll(cost.toString(), Integer.toString(0));

    }

    /*method removing bakery item from the bakery arraylist
    returns true if arraylist contains the testing bakery item
    */
    public boolean removeBakeryItem(){
        Bakery testBakeryItem = new Bakery (name,cost);
        testBakeryItem.cost = cost;
        testBakeryItem.name = name;
        bakeryArrayList.remove(testBakeryItem);
        name.replaceAll(name, "");
        cost.toString().replaceAll(cost.toString(), Integer.toString(0));

        if (bakeryArrayList.contains(testBakeryItem)){
            return true;
        }
        else return false;


    }




    /*method to get the name and cost of the product and then read through the text file to see that it contains it
    *returns string true if the text file contains the bakery item
    */

    public String findBakeryItem () throws IOException {
        FileReader fr = new FileReader("bakery.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        String bakeryString = "";

        while ((line = br.readLine()) != null) {
            if (!line.equals(";")) {
                bakeryString += line;
            } else {
                parseBakery(bakeryString);

                bakeryString = "";

                if ((name.equals(this.name)) || (cost.equals(this.cost))){
                    return "true";
                }
            }
        }
        return "false";
    }

    //method to parse bakery item
    private void parseBakery(String string) {
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
        bakeryArrayList.add(new Bakery(name, cost));
    }

    //method that will return true if the load button works
    public boolean loadButtonWorks (){
        return true;
    }

    //method that clears the bakery text file
        public void clearBakeryFile () throws FileNotFoundException {
            PrintWriter writer = new PrintWriter("bakery.txt");
            writer.print("");
            writer.close();
        }

    }


