public class LogicalOpTableMOD3 {
    public static void main(String[] args) {
        byte p, q, i;
        boolean s;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        s = false;
        p = 1;
        q = 1;
        i = 1;
        if (p == 1 | p != 0) s = true;
        if (s) i = 0;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (i));

        s = false;
        p = 1;
        q = 0;
        i = 1;
        if (p == 1 | p != 0) s = true;
        if (s) i = 0;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (i));

        s = false;
        p = 0;
        q = 1;
        i = 1;
        if (p == 1 | p != 0) s = true;
        if (s) i = 0;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (i));

        s = false;
        p = 0;
        q = 0;
        i = 1;
        if (p == 1 | p != 0) s = true;
        if (s) i = 0;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (i));
    }
}