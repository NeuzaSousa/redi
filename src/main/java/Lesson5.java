import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        //System.out.println("Non Recursion : " +sumArray(testArray));

        //System.out.println("Using Recursion : " +sumArrayRecursion(testArray,testArray.length));

        int[] testArray = new int[] { 1,2,3,4,5,6,7,89,9,10 };
        minimumValueAndAverage(testArray);
        isPalindrome("MadAm"); // Palindrome
        isPalindrome("SomeWords"); //Not a Palindrome
        String[] testString = {"Hey, this is some random string, doesn't makes sense, but who cares.",
                "Some other string",
                "This is a String."};

        for (String str: testString) {
            System.out.println(str + " : "+ countVowels(str) + " vowels");
        }
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

    public static void minimumValueAndAverage(int[] intArray){
        int minimum = Integer.MAX_VALUE; // Set to a very high value
        float sum = 0;
        int index = -1;

        for (int i = 0; i < intArray.length-1 ; i++) {
            minimum = Math.min(intArray[i],minimum); //minimum = intArray[i] < minimum ?  intArray[i] : minimum;
            sum +=intArray[i];
            index = i;
        }

        System.out.println("Minimum value  is : "+ minimum + " and it's  at index : "+ index);
        System.out.println("Average of the array is :" + String.format("%.2f",sum/ intArray.length));

    }

    public static void isPalindrome(String stringWord){
        if (stringWord.equalsIgnoreCase(new StringBuilder(stringWord).reverse().toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static int countVowels(String str) {

        char[] vowels = {'a','e','i','o','u'};
        int count = 0;
        // Convert all to lower case, cause we will check lowerc
        str = str.toLowerCase();

        //TODO: Check more compact and optimal way of comparison.
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;

    }
}
