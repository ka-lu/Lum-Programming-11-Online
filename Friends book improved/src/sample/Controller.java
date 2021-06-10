
package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.ArrayList;


public class Controller {
    public TextField textGetFirstName;
    public TextField textGetLastName;
    public Label lblFirstName;
    public Label lblLastName;
    public ListView<sample.Friend> friendList = new ListView<>();
    public Button btnSave1;
    public Button btnSave2;
    public Button btnLoad1;
    public Button btnLoad2;
    public Button btnDeleteFriend3;

    //method to display the friends in listview
    public void displayFriend(MouseEvent mouseEvent) {
        sample.Friend temp;
        temp = friendList.getSelectionModel().getSelectedItem();
        lblFirstName.setText(temp.firstName);
        lblLastName.setText(temp.lastName);
    }

    //method to add friend
    public void addFriend(ActionEvent actionEvent) {
        String firstName = textGetFirstName.getText();
        String lastName = textGetLastName.getText();
        sample.Friend temp = new sample.Friend(firstName, lastName);
        friendList.getItems().add(temp);
        textGetFirstName.clear();
        textGetLastName.clear();
    }

    //method to delete friend
    public void deleteFriend(ActionEvent actionEvent) {
        friendList.getItems().remove(friendList.getSelectionModel().getSelectedItem());
        lblFirstName.setText("");
        lblLastName.setText("");

    }

    //saving a friend to group 1
    public void saveGroup1(ActionEvent actionEvent) throws IOException {
        ObservableList <Friend> myList = friendList.getItems();
        for (Friend f : myList){
            f.writeToFile();
        }
        friendList.getItems().clear();
    }

    //saving a friend to group 2
    public void saveGroup2(ActionEvent actionEvent) throws IOException {
        ObservableList <Friend> myList = friendList.getItems();
        for (Friend f : myList){
            f.writeToFile2();
        }
        friendList.getItems().clear();
    }

        //load the friends in group 1
       public void loadGroup1(ActionEvent actionEvent) throws IOException {
           friendList.getItems().clear();
           ArrayList<Friend> friends = createFriend.createAllFriends("friends.txt");
           for (Friend f : friends) {
               friendList.getItems().add(f);

           }
           btnLoad1.setDisable(true);
            btnLoad2.setDisable(true);
       }
        //load the friends in group 2
       public void loadGroup2 (ActionEvent actionEvent) throws IOException {
           friendList.getItems().clear();
           ArrayList<Friend> friends = createFriend.createAllFriends("friends2.txt");
           for (Friend f : friends) {
               friendList.getItems().add(f);
           }
            btnLoad1.setDisable(true);
           btnLoad2.setDisable(true);
       }

    }

