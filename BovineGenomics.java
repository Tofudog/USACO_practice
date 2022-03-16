import java.io.*;
import java.util.StringTokenizer;

public class BovineGenomics {


    public static void main(String[] args) throws IOException {
        Kattio io = new Kattio("cownomics");
        int N = io.nextInt();
        int M = io.nextInt();
        String[] spotty = new String[M];
        for (int i=0; i<N; i++) {
            String line = io.next();
            String[] genes = line.split("");

            for (int pos=0; pos<M; pos++) {
                if (spotty[pos] == null) {
                    spotty[pos] = genes[pos];
                }
                else if (!spotty[pos].contains(genes[pos])) {
                    spotty[pos] = spotty[pos] + genes[pos];
                }
            }
        }
        boolean[] answers = new boolean[M];
        for (int i=0; i<M; i++) {
            answers[i] = true;
        }

        for (int i=0; i<N; i++) {
            String line = io.next();
            for (int pos=0; pos<M; pos++) {
                String gene = line.substring(pos, pos+1);
                if (spotty[pos].contains(gene)) {
                    answers[pos] = false;
                }
            }
        }

        int count = 0;
        for (boolean ans : answers) {
            if (ans) {
                count++;
            }
        }

        io.println(count);
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