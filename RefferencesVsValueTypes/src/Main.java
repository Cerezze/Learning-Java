import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println(myIntValue);
        System.out.println(anotherIntValue);

        anotherIntValue++;

        System.out.println(myIntValue);
        System.out.println(anotherIntValue);*/

        int [] myIntArray = new int[5];
        int [] anotherIntArray = myIntArray;

        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(anotherIntArray));

        anotherIntArray[0] = 1;

        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(anotherIntArray));
    }
}