public class App {
    public static void main(String[] args) {
        System.out.println("<<This is original Ramyeon recipe>>");
        DefaultRamyeon originalRamyeon = new DefaultRamyeon();
        originalRamyeon.cook();

        System.out.println("\n<<This is how I cook Ramyeon>>");
        CustomRamyeon myRamyeon = new CustomRamyeon();
        myRamyeon.setSoupPowder(90);
        myRamyeon.setTimeToBoil(1.5);
        myRamyeon.addIngredient("egg");
        myRamyeon.addIngredient("green onion");

        myRamyeon.cook();
    }
}

/*
실행결과

<<This is original Ramyeon recipe>>
Put Water 500ml.
Boiling...
Put noodle.
Put whole soup powder.
Boiling for 2.0 minutes...
Finish! Enjoy your Ramyeon:)

<<This is how I cook Ramyeon>>
Put Water 500ml.
Boiling...
Put noodle.
Put 90% of soup powder.
Put egg.
Put green onion.
Boiling for 1.5 minutes...
Finish! Enjoy your Ramyeon:)
*/
