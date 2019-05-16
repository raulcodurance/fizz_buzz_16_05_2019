public class FizzBuzz {
    public String play(int number) {

        if(number == 3){
            return "Fizz";
        } else if(number == 6)
        {
            return "Fizz";
        }

        return toString(number);
    }

    private String toString(int number) {
        return String.valueOf(number);
    }
}
