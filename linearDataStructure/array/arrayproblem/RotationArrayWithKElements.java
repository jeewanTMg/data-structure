package linearDataStructure.array.arrayproblem;

import java.util.*;

public class RotationArrayWithKElements {
    public static void main(String[] args) {
        int[]arr = {12,22,45,65};

        int[]result = rotationOfArryWithKnumber(arr,2);
        Arrays.stream(result).forEach(System.out::println);
    }


    public static int [] rotationOfArryWithKnumber(int[] array, int k) {
        int [] result;
        if(array.length < 1) {
            return array;
        }

        rotateArray(array,0,array.length-1);
        rotateArray(array,k,array.length-1);
        rotateArray(array,0,k-1);

        return array;

    }

    public static int[] rotateArray(int[] array, int start, int end) {
        while(start< end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }



}


class Solution {

    public static void main(String[] args) {
       /* char data = findTheDifferenceWithXor("abcd","abcde");
        System.out.println(data);*/

        int abcabdd = lengthOfLongestSubstring("aab");
        System.out.println(abcabdd);
    }
    public static char findTheDifference(String s, String t) {

        char[] stringTarget = t.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        s.chars().forEach(data->map.put((char)data,0));

        char result ='0';

        for(int i = 0; i<stringTarget.length;i++) {
            char containKeyData = stringTarget[i];
            if(!map.containsKey(containKeyData)) {
                result= stringTarget[i];
            }
        }
        return result;
    }

    public static char findTheDifferenceWithXor(String s, String t) {
        char result =0;
        for(char x : s.toCharArray()) {
            result ^=x;
        }

        for(char x : t.toCharArray()) {
            result ^=x;
        }
   return result;
    }


    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int leftIndex = 0;
        String result = "";
        Set set = new HashSet();
        for(int i=0;i<s.length();i++){
           while(set.contains(s.charAt(i))) {
               set.remove(s.charAt(leftIndex));
               leftIndex++;
           }
         set.add(s.charAt(i));
           maxLength = Math.max(maxLength, i-leftIndex+1);
        }
        return maxLength;

    }



}