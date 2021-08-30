import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class test {

    @Test
    void shouldConvert1toI(){
        assertEquals("I", toRoman(1));
    }

    @Test
    void shouldConvert2toII(){
        assertEquals("II", toRoman(2));
    }

    private String toRoman(int i) {
        return "I";
    }
}
