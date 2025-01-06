package linearDataStructure.array.arrayproblem;

public class FindSecondLargestElementFromArray {
    public static void main(String[] args) {
        int[]arr = {12,22,45,65};
        int x = secondLargestElementFromArray(arr);
        System.out.println("This is largest Elements "+x);
    }

    private static int secondLargestElementFromArray(int[] arr) {
        int firstLargestInt = -1;
        int secondLargestInt = -1;

        for(int i =0;i<arr.length;i++) {
            if(arr[i]>firstLargestInt) {
                secondLargestInt = firstLargestInt;
                firstLargestInt = arr[i];
            } else if(arr[i]>secondLargestInt && arr[i]<firstLargestInt) {
                secondLargestInt = arr[i];
            }
        }

        return secondLargestInt;
    }
}
