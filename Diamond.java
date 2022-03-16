import java.io.*;
import java.util.StringTokenizer;

public class Diamond {


    public static void main(String[] args) throws IOException {
        Kattio io = new Kattio("diamond");
        int N = io.nextInt();
        int K = io.nextInt();
        Integer[] diamonds = new Integer[N];
        // Adding all diamonds
        for (int i=0; i<N; i++) {
            diamonds[i] = io.nextInt();
        }

        int max_amt = 0;

        for (int i=0; i<diamonds.length; i++) {

            int curr_amt = 0;

            for (int j=0; j<diamonds.length; j++) {
                if (diamonds[j] >= diamonds[i] && diamonds[j] <= diamonds[i]+K) {
                    curr_amt++;
                }
            }
            if (curr_amt > max_amt) {
                max_amt = curr_amt;
            }
        }

        io.println(max_amt);
        io.close();
    }

    static class Kattio extends PrintWriter {
        private BufferedReader r;
        private StringTokenizer st;

        public Kattio() { this(System.in, System.out); }
        public Kattio(InputStream i, OutputStream o) {
            super(o);
            r = new BufferedReader(new InputStreamReader(i));
        }

        public Kattio(String problemName) throws IOException {
            super(problemName + ".out");
            r = new BufferedReader(new FileReader(problemName + ".in"));
        }

        public String next() {
            try {
                while (st == null || !st.hasMoreTokens())
                    st = new StringTokenizer(r.readLine());
                return st.nextToken();
            } catch (Exception e) { }
            return null;
        }
        public int nextInt() { return Integer.parseInt(next()); }
        public double nextDouble() { return Double.parseDouble(next()); }
        public long nextLong() { return Long.parseLong(next()); }
    }

}