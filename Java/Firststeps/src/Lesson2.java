public class Lesson2 {
    public static void main(String[] args) {
        for_loop_yes();
        create_list_of_cars();
        integer_for_day();
    }

    private static void integer_for_day() {
        int day = 4;
        if (day == 6) {
            System.out.println("today is Saturday");
        else if (day == 7) {
            System.out.println("today is Sunday");
        else {
            System.out.println("looking forward to the weekend");
                }
            }
        }

    }

    private static void for_loop_yes() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Yes");
        }
    }
    public static void create_list_of_cars(){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars ) {
            System.out.println(car);
        }
    }

}
