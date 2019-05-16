public class FizzBuzz {
    public String play(int number) {

        if (number % 3 == 0) {

            return "Fizz";
        } else {

            return toString(number);
        }
    }

    private String toString(int number) {
        return String.valueOf(number);
    }
}
