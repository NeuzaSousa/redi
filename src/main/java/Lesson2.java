import java.util.ArrayList;

public class Lesson2 {
    public static void main(String[] args) {

        //print java
        printJava();

        System.out.println("==========================");
        String testString = "Some random text";
        System.out.println(reverseString(testString));

        System.out.println("\n==========================");
        int testNumber = 15;
        System.out.println("Digits : " + testNumber + " = " + getSumOfDigits(testNumber));

        System.out.println("\n==========================");
        System.out.println("Digits : " + testNumber + " = " + getSumOfDigitsModulos(testNumber));

        System.out.println("\n==========================");
        UniqueDigits();
    }

    static void printJava() {
        System.out.println("Exercise 1.");
        System.out.println("\u001B[31m   J \u001B[0m   a   v     v  a");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
    }


    static String reverseString(String string) {
        System.out.println("Exercise 2.");
        // needs to convert string to character array
        char[] temp = string.toCharArray();

        String result = "";
        //save backwards
        for (int i = temp.length - 1; i >= 0; i--) {
            //System.out.print(temp[i]);
            result += temp[i];
        }
        return result;
    }

    public static int getSumOfDigits(int number) {
        System.out.println("Exercise 3.");
        int result = 0;
        //Convert integer to string and char array, then convert each char back integer and summup
        String numberString = String.valueOf(number);

        char[] temp = numberString.toCharArray();
        //Foreach character, convert to
        for (char c : temp) {
            result += Integer.parseInt(String.valueOf(c));
        }
        return result;
    }

    public static int getSumOfDigitsModulos(int number) {
        System.out.println("Exercise 3. - Using Modulo.:q");
        int sum = 0, modulo;
        // read number here
        while (number > 0) {
            modulo = number % 10;
            sum += modulo;
            number = number / 10;
        }
        return sum;
    }

    public static void UniqueDigits() {
        System.out.println("Exercise 4.");
        ArrayList<String> validValues = new ArrayList<>();
        int n = 4; // to be used for nested loop depths, also controls number of characters  [1,2,3,4]

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    // check that k != j &&  j != i
                    if (i != j && j != k && i != k) {
                        var temp = String.valueOf(i) + String.valueOf(j) + String.valueOf(k);
                        validValues.add(temp);
                    }
                }
            }
        }

        for (String entry : validValues) {
            System.out.println(entry);
        }
        System.out.println("There are " + validValues.size() + " entries ");
        System.out.println("========================= ");
    }
}
