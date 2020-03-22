public class VesNaLune {
    public static void main(String[] args) {
        float ves1 = 74.50f; // вес на земле
        int prc1 = 17;
        float ves2 = ves1 / 100; // 1%
        float ves3 = ves2 * prc1;
        System.out.println("Ваш вес на луне строкой ниже");
        System.out.println(ves3);

    }
}
