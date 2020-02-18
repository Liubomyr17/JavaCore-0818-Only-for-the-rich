package com.company;

/*
0818 Only for the rich
Create a dictionary (Map <String, Integer>) and enter ten entries in it according to the principle: “last name” - “salary”.
Remove from the dictionary all people whose salaries are below 500.

Requirements:
1. The program should not display text on the screen.
2. The program should not read values ​​from the keyboard.
3. The Solution class should contain only three methods.
4. The createMap () method should create and return a HashMap dictionary with the type of String, Integer elements consisting of 10 entries on the basis of the "last name" - "salary" principle.
5. The removeItemFromMap () method should remove from the dictionary all people whose salaries are below 500.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.*;


public class Main {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Murphy", 599);
        map.put("Sokalsky", 1599);
        map.put("Kovalovic", 434);
        map.put("Shannon", 132);
        map.put("Readdy", 9487);
        map.put("Darren", 732);
        map.put("Governess", 354);
        map.put("Egorcev", 400);
        map.put("Bush", 1932);
        map.put("Washington", 243);
        return map;
}
        public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> copy = new HashMap<String, Integer>(map);
        for(Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500)
                map.remove(pair.getKey());
        }
        }

    public static void main(String[] args) {

    }
}





