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

  public static int arr2DSum(int[][] nums){
    int sum = 0;
    for (int i=0; i<nums.length; i++) {
      for (int j=0; j<nums[i].length; j++) {
        sum += nums[i][j];
      }
    }
    return sum;
  }
  
  public static int[][] swapRC(int[][] nums) {
    int rows = nums.length;
    int cols = nums[0].length;
    int[][] swapResult = new int[cols][rows];
    for (int i=0; i<rows; i++) {
      for (int j=0; j<cols; j++) {
        swapResult[j][i] = nums[i][j];
      }
    }
    return swapResult;
  }


  public static void main(String[] args){
    int[] test1d = new int[]{1, 2, 3, 4};
    int[][] test2d = new int[4][2];
    int[][] squareAry = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[][] raggedAry = new int[][]{{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
    int[][] rectangularAry = new int[][]{{10, 11}, {12, 13}, {14, 15}};
    
    System.out.println("1d array expected: [1, 2, 3, 4]\n1d array result: " + arrToString(test1d));
    System.out.println("2d array expected: [[0, 0], [0, 0], [0, 0], [0, 0]]\n2d array result: " + arrToString(test2d));
    System.out.println("square array expected sum: 45\nsquare array result sum: " + arr2DSum(squareAry));
    System.out.println("square array expected swap: [[1, 4, 7], [2, 5, 8], [3, 6, 9]]\nsquare arrayresult: " + arrToString(swapRC(squareAry)));
    System.out.println("ragged array expected: [[1], [2, 3], [4, 5, 6], [7, 8, 9, 10]]\nragged array result: " + arrToString(raggedAry));
    System.out.println("ragged array expected sum: 55\nragged array result sum: " + arr2DSum(raggedAry));
    System.out.println("rectangular array expected: [[10, 11], [12, 13], [14, 15]]\nrectangular array result: " + arrToString(rectangularAry));
    System.out.println("rectangular array expected sum: 75\nrectangular array result sum: " + arr2DSum(rectangularAry));
    System.out.println("rectangular array expected swap: [[10, 12, 14], [11, 13, 15]]\nrectangular array result: " + arrToString(swapRC(rectangularAry)));

  }
}
