public class NoBreak {
    public static void main(String[] args) {
        int i;
        for (i = 0; i <= 5; i++) {
            switch (i) {
                case 0:
                    System.out.println("i меньше еденицы ");
                case 1:
                    System.out.println("i меньше двух");
                case 2:
                    System.out.println("i меньше трех");
                case 3:
                    System.out.println("i меньше четырех");
                case 4:
                    System.out.println("i меньше пяти");
            }
            System.out.println();
        }
    }
}
// switch(i)
// case 1:
// case 2:
// case 3:  System.out.println("i равно 1,  2 или З");
// break;
// case 4:  System.out.println("i равно 4");
// break;
// Если в приведенном выше фрагменте кода переменная i имеет значение
// 1, 2 или 3, то вызывается первый метод println ().
// А если ее значение равно 4, вызывается второй метод println ().
// Такое расположение нескольких пустых ветвей case подряд
// нередко используется в тех случаях, когда нескольким ветвям
// должен соответствовать один и тот же общий код.