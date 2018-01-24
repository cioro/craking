package algorithms;

public class CodingTest {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; ++i) {
            String result = Integer.toString(i);
            if (i % 15 == 0) {
                result = "CracklePop";
            } else if (i % 3 == 0) {
                result = "Crackle";
            } else if (i % 5 == 0) {
                result = "Pop";
            }

            System.out.println(result);
        }
    }
}
