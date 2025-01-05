import com.example.Feline;
import com.example.Predator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import java.util.List;

public class FelineTest {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Spy
    Predator predator;

    Feline feline = new Feline(predator);

    @Test
    public void testEatMeat() throws Exception {
        Assert.assertEquals(feline.eatMeat(), List.of("Животные", "Птицы", "Рыба"));
    }

    @Test
    public void testGetFamily() {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKittens() {
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittensWithArgument() {
        Assert.assertEquals(List.of(0, 1, 2), List.of(feline.getKittens(0), feline.getKittens(1), feline.getKittens(2)));
    }

}