import com.example.Animal;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

public class FelineTest {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Spy
    Animal animal = new Feline();

    @Test
    public void testGetFamily() {
        Assert.assertEquals("Кошачьи", animal.getFamily());
    }

}