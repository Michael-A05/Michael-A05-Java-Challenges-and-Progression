import java.util.ArrayList;
import java.util.Collections;

public class Challenge8 {
    public static void main(String[] args) {


        int num0 = Integer.parseInt(args[0]);
        int num1 = Integer.parseInt(args[1]);

        ArrayList<Integer> factorsNum0 = new ArrayList<Integer>();
        ArrayList<Integer> factorsNum1 = new ArrayList<Integer>();
        ArrayList<Integer> commonFactors = new ArrayList<Integer>();


        for (int i = 1; i < num0 + 1; i++) {
            if (num0 % i == 0) {
                factorsNum0.add(i);
            }
        }
        for (int i = 1; i < num1 + 1; i++) {
            if (num1 % i == 0) {
                factorsNum1.add(i);
            }

        }
        if (factorsNum0.size() > factorsNum1.size()) {
            ArrayList<Integer> larger = new ArrayList<Integer>(factorsNum0);
            ArrayList<Integer> smaller = new ArrayList<Integer>(factorsNum1);

            for (int x = 0; x < smaller.size(); x++) {
                if (larger.contains(smaller.get(x))) {
                    commonFactors.add(smaller.get(x));
                }
            }
        }
        else {
            ArrayList<Integer> larger1 = new ArrayList<Integer>(factorsNum1);
            ArrayList<Integer> smaller1 = new ArrayList<Integer>(factorsNum0);
            for (int y = 0; y < smaller1.size(); y++) {
                if (larger1.contains(smaller1.get(y))) {
                    commonFactors.add(smaller1.get(y));
                }
            }
        }
        System.out.println(commonFactors);
        Integer maxValue = Collections.max(commonFactors);
        System.out.println(maxValue);
        }
    }

