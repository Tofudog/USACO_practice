import java.util.*;
import java.io.*;

public class Milk {

    public static int[] Cap;
    public static int[] Milk;

    public Milk(int[] initCap, int[] initMilk) {
        this.Cap = initCap;
        this.Milk = initMilk;
    }

    public static void pour(int i, int j) {
        int amount = Math.min(Milk[i], Milk[j]);
        if (Milk[j] + amount > Cap[j]) {
            int remnant = Milk[j] + Cap[1] - Cap[0];
            Milk[j] = Milk[j] + remnant;
            Milk[i] = Milk[i] - remnant;
        }
    }


    public static void main(String[] args) throws IOException {
        Kattio io = new Kattio("shell");

        int[] C = new int[3];
        int[] M = new int[3];

        for (int i=0; i<3; i++) {
            C[i] = io.nextInt();
            M[i] = io.nextInt();
        }

        Milk milk = new Milk(C, M);

        for (int i=0; i<100; i++) {
            if (i%3 + 1 == 3) {
                milk.pour(2, 0)
            }
            else {
                milk.pour(i%3, i%3+1);
            }
        }

        // write Milk amounts


    }

}
