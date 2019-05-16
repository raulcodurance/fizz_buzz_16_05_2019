import org.junit.Test;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzShould {

    @Test
    public void return_number_1_as_string_when_fizzBuzz_of_1() {


        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.play(1), is("1"));
    }

    @Test
    public void return_number_2_as_string_when_fizzBuzz_of_2() {


        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.play(2), is("2"));
    }

    @Test
    public void return_number_4_as_string_when_fiuzzBuzz_of_4() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.play(4), is("4"));
    }
}
