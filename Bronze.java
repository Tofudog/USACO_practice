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

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class ShellGame {



    private static String[] shells = {"1", "2", "3"};

    public ShellGame() {}


    public static void main(String[] args) {
        int[] scores = {0, 0, 0};
        String file_path = "";
        try {
            File file = new File(file_path);
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                String[] vars = reader.nextLine().split(" ");
                int a = Integer.parseInt(vars[0]);
                int b = Integer.parseInt(vars[1]);
                int g = Integer.parseInt(vars[2]);
                int temp = shells[b-1];
                shells[b-1] = shells[a-1];
                shells[a-1] = temp;
                // calc scores wrt each possible loc
            }

            reader.close();
        }

        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

}








