//Jessie Wang jessiew27@nycstudents.net
//Eunice Wong eunicew4@nycstudents.net

public class ArrayMethods {
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
  public static String arrToString(int[][] ary){
    String result = "[";
    for (int i=0; i<ary.length;i++) {
        result += aryToString(ary[i]);
      if (i<ary.length-1) {
      result += ", ";
      }
    }
    return result+"]";
  }
  public static void main(String[] args){
    int[] test1d = new int[]{1, 2, 3, 4};
    int[][] test2d = new int[4][2];
    System.out.println("expected: [1, 2, 3, 4]\nresult: " + aryToString(test1d));
    System.out.println("expected: [[0, 0], [0, 0], [0, 0], [0, 0]]\nresult: " + arrToString(test2d));
  }
}
