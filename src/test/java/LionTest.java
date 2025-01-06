import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

public class LionTest {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Feline feline;

    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Test
    public void testDoesHaveManeException() throws Exception {
        Assert.assertThrows(Exception.class, () -> new Lion("1", feline));
    }

    @Test
    public void testDosHaveManeExceptionMessage() throws Exception {
        Throwable exception = Assert.assertThrows(Exception.class, () -> new Lion("1", feline));
        Assert.assertEquals("Используйте допустимые значения пола животного - самей или самка", exception.getMessage());
    }

    //Этот тест по факту дублирует тест в классе LionTestParams, но без него отчет jacoco
    //не считает покрытие класса Lion 100 % (видимо из-за параметризации)
    @Test
    public void testDoesHaveManeDuplicate() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Assert.assertFalse(lion.doesHaveMane());
    }

}