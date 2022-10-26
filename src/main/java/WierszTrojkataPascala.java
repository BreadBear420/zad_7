public class WierszTrojkataPascala {
    long Tab[];
    public WierszTrojkataPascala(int n) {
        Tab = new long[n+1];
        Tab[0] = 1;
        Tab[n] = 1;
        for (int i = 1; i <= n/2; i++) {
            Tab[i] = (Tab[i-1] * Long.valueOf(n-i+1))/Long.valueOf(i);
            Tab[n-i] = Tab[i];
        }
    }
    public long wspolczynnik(int m) {
        return Tab[m];
    }
}