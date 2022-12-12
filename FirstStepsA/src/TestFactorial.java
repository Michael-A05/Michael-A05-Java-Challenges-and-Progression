public class TestFactorial {
    public static void main (String[] args) {
        int number = Integer.parseInt(args[0]);
        int product = 1;
        int factor = 0;

        while ( product < number) {
            factor += 1;
            product *= factor;
        }
        if (product == number) {
            System.out.println(factor);
            System.out.println("");

            /*
            Final value of i is 6.
            6 does not satisfy the condition for the for loop to run.
            So it exits the loop, onto the next lines of code.
            Where it prints 5 (6-1).
            -1 is there to account for the extra increment
             */

            int i;
            for (i = 1; i < factor+1; i++) {
                System.out.println(i);
            }
            System.out.println("");
            System.out.println(i-1);
        }
    }
}
