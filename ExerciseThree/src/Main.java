public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();

    }

    /**
     * 1: Store your age in an appropriate variable, print it out in
     *    one line using the "+" in your print statement. Only use 1 print statement
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        int age = 26;
        System.out.println("I have " + age + " years old");
    }

    /**
     * 2: Store your first name initial (i.e. Jane -> J) in a variable, your age in another variable.
     *
     *    And then print them out on the same line using the following idea
     *
     *    System.out.println("My Age=" + myAge +", my initial=" + myInitial);
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        char myInitial= 'F';
        int myAge= 26;
        System.out.println("My Age=" + myAge +", my initial=" + myInitial);
    }

    /**
     * 3: Write comments above each line of code, describing what the line of code is doing
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        // I create a boolean variable to determine if I have eaten lunch or not
        boolean hasEatenLunch = false;
        // I create a doucle variable for the price of the lunch
        double lunchCost = 5.99;

        // I print the price of the lunch
        System.out.println("Lunch cost=" + lunchCost);
        // I print if I have eaten lunch or not
        System.out.println("Has Eaten lunch=" + hasEatenLunch);
    }
}
