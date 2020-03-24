public class Guess3 {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch, answer = 'S';

        System.out.println("Зaдyмaнa буква из  диапазона A-Z.");
        System.out.print("Пoпытaйтecь ее  угадать: ");

        ch = (char) System.in.read(); // Получить символ с клавы

        if (ch == answer) System.out.println("***Правильно***");
        else {
            System.out.println(" ... Извинитe, нужная буква находится ");
            //Вложенный оператор if
            if (ch < answer)
                System.out.println(" Ближе к концу алфавита");
            else System.out.println(" Ближе к началу алфавита");
        }
    }
}
