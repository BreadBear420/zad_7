public class Test {
    public static void main(String[] args) {
        int n;
        try {
            n=Integer.parseInt(args[0]);
        }
        catch (NumberFormatException ex) {
            System.out.println("Nieprawidłowa dana");
            return;
        }
        try {
            if (n < 0) {
                throw new RangeException();
            }
        }
        catch(RangeException ex) {
            System.out.println(args[0] + " - " + ex);
            return;
        }
        WierszTrojkataPascala Test1 = new WierszTrojkataPascala(n);
        int m;
        for (int i = 1; i < args.length; i++) {
            try {
                m=Integer.parseInt(args[i]);
            }
            catch (NumberFormatException ex) {
                System.out.println(args[i] + " - nieprawidlowa dana");
                continue;
            }
            try {
                if ((m < 0) || (m > n)) {
                    throw new RangeException();
                }
            }
            catch(RangeException ex) {
                System.out.println(args[i] + " - " + ex);
                continue;
            }
            System.out.println(args[i] + " - " + Test1.wspolczynnik(m));
        }
    }
}
