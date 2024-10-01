//Jessie Wang jessiew27@nycstudents.net
//Eunice Wong eunicew4@nycstudents.net
//Axel Stahl axels21@nycstudents.net

public class ArrayMethods {
  public static String arrToString(int[] ary) {
    String result = "[";
    for (int i=0; i<ary.length;i++) {
        result += ary[i];
      if (i<ary.length-1) {
      result += ", ";
      }
    }
    return result+"]";
  }
  public static String arrToString(int[][] ary){
    String result = "[";
    for (int i=0; i<ary.length;i++) {
        result += arrToString(ary[i]);
      if (i<ary.length-1) {
      result += ", ";
      }
    }
    return result+"]";
  }

  public static int arr2DSum(int[][]nums){
    int sum = 0;
    for (int i=0; i<nums.length; i++) {
      for (int j=0; j<nums[i].length; j++) {
        sum += nums[i][j];
      }
    }
    return sum;
  }


  public static void main(String[] args){
    int[] test1d = new int[]{1, 2, 3, 4};
    int[][] test2d = new int[4][2];
    int[][] testSum = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    
    System.out.println("expected: [1, 2, 3, 4]\nresult: " + arrToString(test1d));
    System.out.println("expected: [[0, 0], [0, 0], [0, 0], [0, 0]]\nresult: " + arrToString(test2d));
    System.out.println("expected sum: 45\nresult sum: " + arr2DSum(testSum));
    
  }
}
