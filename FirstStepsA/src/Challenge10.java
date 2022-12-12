public class Challenge10 {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        int prev1 = 1;
        int prev2 = 1;
        for (int i=0; i<n; i++){
            int currentValue = prev1 + prev2;
            System.out.println(currentValue);
            prev2 = prev1;
            prev1 = currentValue;
        }
    }
}
