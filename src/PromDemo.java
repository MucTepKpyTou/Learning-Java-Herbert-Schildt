public class PromDemo {
    public static void main(String[] args) {
        byte b;
        int i;

        b=10;
        i=b*b; // Приведение типов не требуется потому что уже повышен до int

        b=10;
        b=(byte) (b*b); //При умножении для присваивания значения int переменной byte требуется приведение
        System.out.println("i and b: " +i+ " " +b);
    }
}
