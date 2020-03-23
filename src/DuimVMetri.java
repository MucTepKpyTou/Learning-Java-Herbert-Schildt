public class DuimVMetri {


    public static void main(String[] args) {
        double duim, metr;
        int counter;
        counter = 0;
        for (duim = 1; duim <= 144; duim++) {
            metr = duim / 39.37;
            System.out.println(duim + " Дюймов это " + metr + " метра.");
            counter++;
            if (counter == 12) { //через каждый 12 строк будет пустая строка
                System.out.println();
                counter = 0;
            }
        }

    }
}


