package com.company;

import javax.swing.*;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasedPD implements PhoneDirectory, Serializable {
    // phone directory and related items
    private final int MAXENTRIES = 200; // maximum number of entries in phone directory
    private PhoneDirectoryEntry[] phoneDirectory = new PhoneDirectoryEntry[MAXENTRIES];
    private int numberOfEntries = 0; // number of entries
    private int currentEntry = -1; //index of entry currently displayed

    public void loadData(String filename) {
        // TODO Auto-generated method stub
        try {
            File inputFile = new File(filename);
            Scanner in = new Scanner(inputFile);
            String name;
            String number;
            int index = 0;

            while (in.hasNext()){
                name = in.next();
                number = in.next();
                phoneDirectory[index] = new PhoneDirectoryEntry(name, number);
                index++;
            }

            numberOfEntries = index;
            Arrays.sort(phoneDirectory, 0 , numberOfEntries);
            in.close();

        } catch (IOException exc) {
            System.out.println("File does not exist");
        }
    }

    @Override
    public void saveData(String filename) {
        try {

            FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(phoneDirectory);
            objectOut.close();
            System.out.println("The Object  was successfully written to a file");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void addEntry(String name, String number) {
        // TODO Auto-generated method stub
        PhoneDirectoryEntry phoneDirectoryEntry= new PhoneDirectoryEntry(name, number);

        phoneDirectory[numberOfEntries] = phoneDirectoryEntry;
        numberOfEntries++;
        Arrays.sort(phoneDirectory, 0 , numberOfEntries);
    }

    public PhoneDirectoryEntry getFirst() {
        // TODO Auto-generated method stub
        if (numberOfEntries != 0) {
            currentEntry = 0;
            return phoneDirectory[0];
        } else
            return null;
    }

    public PhoneDirectoryEntry getNext() {
        // TODO Auto-generated method stub
        if (currentEntry != numberOfEntries - 1) {
            currentEntry++;
            return phoneDirectory[currentEntry];
        } else
            return null;

    }

    public PhoneDirectoryEntry getPrevious() {
        // TODO Auto-generated method stub
        if (currentEntry != 0) {
            currentEntry--;
            return phoneDirectory[currentEntry];
        } else
            return null;
    }

    public String search(String name) {
        PhoneDirectoryEntry phoneDirectoryEntry= new PhoneDirectoryEntry(name, "");

        int searchRes = Arrays.binarySearch(phoneDirectory,0,numberOfEntries,phoneDirectoryEntry);

        if(searchRes >= 0)
            return phoneDirectory[searchRes].getNumber();
        else
            return null;
    }
}
