import java.io.*;
import java.util.StringTokenizer;

public class MilkPails {

    public static int maxOneVar(int Val, int Max, int v_compare) {
        int max_amount = 0;
        int curr_amount = 0;

        for (int i=0; i<Math.floorDiv(Max,Val); i++) {
            curr_amount = Val*i;
            while (true) {
                if (curr_amount+v_compare <= Max) {
                    curr_amount = curr_amount + v_compare;
                }
                else {
                    break;
                }
            }
            if (curr_amount > max_amount) {
                max_amount = curr_amount;
            }
        }
        return max_amount;
    }

    public static void main(String[] args) throws IOException {
        Kattio io = new Kattio("pails");
        int X = io.nextInt();
        int Y = io.nextInt();
        int M = io.nextInt();
        int C1 = maxOneVar(X, M, Y);
        int C2 = maxOneVar(Y, M, X);
        io.println(Math.max(C1, C2));
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