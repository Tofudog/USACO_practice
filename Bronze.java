import java.io.*;
import java.util.StringTokenizer;



public class Bronze {

    private static int N = 10;
    private static int K = 7;

    public Bronze(String N&K) {
        this.N = Integer.parseInt(N&K.split(" ")[0]);
        this.K = Integer.parseInt(N&K.split(" ")[1]);
    }

    public void wordProcessor(String line) {

        int currK = 0;
        for (String word : line.split(" ")) {

            if (currK + word.length() <= K) {
                System.out.print(word + " ");
                currK = currK + word.length();
            }
            else {
                System.out.println();
                System.out.print(word + " ");
                currK = word.length();
            }

        }

    }


    public static void main(String[] args) throws new IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(r.readLine());
        String constraints = st.nextToken();
        Bronze bronze = new Bronze(constraints);
        bronze.wordProcessor("hello my name is Bessie and this is my essay");
        pw.close();
    }
}