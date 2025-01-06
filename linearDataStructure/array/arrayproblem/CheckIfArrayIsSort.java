package linearDataStructure.array.arrayproblem;

public class CheckIfArrayIsSort {
    public static void main(String[] args) {
        int[] arrs ={12,23,1,13};
        boolean isSorted = isArraySorted(arrs);
    }

    private static boolean isArraySorted(int[] arrs) {
        if(arrs.length ==1)
            return true;
        for(int i=1;i<arrs.length;i++) {
            if(arrs[i-1]>arrs[i]) {
                return false;
            }
        }
        return true;
    }
}
