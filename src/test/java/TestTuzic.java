;import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by oleksandrg on 3/23/2015.
 */
public class TestTuzic {
    @Test
    public void testTuzik(){
        Tuzic murzi = new Tuzic();
        murzi.size = 512;
        murzi.name = "Murzi";
        murzi.gavk(3);

    }
}
