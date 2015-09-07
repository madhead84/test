import org.testng.annotations.Test;

/**
 * Created by oleksandrg on 06-May-15.
 */
public class SimpleDotComTest {
    @Test
    public void simpleDotComTest(){

        SimpleDotCom dotCom = new SimpleDotCom();
        int[] locations = {2,3,4};
        dotCom.setLocationCells(locations);
        String userGuess = "2";
        String result = dotCom.checkYourself(userGuess);
        System.out.println("" + result);
    }
}
