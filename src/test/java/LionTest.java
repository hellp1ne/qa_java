import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import java.util.List;

public class LionTest {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Spy
    Feline feline;

    @Test
    public void testGetKittens() {
        Lion lion = new Lion(feline);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion(feline);
        Assert.assertEquals(lion.getFood(), List.of("Животные", "Птицы", "Рыба"));
    }

    @Test
    public void testetFood() throws Exception {
        Lion lion = new Lion(feline);
        Assert.assertEquals(lion.getFood(), List.of("Животные", "Птицы", "Рыба"));
    }

}