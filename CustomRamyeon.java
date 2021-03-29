import java.util.ArrayList;

public class CustomRamyeon implements Ramyeon {
    private int water = -1;
    private int soupPowder = -1;     // 넣을 스프의 퍼센트 ex) 100 -> 전부 넣기, 80 -> 80%만 넣기
    private double boilTime = -1;
    private ArrayList<String> additionalIngredients = new ArrayList<>();

    public void cook() {
        fillWater();
        System.out.println("Boiling...");
        putNoodleAndSoupPowder();
        putAdditionalIngredients();
        boilWater();
        System.out.println("Finish! Enjoy your Ramyeon:)");
    }

    private void fillWater() {
        String s = (water != -1) ?   "Put Water " + water + "ml" : "Put Water " + WATER + "ml";
        System.out.println(s);
    }

    private void putNoodleAndSoupPowder() {
        String s = (soupPowder != -1) ?   "Put noodle and " + soupPowder + "% of soup powder" : "Put noodle and soup powder";
        System.out.println(s);
    }

    private void putAdditionalIngredients() {
        if(additionalIngredients.isEmpty())
            return;

        String s = "Put ";
        for(int i=0; i<additionalIngredients.size(); i++) {
            if(i == additionalIngredients.size()-1) {
                s = s.substring(0, s.length() -2);
                s += " and " + additionalIngredients.get(i);
            }else
                s += additionalIngredients.get(i) + ", ";
        }
        System.out.println(s);
    }

    private void boilWater() {
        String s = (boilTime != -1) ?   "Boiling for " + boilTime + " minutes..." : "Boiling for " + BOIL_TIME + " minutes...";
        System.out.println(s);
    }

    public void setWater(int water) {
        if(water <= 0){
            System.out.println("Fail to set");
            return;
        }
        this.water = water;
    }

    public void setSoupPowder(int soupPowder) {
        if(soupPowder < 0 || soupPowder > 100){
            System.out.println("Fail to set");
            return;
        }
        this.soupPowder = soupPowder;
    }

    public void setBoilTime(double boilTime) {
        if(boilTime < 0){
            System.out.println("Fail to set");
            return;
        }
        this.boilTime = boilTime;
    }

    public void addIngredient(String ingredient) {
        additionalIngredients.add(ingredient);
    }
}