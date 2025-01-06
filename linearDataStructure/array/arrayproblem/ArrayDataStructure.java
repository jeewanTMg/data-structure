package linearDataStructure.array.arrayproblem;

public class ArrayDataStructure {

    public static void main(String[] args) {
        initializedAray();
    }

    public static <T> void initializedAray(){
       int[] data = {1,5,3,6,8,9,};
        displayIntArray(data);
        System.out.println("#############################");
        int[] dataOfString = new int[3];
        dataOfString[0] = 1;
        dataOfString[1] = 2;
        dataOfString[2] = 3;
        displayIntArray(dataOfString);

        String[] dataOfStringArray = new String[3];
        dataOfStringArray[0] = "Jeewan Thapa Magar";
        dataOfStringArray[1] = "";
        dataOfStringArray[2] = "3";
        displayStrinArray(dataOfStringArray);

    }

    public static void displayIntArray(int[] data) {
        for(int a: data) {
            System.out.println(a);
        }
    }

    public static void displayStrinArray(String[] data) {
        for(String a: data) {
            System.out.println(a);
        }
    }
}
