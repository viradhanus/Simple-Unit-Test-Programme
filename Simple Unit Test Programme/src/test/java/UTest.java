import org.testng.annotations.*;

public class UTest {
    public static void main(String[] args) {
        System.out.println("A simple Unit Test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass");
    }

    @BeforeMethod
    public void setUp() {
        System.out.println("BeforeMethod");
    }

    @Test
    public void testEdit() {
        System.out.println("newUTest");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("afterClass");
    }
}
