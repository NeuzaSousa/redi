import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        int[] testArray = {1,6,4,2,3,7,3,2,2,8,9,4,2,-3,9};
        //System.out.println("Non Recursion : " +sumArray(testArray));

        //System.out.println("Using Recursion : " +sumArrayRecursion(testArray,testArray.length));

        stringPretiffy();

    }


    public static int sumArray(int[] intArray) {
        int sum = 0;
        for (int i: intArray) {
            sum += i;
        }
        return sum;
    }


    public static  int sumArrayRecursion(int[] intArray, int arrayLength) {
        if (arrayLength <= 0)
            return 0;
        return intArray[arrayLength - 1] + sumArrayRecursion(intArray, arrayLength - 1) ;

    }

    public static void stringPretiffy(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputStr = input.nextLine();

        System.out.print("Enter the separator: ");
        char separator = input.next().charAt(0);
        for (char c: inputStr.toCharArray()) {
            System.out.print(c + "" + separator);
        }
    }
}
