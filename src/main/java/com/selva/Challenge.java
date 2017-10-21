package com.selva;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Stream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;


public class Challenge  {

  public static void main(String[] args) {

    String csvFile = "names.txt";
    BufferedReader br = null;
    String line = "";
    String cvsSplitBy = ",";
    ArrayList person=new ArrayList();

    try {

      br = new BufferedReader(new FileReader(csvFile));
      while ((line = br.readLine()) != null) {

        // use comma as separator
        String[] p2 = line.split(cvsSplitBy);
        person.add(new People (
            p2[0],
            p2[1],
            p2[2],
            p2[3],
            p2[4],
            p2[5]));

      }

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (br != null) {
        try {
          br.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
    Collections.sort(person,new dataComparator());

    Iterator itr=person.iterator();
    while(itr.hasNext()){
      People st=(People)itr.next();
      System.out.println(st.getCountry());
    }
  }

}


