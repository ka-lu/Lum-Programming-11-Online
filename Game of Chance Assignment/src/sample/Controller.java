package sample;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;
public class Controller {

    public Button btnOne;
    public Button btnTwo;
    public Button btnThree;
    public Button btnFour;
    public Button btnFive;
    public Button btnSix;
    public Label lblUsersGuess;
    public Label lblCompsGuess;
    public Label lblPoints;
    public Label lblWinLoss;
    public Button btnStartHere;
    public Label lblMoney;
    public TextField textGetPayment;
    int points = 0;
    public double total=0;


    //Method when player clicks on 1
    public void guessedOne(ActionEvent actionEvent) {
        lblMoney.getText();
        lblMoney.setText(Double.toString(total-=0.5));
        if (total <.5){
            btnOne.setDisable(true);
            btnTwo.setDisable(true);
            btnThree.setDisable(true);
            btnFour.setDisable(true);
            btnFive.setDisable(true);
            btnSix.setDisable(true);
            btnStartHere.setDisable(false);
            textGetPayment.setDisable(false);
            textGetPayment.clear();
        }

        Random ran = new Random();
        int compChoice;
        int userChoice = 1;
        //numbers generated will be between 0 - 59
        compChoice = ran.nextInt(6) + 1;

        lblUsersGuess.setText(Integer.toString(1));
        lblCompsGuess.setText(Integer.toString(compChoice));


        if (compChoice == userChoice) {
            lblWinLoss.setText("Win!");
            lblPoints.setText(addPoints().toString());


        } else {
            lblWinLoss.setText("Loss!");
            lblPoints.setText(subtractPoints().toString());
        }

    }


    //Method when player clicks on 2
    public void guessedTwo(ActionEvent actionEvent) {
        lblMoney.getText();
        lblMoney.setText(Double.toString(total-=0.5));
        if (total <.5){
            btnOne.setDisable(true);
            btnTwo.setDisable(true);
            btnThree.setDisable(true);
            btnFour.setDisable(true);
            btnFive.setDisable(true);
            btnSix.setDisable(true);
            btnStartHere.setDisable(false);
            textGetPayment.setDisable(false);
            textGetPayment.clear();
        }
        Random ran = new Random();
        int compChoice;
        int userChoice = 2;
        //numbers generated will be between 0 - 59
        compChoice = ran.nextInt(6) + 1;
        int points = 0;

        lblUsersGuess.setText(Integer.toString(2));
        lblCompsGuess.setText(Integer.toString(compChoice));

        if (compChoice == userChoice) {
            lblWinLoss.setText("Win!");

            lblPoints.setText(addPoints().toString());
           // lblPoints.setText(subtractMoney().toString());
        } else {
            lblWinLoss.setText("Loss!");
            lblPoints.setText(subtractPoints().toString());
        }

    }


    //Method when player clicks on 3
    public void guessedThree(ActionEvent actionEvent) {
        lblMoney.getText();
        lblMoney.setText(Double.toString(total-=0.5));
        if (total <.5){
            btnOne.setDisable(true);
            btnTwo.setDisable(true);
            btnThree.setDisable(true);
            btnFour.setDisable(true);
            btnFive.setDisable(true);
            btnSix.setDisable(true);
            btnStartHere.setDisable(false);
            textGetPayment.setDisable(false);
            textGetPayment.clear();
        }
        Random ran = new Random();
        int compChoice;
        int userChoice = 3;
        //numbers generated will be between 0 - 59
        compChoice = ran.nextInt(6) + 1;
        int points = 0;

        lblUsersGuess.setText(Integer.toString(3));
        lblCompsGuess.setText(Integer.toString(compChoice));

        if (compChoice == userChoice) {
            lblWinLoss.setText("Win!");
            lblPoints.setText(addPoints().toString());

        } else {
            lblWinLoss.setText("Loss!");
            lblPoints.setText(subtractPoints().toString());
        }

    }


