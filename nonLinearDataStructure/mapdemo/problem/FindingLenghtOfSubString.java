package nonLinearDataStructure.mapdemo.problem;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class FindingLenghtOfSubString {
    public static void main(String[] args) {
        String data = "abcabcbb";

//        int  result = lengthOfLongestSubstring(data);
//        System.out.println(result);


//        String passKey = "5F3Z-2e-9-w";
//
//        String resultOfStringPassKey = licenseKeyFormattingWithoutJoiner(passKey,4);
//        System.out.println(resultOfStringPassKey);

//        String dirInput ="dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";
//
//        int resultOfLenth = lengthLongestPath(dirInput);
//        System.out.println(resultOfLenth);

        String s ="abcdefg";
        String result = reverseStr(s,2);
        System.out.println("reverse result " +result);

    }

    public static String reverseStr(String s, int k) {
        String finalResult = "";
        int substringindex =0;
        if(s.length() == k) {
            reverse(s,k);
        } else {
           while(true) {
               String rotatedataString = s.substring(substringindex,k);
               String result = reverse(rotatedataString,k);
               finalResult = finalResult + result +s.substring(k);
               if(s.substring(k).length() < k) {
                   break;
               }
               substringindex = substringindex+ 2*k;
           }
        }

        return finalResult;
    }

    public static String reverse(String s, int k) {
        char[] data = s.toCharArray();
        int first =0;
        int last = data.length-1;
        while(first <= last) {
            char temp = data[first];
            data[first] = data[last];
            data[last] = temp;
            first++;
            last--;
        }

        return new String(data);

    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int leftIndex = 0;
        int maxLength = 0;

        for (int rightIndex = 0; rightIndex < s.length(); rightIndex++) {
            // If character is already in the map, move the left index to the right of its previous occurrence
            if (map.containsKey(s.charAt(rightIndex))) {
                leftIndex = Math.max(leftIndex, map.get(s.charAt(rightIndex)) + 1);
            }
            map.put(s.charAt(rightIndex), rightIndex);
            maxLength = Math.max(maxLength, rightIndex - leftIndex + 1);
        }

        return maxLength;
    }

    public static String licenseKeyFormatting(String s, int k) {

        StringJoiner joiner = new StringJoiner("-");
        int len = 0;
        String result ="";
        char[] data = s.toCharArray();
        while(data.length-1 >= len) {
            if(data[len] != '-') {
                result = result + data[len];
            }

            if(result.length() == k) {
                joiner.add(result);
                result = "";
            }


            len++;
        }

        String finalResult = joiner.toString();

        return finalResult;

    }


    public static String licenseKeyFormattingWithoutJoiner(String s, int k) {

        String finalResult ="";
        int len = 0;
        String result ="";

        char[] data = s.toCharArray();
        while(data.length-1 >= len) {
            if(data[len] != '-') {
                result = result + data[len];
            }

            if(result.length() == k) {
                if(len == data.length-1) {
                    finalResult = finalResult+result;
                } else {
                    finalResult =finalResult+ result + "-";
                }
                result = "";
            }


            len++;
        }


        return finalResult;

    }

    public static int lengthLongestPath(String input) {

        String[] lines = input.split("\n");
        HashMap<Integer, Integer> pathLength = new HashMap<>();
        pathLength.put(0, 0); // Root directory has length 0
        int maxLength = 0;


        for (String line : lines) {
            int level = line.lastIndexOf("\t") + 1; // Count tabs to get depth level
            int nameLength = line.length() - level; // Actual name length (excluding tabs)
            int currentPathLength = pathLength.get(level) + nameLength + 1; // +1 for '/'

            if (line.contains(".")) { // It's a file
                maxLength = Math.max(maxLength, currentPathLength - 1); // Remove last '/'
            } else { // It's a directory
                pathLength.put(level + 1, currentPathLength);
            }
        }

        return maxLength;
    }

}
