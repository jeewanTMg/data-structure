package linearDataStructure;

public class ArrayDataStructure {

    public static void main(String[] args) {
        initializedAray();
    }

    public static <T> void initializedAray(){
       int[] data = {1,5,3,6,8,9,};
        displayArray(data);
        System.out.println("#############################");
        int[] dataOfString = new int[3];
        dataOfString[0] = 1;
        dataOfString[1] = 2;
        dataOfString[2] = 3;
        displayArray(dataOfString);

        String[] dataOfStringArray = new String[3];
        dataOfStringArray[0] = "Jeewan Thapa Magar";
        dataOfStringArray[1] = "";
        dataOfStringArray[2] = "3";
    }

    public static void displayArray(int[] data) {
        for(int a: data) {
            System.out.println(a);
        }
    }
}
