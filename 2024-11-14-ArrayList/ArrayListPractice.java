//Amy Zhou
//Jessie Wang

import java.util.ArrayList;

public class ArrayListPractice {
  public static ArrayList<String>createRandomArray (int size) {
    ArrayList<String>result =  new ArrayList<String>(size);
    for (int i = 0; i < size; i ++) {
      int val = (int)(Math.random()*11);
      if (val == 0) {
        result.add("");
      }
      else {
        result.add(""+val);
    }
  }
  return result;
  }

  public static void replaceEmpty( ArrayList<String> original){
   while (original.indexOf("")!=-1){
     int index = original.indexOf("");
     original.remove(index);
     original.add(index, "Empty");
   }
  }

  public static ArrayList<String> makeReversedList( ArrayList<String> original){
    int size = original.size();
    ArrayList<String>result = new ArrayList<String>(size);
    for (int i = size-1; i>=0; i--){
      result.add(original.get(i));
    }
    return result;
  }
  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
    int sizeA = a.size();
    int sizeB = b.size();
    ArrayList<String> result = new ArrayList<String>();
    for (int i = 0; i < Math.min(sizeA,sizeB); i++) {
      result.add(a.get(i));
      result.add(b.get(i));
    }
    if (sizeA > sizeB) {
      for (int i = Math.min(sizeA,sizeB)-1; i < sizeA; i ++) {
        result.add(a.get(i));
      }
    }
    if (sizeA < sizeB) {
      for (int i = Math.min(sizeA,sizeB)-1; i < sizeB; i ++) {
        result.add(b.get(i));
      }
    }
    return result;
  }
}