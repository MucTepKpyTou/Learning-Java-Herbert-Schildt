public class Guess {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch, answer = 'S';

        System.out.println("Зaдyмaнa буква из  диапазона A-Z.");
        System.out.print("Пoпытaйтecь ее  угадать: ");

        ch = (char) System.in.read(); // Получить символ с клавы

        if (ch == answer) System.out.println("***Правильно***");
    }
}
