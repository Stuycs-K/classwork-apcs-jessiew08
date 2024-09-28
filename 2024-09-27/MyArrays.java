public class MyArrays {
  public static String aryToString(int[] nums) {
    String result = "[";
    for (int i=0; i<nums.length;i++) {
        result += nums[i];
      if (i<nums.length-1) {
      result += ", ";
      }
    }
    return result+"]";
  }


  public static int[] returnCopy(int[] ary) {
    int[] copy = new int[ary.length];
    for (int i=0; i<ary.length; i++) {
      copy[i] = ary[i];
    }
    return copy;
  }
  
  public static int[] concatArray(int[] ary1, int[] ary2) {
    int[] result = new int[ary1.length + ary2.length];
    int index = 0;
    for (int i=0; i<ary1.length; i++) {
      result[index++] = ary1[i];
    }
    for (int i=0; i<ary2.length; i++) {
      result[index++] = ary2[i];
    }
    return result;
  }


  public static void main (String[] args) {
    int[] original = new int[] {1,2,3,4};
    int[] copy = returnCopy(original);
    System.out.println("Original: " + aryToString(original));
    System.out.println("Copy: " + aryToString(copy));
    System.out.println("Check: " + (original == copy));

    int[] original2 = new int[] {13,15,6,7,0};
    int[] copy2 = returnCopy(original);
    System.out.println("Original: " + aryToString(original2));
    System.out.println("Copy: " + aryToString(copy2));
    System.out.println("Check: " + (original2 == copy2));

    int[] ary1 = new int[] {1,2,3,4};
    int[] ary2 = new int[] {5,6,7,8};
    int[] concat = concatArray(ary1, ary2);
    System.out.println("Concatenated: " + aryToString(concat)); 

    int[] ary3 = new int[] {15,61,7,10};
    int[] ary4 = new int[] {101,12,13};
    int[] concat2 = concatArray(ary3, ary4);
    System.out.println("Concatenated: " + aryToString(concat2)); 
  }
}
