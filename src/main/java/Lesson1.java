public class Lesson1 {
    public static void main(String[] args) {
        square(1, 3);
        square(5, 6);
    }

    public static void square(int x, int y) {
        for(int i = x; i<=y; i++) {
            System.out.println("" + i + " - " + i * i);
        }
    }

}

