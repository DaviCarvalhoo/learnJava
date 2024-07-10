package JUTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasicoJUnit {
    @Test
    void deveCalcularIdade(){
        int idade = 18;
        Assertions.assertEquals(18, idade);

    }


}
