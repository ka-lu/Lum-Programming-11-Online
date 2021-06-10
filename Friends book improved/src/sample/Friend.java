
package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Friend {
    public String firstName;
    public String lastName;

    //constructor
    public Friend (String n, String ln){
        firstName=n;
        lastName=ln;
    }

    //writing to the file friends.txt
    public void writeToFile () throws IOException{
        FileWriter fw = new FileWriter("friends.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(firstName + ",\r");
        bw.write(lastName +",\r");
        bw.write(";\r");
        bw.close();
    }

    //writing to the file friends2.txt
    public void writeToFile2 () throws IOException{
        FileWriter fw = new FileWriter("friends2.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(firstName + ",\r");
        bw.write(lastName +",\r");
        bw.write(";\r");
        bw.close();
    }

    public String toString (){
        return firstName + " " +lastName;
    }

    public boolean compareFriends (Friend f){
        if (this.firstName.equals(f.firstName)){
            return true;
        }
            else return false;
    }

}