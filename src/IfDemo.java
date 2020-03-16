public class IfDemo {
    public static void main(String[] args) {
        int a, b, c;
        a = 2;
        b = 3;

        if (a < b) {
            System.out.println(" а меньше б ");   // следующую строку вы увидеть не должны
        }
        if (b == a) {
            System.out.println(" этот текст не будет выведен");  //вот эту...
        }
        System.out.println();

        c = a - b; // с приняло значение -1
        System.out.println("c равняется -1 ");
        if (c >= 0) {
            System.out.println("c не отрицательное число");
        }
        if (c < 0) {
            System.out.println("c отрицательное число");
        }
        System.out.println();

        c = b - a; //-1=2-3
        System.out.println("c равняется 1 ");
        if (c >= 0) {
            System.out.println("c  - не  отрицательное число");
        }
        if (c < 0) {
            System.out.println("c - отрицательное число");
        }

    }
}
