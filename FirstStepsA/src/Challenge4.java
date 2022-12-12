public class Challenge4 {
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

        }
    }
}
