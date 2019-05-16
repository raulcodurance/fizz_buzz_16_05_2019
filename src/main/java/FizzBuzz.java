public class FizzBuzz {
    public String play(int number) {

        if (isMultipleOfThree(number) && isMultipleOfFive(number)) {
            return "FizzBuzz";
        } else if (isMultipleOfThree(number)) {
            return "Fizz";
        } else if (isMultipleOfFive(number)) {
            return "Buzz";
        } else {

            return toString(number);
        }
    }

    private boolean isMultipleOfFive(int number) {
        return number % 5 == 0;
    }

    private boolean isMultipleOfThree(int number) {
        return number % 3 == 0;
    }

    private String toString(int number) {
        return String.valueOf(number);
    }
}
