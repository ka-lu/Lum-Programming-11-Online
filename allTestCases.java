import org.junit.Before;
import org.junit.Test;
import sample.*;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.Assert.*;

public class allTestCases {

        Bakery testBakeryItem;
        Dairy testDairyItem;
        Produce testProduceItem;

        @Before
        public void setUp (){
        testBakeryItem = new Bakery("bread",4);
        testDairyItem = new Dairy("milk", 2);
        testProduceItem = new Produce("apple",1);
    }

    @Test
    public void testAddingBakeryItem() throws IOException {
        //clear the bakery arraylist
        testBakeryItem.bakeryArrayList.clear();
        assertEquals(testBakeryItem.bakeryArrayList.size(),0);
        //add the testBakeryItem into the arraylist
        testBakeryItem.addBakeryItem();
        //check if testBakeryItem has been added into the bakery arraylist
        assertEquals (testBakeryItem.bakeryArrayList.size(),1);
        testBakeryItem.findBakeryItem();
        assertTrue(String.valueOf(testBakeryItem.findBakeryItem().equals("true")),true);
    }


    @Test
    public void  testAddingDairyItem () throws IOException {
        //clear the dairy arraylist
        testDairyItem.dairyArrayList.clear();
        assertEquals(testDairyItem.dairyArrayList.size(),0);
        //add the testDairyItem into the dairy arraylist
        testDairyItem.addDairy();
        //check if testDairyItem has been added into the dairy arraylist
        assertEquals (testDairyItem.dairyArrayList.size(),1);
        testDairyItem.findDairyItem();
        assertTrue(String.valueOf(testDairyItem.findDairyItem().equals("true")),true);
    }

    @Test
    public void  testAddingProduceItem () throws IOException{
        //clear the produce arraylist
        testProduceItem.produceArrayList.clear();
        assertEquals(testProduceItem.produceArrayList.size(),0);
        //add the produce item into the produce arraylist
        testProduceItem.addProduce();
        //check if the testProduceItem has been added into the produce arraylist
        assertEquals (testProduceItem.produceArrayList.size(),1);
        assertTrue(String.valueOf(testProduceItem.produceArrayList.contains(testProduceItem)), true);
        testProduceItem.findProduceItem();
        assertTrue(String.valueOf(testProduceItem.findProduceItem().equals("true")),true);
    }


    @Test
    public void testDeletingBakeryItem () throws IOException {
        //clear the bakery arraylist
        testBakeryItem.bakeryArrayList.clear();
        assertEquals(testBakeryItem.bakeryArrayList.size(),0);
        //add the testBakeryItem into the arraylist
        testBakeryItem.addBakeryItem();
        //check to see if the bakery item has been added into the arraylist
        assertEquals (testBakeryItem.bakeryArrayList.size(),1);
        assertTrue(String.valueOf(testBakeryItem.bakeryArrayList.contains(testBakeryItem)), true);
        //remove the bakery item from arraylist
        testBakeryItem.removeBakeryItem();
        //check that the arraylist doesn't contain the testBakeryItem
        assertFalse(testBakeryItem.bakeryArrayList.contains(testBakeryItem));

    }


    @Test
    public void testDeletingDairyItem () throws IOException {
        //clear the arraylist of dairy items
        testDairyItem.dairyArrayList.clear();
        assertEquals(testDairyItem.dairyArrayList.size(),0);
        //add the testDairyItem into the arraylist
        testDairyItem.addDairy();
        //check to see if that dairy item has been added into the arraylist
        assertEquals (testDairyItem.dairyArrayList.size(),1);
        assertTrue(String.valueOf(testDairyItem.dairyArrayList.contains(testDairyItem)), true);
        //remove that dairy item
        testDairyItem.removeDairyItem();
        //check that the arraylist doesn't contain dairy item
        assertFalse(testDairyItem.dairyArrayList.contains(testDairyItem));

    }

    @Test
    public void testDeletingProduceItem () throws IOException {
        //clear the arraylist of produce items
        testProduceItem.produceArrayList.clear();
        assertEquals(testProduceItem.produceArrayList.size(),0);
        //add the testProduceItem into the arraylist
        testProduceItem.addProduce();
        //check to see if that produce item has been added into the arraylist
        assertEquals (testProduceItem.produceArrayList.size(),1);
        assertTrue(String.valueOf(testProduceItem.produceArrayList.contains(testProduceItem)), true);
        //remove that produce item
        testProduceItem.removeProduceItem();
        //check that the arraylist doesn't contain the produce item
        assertFalse(testProduceItem.produceArrayList.contains(testProduceItem));

    }


