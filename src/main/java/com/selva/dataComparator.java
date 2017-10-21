package com.selva;

import java.util.Comparator;

public class dataComparator implements Comparator {
  public int compare(Object o1,Object o2){
    People s1=(People) o1;
    People s2=(People) o2;

    return s1.getCountry().compareTo(s2.getCountry());
  }
}
