public class DefaultRamyeon implements Ramyeon {

    public void cook() {
        System.out.println("Put Water " + WATER + "ml");
        System.out.println("Put noodle and soup powder");
        System.out.println("Boiling for " + BOIL_TIME + " minutes...");
        System.out.println("Finish! Enjoy your Ramyeon:)");
    }
}