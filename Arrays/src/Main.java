import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);

        for(int i = 0; i < myIntegers.length; i++){
            System.out.println(i);
        }

        /*int [] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //double [] myDoubleArray = new double[10];

        for(int i = 0; i< myIntArray.length; i++){
            myIntArray[i] *= 10;
        }

        printArray(myIntArray);*/
    }

    public static int[] getIntegers(int number){
        System.out.println(number);
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }

        return values;
    }
    /*public static void printArray(int [] array){
        for(int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }*/
}