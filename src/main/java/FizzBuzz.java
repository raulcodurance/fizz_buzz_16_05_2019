public class FizzBuzz {
    public String play(int number) {

        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {

            return toString(number);
        }
    }

    private String toString(int number) {
        return String.valueOf(number);
    }
}
