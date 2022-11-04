public class Lesson2 {
    public static void main(String[] args) {
        for_loop_yes();
        create_list_of_cars();
        integer_for_day();
        switch_weekend();
        catch_error();
    }
    private static void for_loop_yes()  {
        for (int i=0; i<5; i++) {
            System.out.println("Yes");
        }
    }
    private static void create_list_of_cars() {
        String [] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars) {
            System.out.println(car);
        }
    }
    private static void integer_for_day() {
        int day = 4;
        if (day == 6) {
            System.out.println("Today is Saturday");
        }else if (day == 7) {
            System.out.println("Today is Sunday");
        }else {
            System.out.println("Looking forward to the weekend");
        }
    }
    private static void switch_weekend() {
        int day = 4;
        switch (day) {
            default:
                System.out.println("Looking forward to the weekend");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
        }
    }
    public static void catch_error() {
        try{
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[2]);

        }
        catch (ArrayIndexOutOfBoundsException error) {
            System.out.println("Index not found");
        }
    }
}
