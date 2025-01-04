import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import java.util.List;

public class CatTest {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Spy
    Feline feline;

    @Test
    public void testGetSound() {
        Cat cat = new Cat(feline);
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void testGetFood() throws Exception {
        Cat cat = new Cat(feline);
        Assert.assertEquals(cat.getFood(), List.of("Животные", "Птицы", "Рыба"));
    }

}