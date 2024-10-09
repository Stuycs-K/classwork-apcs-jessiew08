import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()

    int[] array1D = {1, 2, 3, 4, 5};
    System.out.println("Testing arrToString (1D):");
    System.out.println("Expected: " + Arrays.toString(array1D));
    System.out.println("Actual: " + arrToString(array1D));
    System.out.println();

    int[][] array2D = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
    System.out.println("Testing arrToString (2D):");
    System.out.println("Expected: " + Arrays.deepToString(array2D));
    System.out.println("Actual: " + arrToString(array2D));
    System.out.println();

    int[][] arrayWithZeros = {{0, 1, 2}, {3, 0, 4}, {0, 0, 0}};
    System.out.println("Testing countZeros2D:");
    System.out.println("Expected: 5");
    System.out.println("Actual: " + countZeros2D(arrayWithZeros));
    System.out.println();

    int[][] arrayToSum = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println("Testing arr2DSum:");
    System.out.println("Expected: 45");
    System.out.println("Actual: " + arr2DSum(arrayToSum));
    System.out.println();

    
    int[][] original = {{1, 2}, {3, 4}, {5, 6}};
    int[][] copy = copy(original);
    original[0][0] = 99;
    System.out.println("Testing Copy:");
    System.out.println("original changed: [[99, 2], [3, 4], [5, 6]]\ncopy result: " + arrToString(copy));
    System.out.println();

    int[][] arrayToSwap = {{1, 2, 3}, {4, 5, 6}};
    System.out.println("Testing swapRC:");
    System.out.println("Expected: [[1, 4], [2, 5], [3, 6]]");
    System.out.println("Actual: " + arrToString(swapRC(arrayToSwap)));
    System.out.println();

    int[][] arrayForHtml = {{1, 2}, {3}, {4, 5, 6}};
    System.out.println("Testing htmlTable:");
    System.out.println("Expected: <table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr><tr><td>4</td><td>5</td><td>6</td></tr></table>");
    System.out.println("Actual: " + htmlTable(arrayForHtml));

  }


  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[]ary){
    String result = "[";
    for (int i=0; i<ary.length;i++) {
        result += ary[i];
      if (i<ary.length-1) {
      result += ", ";
      }
    }
    return result+"]";
  }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary){
    String result = "[";
    for (int i=0; i<ary.length;i++) {
        result += arrToString(ary[i]);
      if (i<ary.length-1) {
      result += ", ";
      }
    }
    return result+"]";
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int count = 0;
    for (int i=0; i<nums.length; i++) {
      for (int j=0; j<nums[i].length;j++) {
        if (nums[i][j] == 0) {
          count += 1;
        }
      }
    }
    return count;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][]nums){
    int sum = 0;
    for (int i=0; i<nums.length; i++) {
      for (int j=0; j<nums[i].length; j++) {
        sum += nums[i][j];
      }
    }
    return sum;
  }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static int[][] replaceNegative(int[][] vals){
    for (int i=0; i<vals.length; i++) {
      for (int j=0; j<vals[i].length; j++) {
        if (vals[i][j] < 0) {
          if (i==j) {
            vals[i][j]=1;
          }
          else {
            vals[i][j]=0;
          }
        }
      }
    }
    return vals;
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[] copyRow(int[] row) {
    int[] newRow = new int[row.length];
    for (int i=0; i<row.length; i++) {
      newRow[i] = row[i];
    }
    return newRow;
 }

  public static int[][] copy(int[][] nums) {
    int[][] copyArray = new int[nums.length][];
    for (int i=0; i<nums.length; i++) {
      copyArray[i] = copyRow(nums[i]);
    }
    return copyArray;
  }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
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


  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][] nums) {
    String table = "<table>";
    for (int i = 0; i < nums.length; i++) {
      table += "<tr>";
      for (int j = 0; j < nums[i].length; j++) {
        table += "<td>" + nums[i][j] + "</td>";
      }
      table += "</tr>";
    }
    table += "</table>";
    return table;
  }
}