    //Method when player clicks on 4
    public void guessedFour(ActionEvent actionEvent) {
        lblMoney.getText();
        lblMoney.setText(Double.toString(total-=0.5));
        if (total <.5){
            btnOne.setDisable(true);
            btnTwo.setDisable(true);
            btnThree.setDisable(true);
            btnFour.setDisable(true);
            btnFive.setDisable(true);
            btnSix.setDisable(true);
            btnStartHere.setDisable(false);
            textGetPayment.setDisable(false);
            textGetPayment.clear();
        }
        Random ran = new Random();
        int compChoice;
        int userChoice = 4;
        //numbers generated will be between 0 - 59
        compChoice = ran.nextInt(6) + 1;
        int points = 0;

        lblUsersGuess.setText(Integer.toString(4));
        lblCompsGuess.setText(Integer.toString(compChoice));


        if (compChoice == userChoice) {
            lblWinLoss.setText("Win!");
            lblPoints.setText(addPoints().toString());

        } else {
            lblWinLoss.setText("Loss!");
            lblPoints.setText(subtractPoints().toString());
        }
    }

    //Method when player clicks on 5
    public void guessedFive(ActionEvent actionEvent) {
        lblMoney.getText();
        lblMoney.setText(Double.toString(total-=0.5));
        if (total <.5){
            btnOne.setDisable(true);
            btnTwo.setDisable(true);
            btnThree.setDisable(true);
            btnFour.setDisable(true);
            btnFive.setDisable(true);
            btnSix.setDisable(true);
            btnStartHere.setDisable(false);
            textGetPayment.setDisable(false);
            textGetPayment.clear();
        }
        Random ran = new Random();
        int compChoice;
        int userChoice = 5;
        //numbers generated will be between 0 - 59
        compChoice = ran.nextInt(6) + 1;


        lblUsersGuess.setText(Integer.toString(5));
        lblCompsGuess.setText(Integer.toString(compChoice));


        if (compChoice == userChoice) {
            lblWinLoss.setText("Win!");
            lblPoints.setText(addPoints().toString());

        } else {
            lblWinLoss.setText("Loss!");
            lblPoints.setText(subtractPoints().toString());
        }

    }

    //Method when player clicks on 6
    public void guessedSix(ActionEvent actionEvent) {
        lblMoney.getText();
        lblMoney.setText(Double.toString(total-=0.5));
        Random ran = new Random();
        if (total <.5){
            btnOne.setDisable(true);
            btnTwo.setDisable(true);
            btnThree.setDisable(true);
            btnFour.setDisable(true);
            btnFive.setDisable(true);
            btnSix.setDisable(true);
            btnStartHere.setDisable(false);
            textGetPayment.setDisable(false);
            textGetPayment.clear();
        }
        int compChoice;
        int userChoice = 6;
        //numbers generated will be between 0 - 59
        compChoice = ran.nextInt(6) + 1;
        int points = 0;

        lblUsersGuess.setText(Integer.toString(6));
        lblCompsGuess.setText(Integer.toString(compChoice));

        if (compChoice == userChoice) {
            lblWinLoss.setText("Win!");
            lblPoints.setText(addPoints().toString());
            //lblPoints.setText(subtractMoney().toString());

        } else {
            lblWinLoss.setText("Loss!");
            lblPoints.setText(subtractPoints().toString());

        }

    }

    //adds points if player guesses correctly and wins
    public Integer addPoints() {
        lblPoints.getText();
        lblPoints.setText(Integer.toString(points++));
        return points;
    }

    //subtracts points if player guesses incorrectly and loses
    public Integer subtractPoints(){
        lblPoints.getText();
        lblPoints.setText(Integer.toString(points--));

        if (points <= 0){
            points =0;
        }
        return points;
    }


    //Method to start the guessing game
    public void StartGame(ActionEvent actionEvent) {
    lblPoints.getText();
    lblPoints.setText(Integer.toString(0));
    double payment =Double.parseDouble(textGetPayment.getText());
    total =+ payment;
    lblMoney.setText(Double.toString(total));

        btnOne.setDisable(true);
        btnTwo.setDisable(true);
        btnThree.setDisable(true);
        btnFour.setDisable(true);
        btnFive.setDisable(true);
        btnSix.setDisable(true);

        if (total > 0 && payment >0 && payment > 0.49){
        btnOne.setDisable(false);
        btnTwo.setDisable(false);
        btnThree.setDisable(false);
        btnFour.setDisable(false);
        btnFive.setDisable(false);
        btnSix.setDisable(false);
        btnStartHere.setDisable(true);
        textGetPayment.setDisable(true);
        }
    }
}
