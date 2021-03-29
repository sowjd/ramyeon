public class App {
    public static void main(String[] args) {
        System.out.println("<<This is original Ramyeon recipe>>");
        DefaultRamyeon originalRamyeon = new DefaultRamyeon();
        originalRamyeon.cook();

        System.out.println("\n<<This is how I cook Ramyeon>>");
        CustomRamyeon myRamyeon = new CustomRamyeon();
        myRamyeon.setWater(450);
        myRamyeon.setSoupPowder(90);
        myRamyeon.setBoilTime(1.5);
        myRamyeon.addIngredient("egg");
        myRamyeon.addIngredient("green onion");
        myRamyeon.addIngredient("kimchi");
        myRamyeon.cook();

        System.out.println("\n<<This is how I cook Ramyeon ver.2>>");
        CustomRamyeon myRamyeon2 = new CustomRamyeon();
        myRamyeon2.addIngredient("egg");
        myRamyeon2.addIngredient("ham");
        myRamyeon2.cook();
    }
}

/*
실행결과

<<This is original Ramyeon recipe>>
Put Water 500ml
Boiling...
Put noodle and soup powder
Boiling for 2.0 minutes...
Finish! Enjoy your Ramyeon:)

<<This is how I cook Ramyeon>>
Put Water 450ml
Boiling...
Put noodle and 90% of soup powder
Put egg, green onion and kimchi
Boiling for 1.5 minutes...
Finish! Enjoy your Ramyeon:)

<<This is how I cook Ramyeon ver.2>>
Put Water 500ml
Boiling...
Put noodle and soup powder
Put egg and ham
Boiling for 2.0 minutes...
Finish! Enjoy your Ramyeon:)
*/
