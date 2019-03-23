public class PartialArrayReverse {

  // Reverse partial array
  // Input - {1,2,3,4,5,6,7,8,9}  start=2, end=5
  // Reverse elements 2 to 5.
  // Output - 1 2 6 5 4 3 7 8 9 
  public static void partialReverse(int[] arr, int start, int end) {
    int loopcnt=end;
    for (int i=start; i<loopcnt; i++) {
      System.out.println("Swapping "+i+" and "+loopcnt);
      int temp = arr[i];
      arr[i] = arr[loopcnt];
      arr[loopcnt] = temp;
      loopcnt--;
    }
    for (int i =0; i<arr.length; i++)
          System.out.print(arr[i]+" ");
    System.out.println();
  }
    
  public static void main(String[] args) {
    int[] input = {1,2,3,4,5,6,7,8,9};
    partialReverse(input, 2,5);
  }
}
