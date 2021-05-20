
package sample;

        import javafx.event.ActionEvent;
        import javafx.scene.control.Label;
        import javafx.scene.control.ListView;
        import javafx.scene.control.TextField;
        import javafx.scene.input.MouseEvent;

public class Controller {
    public TextField textGetFirstName;
    public TextField textGetLastName;
    public TextField textGetNumber;
    public TextField textGetEmail;
    public ListView<Friend> friendList = new ListView<>();
    public Label lblFirstName;
    public Label lblLastName;
    public Label lblPhoneNumber;
    public Label lblEmail;

    //method to add friend
    public void addFriend(ActionEvent actionEvent) {
        String firstName = textGetFirstName.getText();
        String lastName = textGetLastName.getText();
        int phoneNum = Integer.parseInt(textGetNumber.getText());
        String email = textGetEmail.getText();
        Friend temp = new Friend(firstName, lastName, phoneNum, email);

        friendList.getItems().add(temp);
        textGetFirstName.clear();
        textGetLastName.clear();
        textGetNumber.clear();
        textGetEmail.clear();
    }

    //method displaying friends
    public void displayFriend(MouseEvent mouseEvent) {
        Friend temp;
        temp = friendList.getSelectionModel().getSelectedItem();
        lblFirstName.setText(temp.firstName);
        lblLastName.setText(temp.lastName);
        lblPhoneNumber.setText(Integer.toString(temp.getPhoneNum()));
        lblEmail.setText(temp.email);
    }

    //method to delete friend
    public void deleteFriend(ActionEvent actionEvent) {

        friendList.getItems().remove(friendList.getSelectionModel().getSelectedItem());
        lblEmail.setText("");
        lblFirstName.setText("");
        lblLastName.setText("");
        lblPhoneNumber.setText("");

    }
}

