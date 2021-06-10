package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class createFriend {

    private static ArrayList <Friend> friends = new ArrayList <>();

    public static ArrayList createAllFriends (String fileName) throws IOException {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        String friendString = "";

        while ((line = br.readLine()) !=null){
            if (!line.equals(";")){
                friendString += line;
            } else {
                parseFriend (friendString);
                friendString = "";
            }
        }
        return friends;
    }

    private static void parseFriend (String string){
        int pos = 0;
        String firstName = "";
        String lastName = "";

        for (int i =0; i<string.length(); i++){
            if (string.substring(i, i+1).equals(",")){
                pos = i;
                firstName = string.substring(0,pos);
                lastName = string.substring(pos +1);

            }

        }

        Friend f = new Friend(firstName, lastName);
        if (f.compareFriends(f)){
            friends.add(new Friend(firstName, lastName));
        } else if (!f.compareFriends(f)){
            friends.remove(new Friend(firstName,lastName));
        }


    }
}
