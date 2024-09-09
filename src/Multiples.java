public class Multiples {

    public static void main(String[] args) {
        // Looking for non-negative multiples of 3 or 5
        int count = 0;

        for (int i = 1; i < 1000; i++) {
            if ((i % 3 == 0)  || (i % 5 == 0)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
