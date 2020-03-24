public class LogicalOpTableMOD {
    public static void main(String[] args) {
        boolean p, q;
        int t = 1, f = 0;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = true;
        q = true;
        if (p & q) System.out.print(t + "\t" + t + "\t");
        if ((p & q) & (p | q)) System.out.print(t + "\t" + t + "\t");
        if ((p & q) & (!p)) System.out.println(f + "\t" + f);
        else System.out.println(f + "\t" + f);

        p = true;
        q = false;
        if (p & q) System.out.print(t + "\t" + f + "\t");
        else System.out.print(t + "\t" + f + "\t");
        if ((p & q) & (p | q)) System.out.print(f + "\t" + t + "\t");
        else System.out.print(f + "\t" + t + "\t");
        if ((p ^ q) & (!p)) System.out.println(t + "\t" + f);
        else System.out.println(t + "\t" + f);

        p = false;
        q = true;
        if (p & q) System.out.print(f + "\t" + t + "\t");
        else System.out.print(f + "\t" + t + "\t");
        if ((p & q) & (p | q)) System.out.print(f + "\t" + t + "\t");
        else System.out.print(f + "\t" + t + "\t");
        if ((p ^ q) & (!p))System.out.println(t + "\t" + t);

        p = false;
        q = false;
        if (p & q) System.out.print(f + "\t" + f + "\t");
        else System.out.print(f + "\t" + f + "\t");
        if ((p & q) & (p | q)) System.out.print(f + "\t" + f + "\t");
        else System.out.print(f + "\t" + f + "\t");
        if ((p ^ q) & (!p)) System.out.println(f + "\t" + t);
        else System.out.println(f + "\t" + t);
    }
}
