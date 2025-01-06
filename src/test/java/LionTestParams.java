import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class LionTestParams {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Feline feline;

    private final boolean hasMane;
    private final String sex;

    public LionTestParams(boolean hasMane, String sex) {
        this.hasMane = hasMane;
        this.sex = sex;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0} {1}")
    public static Object[][] getCredentials() {
        return new Object[][]{
                {true, "Самец"},
                {false, "Самка"},
        };
    }

    @Test
    public void testDoesHaveMane() throws Exception {
            Lion lion = new Lion(sex, feline);
            Assert.assertEquals(hasMane, lion.doesHaveMane());
    }
}