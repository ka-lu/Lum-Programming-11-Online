package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.ArrayList;

public class Controller {

    public boolean loadButtonWorks (){
        return true;
    }

    public ListView listProduce;
    public TextField textGetProduceName;
    public TextField textGetProduceCost;
    public Button btnAddProduce;
    public Button btnSaveProduce;
    public Button btnLoadProduce;
    public Button btnDeleteProduce;


    public TextField textGetDairyName;
    public TextField textGetDairyCost;
    public Button btnAddDairy;
    public Button btnSaveDairy;
    public Button btnLoadDairy;
    public ListView listDairy;
    public Button btnDeleteDairy;


    public ListView listBakery;
    public TextField textGetBakeryName;
    public TextField textGetBakeryCost;
    public Button btnAddBakery;
    public Button btnSaveBakery;
    public Button btnLoadBakery;
    public Button btnDeleteBakery;


    /*
    method when the add produce button is clicked on
    Will add in a produce item to the produce list
     */
    public void addProduce(MouseEvent mouseEvent) {
        listProduce.getItems().add(new Produce(textGetProduceName.getText(), Integer.parseInt(textGetProduceCost.getText())));
        textGetProduceName.clear();
        textGetProduceCost.clear();
    }

    /*
    method when the save produce button is clicked on by the user
    the produce list will be written into the produce text file and the list will be saved
     */
    public void saveProduce(ActionEvent actionEvent) throws IOException {
        ObservableList<Produce> myList = listProduce.getItems();
        for (Produce p : myList) {
            p.writeToFileProduce();
        }
        listProduce.getItems().clear();
    }


    /*
    method when the load produce button is clicked on by the user
    this method will load up the produce list that was saved into the produce text file
    */
    public void loadProduce(ActionEvent actionEvent) throws IOException {
        listProduce.getItems().clear();
        ArrayList<Produce> produces = CreateProduce.createAllProduce("produce.txt");
        for (Produce p : produces) {
            listProduce.getItems().add(p);
        } if (listProduce.getItems().size() == produces.size()){
        loadButtonWorks();
        }
    }

    /*
    method when the delete produce button is clicked
    this method will delete the produce item that the user has selected on the list
    */
    public void deleteProduce(ActionEvent actionEvent) {
        listProduce.getItems().remove(listProduce.getSelectionModel().getSelectedItem());
    }


    /*
    method when the add dairy button is clicked on
    Will add in a dairy item to the dairy list
     */
    public void addDairy(MouseEvent mouseEvent) {
        listDairy.getItems().add(new Dairy(textGetDairyName.getText(), Integer.parseInt(textGetDairyCost.getText())));
        textGetDairyName.clear();
        textGetDairyCost.clear();
    }


    /*
    method when the save dairy button is clicked on by the user
    the dairy list will be written into the dairy text file and the list will be saved
    */
    public void saveDairy(ActionEvent actionEvent) throws IOException {
        ObservableList<Dairy> myListDairy = listDairy.getItems();
        for (Dairy d : myListDairy) {
            d.writeToFileDairy();
        }
        listDairy.getItems().clear();
    }


    /*
    method when the load dairy button is clicked on by the user
    this method will load up the dairy list that was saved into the dairy text file
    */
    public void loadDairy(ActionEvent actionEvent) throws IOException {
        listDairy.getItems().clear();
        ArrayList<Dairy> dairyArrayList = CreateDairy.createAllDairy("dairy.txt");
        for (Dairy d : dairyArrayList) {
            listDairy.getItems().add(d);
        }if (listDairy.getItems().size() == dairyArrayList.size()){
            loadButtonWorks();
        }
    }

    /*
    method when the delete dairy button is clicked
    this method will delete the dairy item that the user has selected on the list
     */
    public void deleteDairy(ActionEvent actionEvent) {
        listDairy.getItems().remove(listDairy .getSelectionModel().getSelectedItem());
    }


    /*
    method when the add bakery button is clicked on
    Will add in a bakery item to the bakery list
     */
    public void addBakery(MouseEvent mouseEvent) {
        listBakery.getItems().add(new Bakery(textGetBakeryName.getText(), Integer.parseInt(textGetBakeryCost.getText())));
        textGetBakeryName.clear();
        textGetBakeryCost.clear();
    }


    /*
    method when the save bakery button is clicked on by the user
    the bakery list will be written into the bakery text file and the list will be saved
    */
    public void saveBakery(ActionEvent actionEvent) throws IOException {
        ObservableList<Bakery> myListBakery = listBakery.getItems();
        for (Bakery b : myListBakery) {
            b.writeToFileBakery();
        }
        listBakery.getItems().clear();
    }


    /*
    method when the load bakery button is clicked on by the user
    this method will load up the bakery list that was saved into the bakery text file
     */
    public void loadBakery(ActionEvent actionEvent) throws IOException {
        listBakery.getItems().clear();
        ArrayList<Bakery> bakeryArrayList = CreateBakery.createAllBakery("bakery.txt");
        for (Bakery b : bakeryArrayList) {
            listBakery.getItems().add(b);
        }if (listBakery.getItems().size() == bakeryArrayList.size()){
            loadButtonWorks();
        }
    }


    /*
    method when the delete bakery button is clicked
    this method will delete the bakery item that the user has selected on the list
     */
    public void deleteBakery(ActionEvent actionEvent) {
        listBakery.getItems().remove(listBakery.getSelectionModel().getSelectedItem());
    }
}
