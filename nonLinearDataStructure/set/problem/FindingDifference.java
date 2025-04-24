package nonLinearDataStructure.set.problem;

import java.util.*;
import java.util.stream.Collectors;

public class FindingDifference {

    public static void main(String[] args) {
        int[] input1 ={1,2,3};
        int[] input2 = {2,4,6};
        List<List<Integer>> difference = findDifference(input1, input2);
        for(List<Integer>data: difference) {
            System.out.println(data);
        }
    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> commonValue = new ArrayList<>();
        for(int i =0;i<nums1.length;i++) {
            int left =0;
            while(left<nums2.length) {
                if(nums1[i] ==nums2[left]) {
                    commonValue.add(nums1[i]);
                }
                left++;
            }
        }

        List<List<Integer>>result = new ArrayList<>();
        List<Integer> collect = Arrays.stream(nums1).boxed().filter(value -> !commonValue.contains(value)).distinct().collect(Collectors.toList());
        List<Integer> collect1 = Arrays.stream(nums2).boxed().filter(value -> !commonValue.contains(value)).distinct().collect(Collectors.toList());
        result.add(collect);
        result.add(collect1);

        return result;

    }


}
