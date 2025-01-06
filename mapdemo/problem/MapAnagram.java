package mapdemo.problem;

import java.util.*;

public class MapAnagram {

    public static List<List<String>> anagramGroupList(String[] data) {
        Map<String, List<String>> valuesMap = new HashMap<>();
        for(String s: data) {
            char[] charArrays = s.toCharArray();
            Arrays.sort(charArrays);
            String sortedKey = new String(charArrays);
            valuesMap.putIfAbsent(sortedKey,new ArrayList<>());
            valuesMap.get(sortedKey).add(s);
        }

        return new ArrayList<>(valuesMap.values());
    }

    public static void main(String[] args) {

        String[] dataInput = {"eat","tea","ate","nat","bat"};
        List<List<String>> result = anagramGroupList(dataInput);
    }
}