    @Test
    public void testSavingBakeryItem () throws IOException {
        //clear the text file for bakery items
        testBakeryItem.clearBakeryFile();
        FileReader fr = new FileReader("bakery.txt");
        //add the bakery item into the arraylist and write it into the text file
        testBakeryItem.addBakeryItem();
        testBakeryItem.writeToFileBakery();
        //check that the testBakeryItem has been added into the arraylist
        assertEquals (testBakeryItem.bakeryArrayList.size(),1);
        assertTrue(String.valueOf(testBakeryItem.bakeryArrayList.contains(testBakeryItem)), true);
        //check that the testBakeryItem has been placed into the text file
        testBakeryItem.findBakeryItem();
        assertTrue(String.valueOf(testBakeryItem.findBakeryItem().equals("true")),true);

    }

    @Test
    public void testSavingDairyItem () throws IOException {
        //clear the text file for dairy items
        testDairyItem.clearDairyFile();
        FileReader fr = new FileReader("dairy.txt");
        //add the dairy item into the arraylist and write it into the text file
        testDairyItem.addDairy();
        testDairyItem.writeToFileDairy();
        //check that the testDairyItem has been added into the arraylist
        assertEquals (testDairyItem.dairyArrayList.size(),1);
        assertTrue(String.valueOf(testDairyItem.dairyArrayList.contains(testDairyItem)), true);
        //check that the testDairyItem has been placed into the text file
        testDairyItem.findDairyItem();
        assertTrue(String.valueOf(testDairyItem.findDairyItem().equals("true")),true);
    }

    @Test
    public void testSavingProduceItem () throws IOException {
        //clear the text file for produce items
        testProduceItem.clearProduceFile();
        FileReader fr = new FileReader("produce.txt");
        //add the testProduceItem into the arraylist and write it into the text file
        testProduceItem.addProduce();
        testProduceItem.writeToFileProduce();
        //check that the testProduceItem has been added into the arraylist
        assertEquals (testProduceItem.produceArrayList.size(),1);
        assertTrue(String.valueOf(testProduceItem.produceArrayList.contains(testProduceItem)), true);
        //check that the testProduceItem has been placed into the text file
        testProduceItem.findProduceItem();
        assertTrue(String.valueOf(testProduceItem.findProduceItem().equals("true")),true);
    }



    @Test
    public void testLoadingBakeryItem () throws IOException {

        //clear the text file for bakery items
        testBakeryItem.clearBakeryFile();
        FileReader fr = new FileReader("bakery.txt");
        //add the bakery item into the arraylist and write it into the text file
        testBakeryItem.addBakeryItem();
        testBakeryItem.writeToFileBakery();
        //check that the testBakeryItem has been added into the arraylist
        assertEquals (testBakeryItem.bakeryArrayList.size(),1);
        assertTrue(String.valueOf(testBakeryItem.bakeryArrayList.contains(testBakeryItem)), true);
        //check that the testBakeryItem has been placed into the text file
        testBakeryItem.findBakeryItem();
        assertTrue(String.valueOf(testBakeryItem.findBakeryItem().equals("true")),true);
        //check if load button has worked properly
        assertTrue(testBakeryItem.loadButtonWorks());

    }

    @Test
    public void testLoadingDairyItem () throws IOException {

        //clear the text file for dairy items
        testDairyItem.clearDairyFile();
        FileReader fr = new FileReader("dairy.txt");
        //add the dairy item into the arraylist and write it into the text file
        testDairyItem.addDairy();
        testDairyItem.writeToFileDairy();
        //check that the testDairyItem has been added into the arraylist
        assertEquals (testDairyItem.dairyArrayList.size(),1);
        assertTrue(String.valueOf(testDairyItem.dairyArrayList.contains(testDairyItem)), true);
        //check that the testDairyItem has been placed into the text file
        testDairyItem.findDairyItem();
        assertTrue(String.valueOf(testDairyItem.findDairyItem().equals("true")),true);
        //check if load button has worked properly
        assertTrue(testDairyItem.loadButtonWorks());
    }

    @Test
    public void testLoadingProduceItem () throws IOException {
        //clear the text file for produce items
        testProduceItem.clearProduceFile();
        FileReader fr = new FileReader("produce.txt");
        //add the testProduceItem into the arraylist and write it into the text file
        testProduceItem.addProduce();
        testProduceItem.writeToFileProduce();
        //check that the testProduceItem has been added into the arraylist
        assertEquals (testProduceItem.produceArrayList.size(),1);
        assertTrue(String.valueOf(testProduceItem.produceArrayList.contains(testProduceItem)), true);
        //check that the testProduceItem has been placed into the text file
        testProduceItem.findProduceItem();
        assertTrue(String.valueOf(testProduceItem.findProduceItem().equals("true")),true);
        //check if load button has worked properly
        assertTrue(testProduceItem.loadButtonWorks());
    }

}
