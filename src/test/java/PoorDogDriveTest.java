import org.testng.annotations.Test;

/**
 * Created by oleksandrg on 05-May-15.
 */
public class PoorDogDriveTest {
    @Test
    public void poorDogDriveTest() {
        PoorDog one = new PoorDog();
        System.out.println("Dogs sixe " + one.getSize());
        System.out.println("Names dog " + one.getName());

    }
}
