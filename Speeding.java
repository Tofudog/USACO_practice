import java.io.*;
import java.util.*;





class Kattio extends PrintWriter {
    private BufferedReader r;
    private StringTokenizer st;
    // standard input
    public Kattio() { this(System.in,System.out); }
    public Kattio(InputStream i, OutputStream o) {
        super(o);
        r = new BufferedReader(new InputStreamReader(i));
    }
    // USACO-style file input
    public Kattio(String problemName) throws IOException {
        super(problemName+".out");
        r = new BufferedReader(new FileReader(problemName+".in"));
    }
    // returns null if no more input
    public String next() {
        try {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(r.readLine());
            return st.nextToken();
        } catch (Exception e) {}
        return null;
    }
    public int nextInt() { return Integer.parseInt(next()); }
    public double nextDouble() { return Double.parseDouble(next()); }
    public long nextLong() { return Long.parseLong(next()); }
}




public class Speeding
{


    public static int[] lenSegment;
    public static int[] speedLimit;
    public static int[] lenDriven;
    public static int[] speedDriven;

    public Speeding() {}

    // Either seg len & and speed limit, or drive len & speed driven
    public static void addParams(int Len, int Speed, int Idx, boolean Bessie) {
        if (Bessie) {
            lenDriven[Idx] = Len;
            speedDriven[Idx] = Speed[Idx]
        }
        else {
            lenSegment[Idx] = Len;
            speedLimit[Idx] = Speed[Idx]
        }
    }

    public static void subtractLength(int n, int m) {
        int segment = Math.min(lenSegment[n], lenDriven[m]);
        lenSegment[n] = lenSegment[n] - segment;
        lenDriven[n] = lenDriven[n] - segment;
    }




    public static void main(String[] args) {
        Speeding speeding = new Speeding();
        Kattio io = new Kattio("speeding");
        int N = io.nextInt();
        int M = io.nextInt();
        for (int n=0; n<3; n++) {
            int len = io.nextInt();
            int limitS = io.nextInt();
            speeding.addParams(len, limitS, n, false);
        }
        for (int m=0; m<3; m++) {
            int len = io.nextInt();
            int driveS = io.nextInt();
            speeding.addParams(len, driveS, m, true);
        }

        int n = 0;
        int m = 0;

        // tentative
        while (n<3 && m<3) {

            int segment = Math.min(speeding.lenSegment[n], speeding.lenDriven[m]);


        }


    }


}


















