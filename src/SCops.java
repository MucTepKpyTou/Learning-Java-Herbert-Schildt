public class SCops {
    public static void main(String[] args) {
        int n, d;
        n = 10;
        d = 2;
        if (d != 0 && (n % d) == 0)
            System.out.println(d + " является делителем " + n);
        d = 0;
        //  Второй операнд не  вычисляется, поскольку значение
        //  переменной d  равно нулю
        if (d != 0 && (n % d) == 0)
            System.out.println(d + " является делителем " + n);

        // А теперь те же самые действия но вместо && в результате возникает ошибка деление на ноль
        // if (d != 0 & (n % d) == 0)
        System.out.println(d + " является делителем " + n);
    }
}
