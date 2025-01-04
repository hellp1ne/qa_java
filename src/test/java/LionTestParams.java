import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class LionTestParams {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    private final boolean hasMane;
    private final String sex;

    public LionTestParams(boolean hasMane, String sex) {
        this.hasMane = hasMane;
        this.sex = sex;
    }

    @Parameterized.Parameters
    public static Object[][] getCredentials() {
        return new Object[][]{
                {true, "Самец"},
                {false, "Самка"},
                {true, "123"}
        };
    }

    @Test
    public void testDoesHaveMane() throws Exception {

        try {
            Lion lion = new Lion(sex);
            Lion lionSpy = Mockito.spy(lion);
            Assert.assertEquals(lionSpy.doesHaveMane(), hasMane);
        } catch (Exception e) {
            Assert.assertEquals(e.getMessage(), "Используйте допустимые значения пола животного - самей или самка");
        }

    }
}