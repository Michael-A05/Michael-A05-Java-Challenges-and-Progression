public class Challenge7 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        Boolean x = isPrime(number);

        String numString = Integer.toString(number);
        if (x) {
            System.out.println(numString + " is a prime number" );

        } else {
            System.out.println(numString + " is not a prime number");
        }

    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else if (number == 2) {
            return true;

        }   for (int i=2; i<number; i++) {
            if (number % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}
