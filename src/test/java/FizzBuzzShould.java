import org.junit.Test;

import java.applet.AudioClip;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzShould {

    @Test
    public void return_number_1_as_string_when_fizzBuzz_of_1() {


        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.play(1), is("1"));
    }
}
