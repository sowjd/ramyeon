import java.util.ArrayList;

public class CustomRamyeon extends DefaultRamyeon {
    private ArrayList<String> additionalIngredients = new ArrayList<>();

    public CustomRamyeon() {
        super();
    }

    public void addIngredient(String ingredient) {
        additionalIngredients.add(ingredient);
    }

    public void putSoupPowder() {
        if(getSoupPowder() == 100)
            super.putSoupPowder();
        else
            System.out.println("Put " + getSoupPowder() + "% of soup powder.");
    }

    public void cook() {
        putWaterAndBoil();
        put("noodle");
        putSoupPowder();
        additionalIngredients.forEach(i -> put(i));
        boilWater();
        finish();
    }
}
