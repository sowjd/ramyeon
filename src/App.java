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