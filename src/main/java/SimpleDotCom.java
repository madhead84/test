/**
 * Created by oleksandrg on 06-May-15.
 */
public class SimpleDotCom {

    int[] locationCells;
    int nunOfHits = 0;

    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }

    public String checkYourself(String stringGuess) {
        int gues = Integer.parseInt(stringGuess);
        String result = "wrong";
        for (int cell : locationCells) {
            if (gues == cell) {
                result = "hit";
                nunOfHits++;
                break;
            }
        }

        if (nunOfHits == locationCells.length){
            result = "Destroy";
        }
        System.out.println(result);
        return result;
    }
}
