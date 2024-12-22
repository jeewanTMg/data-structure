package linearDataStructure.arrayproblem;

import java.util.ArrayList;
import java.util.List;

public class FindingLeardsInArray {
    public static void main(String[] args) {
        int[] data = {16, 17, 4, 3, 5, 2};
        int[] leaders = findingLeadersInArray(data);
        for(int x: leaders) {
            System.out.println("leaders "+x);
        }
    }

    private static int[] findingLeadersInArray(int[] data) {
        boolean isLeader = true;
        List<Integer> leaders = new ArrayList<>();
        for(int i =0;i<data.length;i++) {
            for(int j =i+1;j<data.length;j++) {
                if(data[i]<data[j]) {
                    isLeader = false;
                    break;
                } else {
                    isLeader = true;
                }
            }
            if(isLeader) {
                leaders.add(data[i]);
            }
        }
        //Alernative way to do it add dependency for Ints
       // int[]result = Ints.toArray(leaders)
        return leaders.stream().mapToInt(Integer::intValue).toArray();
    }
}
