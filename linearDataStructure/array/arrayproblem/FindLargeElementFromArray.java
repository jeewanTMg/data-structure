package linearDataStructure.array.arrayproblem;

import java.util.Arrays;

public class FindLargeElementFromArray {
    public static void main(String[] args) {
        int[] data = {1,5,3,6,8,9,};
        System.out.println("This is the LargestNumber in Array "+findingLargeElementFromArray(data));

        System.out.println("##########################################");
        System.out.println("This is largest Elements: "+findingLargestElementFromArraySolution2(data) );
        System.out.println("##########################################");
        System.out.println("This is largest Elements: "+findingLargestElementFromArraySolution3(data) );
        System.out.println("##########################################");
        System.out.println("This is largest Elements: "+findingLargestElementFromArraySolution4(data) );
    }

    public static int findingLargeElementFromArray(int[]data) {
        if(data.length <= 1) {
            return data[0];
        }
        int mid = data.length/2;
        int[]left = new int[mid];
        for(int i= 0; i<mid;i++) {
           left[i] = data[i];
        }
        int [] right = new int[data.length-mid];
        for(int i = mid; i<data.length;i++) {
            right[i-mid] = data[i];
        }
        int leftLargestNumber = findingLargeElementFromArray(left);
        int rightLargestNumber = findingLargeElementFromArray(right);
        return Math.max(leftLargestNumber,rightLargestNumber);
    }

    public static int findingLargestElementFromArraySolution2(int[]data) {
        Arrays.sort(data);
        return data[data.length-1];
    }

    public static int findingLargestElementFromArraySolution3(int[]data) {
        //Using java 8
        return Arrays.stream(data).max().getAsInt();
    }
    public static int findingLargestElementFromArraySolution4(int[]data) {
        for(int i = 0; i<data.length-1;i++) {
            for(int j = i+1; j<data.length;j++) {
                if(data[i]<data[j]){
                    swap(data, i,j);
                }
            }
        }

        for(int x: data) {
            System.out.print(x+" ");
        }
        return data[0];
    }

    private static void swap(int[]data,int data1, int data2) {
        int temp = data[data1];
        data[data1]= data[data2];
        data[data2] = temp;
    }
}
