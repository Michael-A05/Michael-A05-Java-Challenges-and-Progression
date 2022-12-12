public class Challenge6 {
    public static void main(String[] args) {

      int number = Integer.parseInt(args[0]);
      String numString = Integer.toString(number);

      String res = new StringBuffer(numString).reverse().toString();

      System.out.println(res);

    }
}

