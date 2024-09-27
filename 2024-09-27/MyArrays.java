public class MyArrays {
  public static String aryToString(int[] nums) {
    String result = "[";
    for (int i=0; i<nums.length;i++) {
      if (i == nums.length-1) {
        result += nums[i];
      }
      result += nums[i] + ", ";
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
    int[] result = new int[ary1.length + ary2.length]l;
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
    int[] original = new int {1,2,3,4};
    int[] copy = returnCopy(original);
    System.out.println("Original: " + 
    
    
  }
}
