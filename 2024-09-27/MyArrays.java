public class MyArrays {
  public static String aryToString(int[] nums) {
    String result = "[";
    for (int i=0; i<nums.length;i++) {
      if (i == nums.length) {
        result += nums[i];
      }
      result += nums[i] + ", ";
    }
    return result+"]";
  }


  public static int[] returnCopy(int[] ary) {
    int[] copy = new int(ary.length);
    for (int i=0; i<ary.length; i++) {
      copy[i] = ary[i];
    }
    return copy;
  }


  public static void main (String[] args) {
    int[] TestArray = new int {1,2,3,4};
    System.out.print(aryToString(TestArray));
    System.out.println(returnCopy(TestArray));
  }
}
