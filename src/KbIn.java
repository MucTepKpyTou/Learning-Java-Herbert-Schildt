public class KbIn {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch;
        System.out.println("Нажмите любую клавишу, а затем ENTER");
        ch = (char) System.in.read(); //получить символ с клавиатуры
        System.out.println(" Вы нажали клавишу " + ch);
    }
}

