package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Friend {
    public String firstName;
    public String lastName;
    private int phoneNum;
    public String email;

    //constructor
    public Friend (String n, String ln, int phoneNum, String e){
        firstName=n;
        lastName=ln;
        this.phoneNum=phoneNum;
        email = e;
    }

//getters and setters

    public int getPhoneNum (){
        return phoneNum;
    }

    public String toString (){
        return firstName + " " +lastName;
    }


}

