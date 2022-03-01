public class Bronze {

    private final int N = 10;
    private final int K = 7;

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


    public static void main(String[] args) {
        Bronze bronze = new Bronze();
        bronze.wordProcessor("hello my name is Bessie and this is my essay");
    }
}