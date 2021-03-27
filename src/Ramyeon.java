abstract class Ramyeon {
    private int water;        // 단위: ml
    private int soupPowder;   // 넣을 스프의 퍼센트 ex) 100 -> 전부 넣기, 80 -> 80%만 넣기
    private double timeToBoil;   // 면과 스프를 넣은 후 끓일 시간, 단위: 분

    public void putWaterAndBoil() {
        System.out.println("Put Water " + water + "ml.");
        System.out.println("Boiling...");
    }

    public void boilWater() {
        System.out.println("Boiling for " + timeToBoil + " minutes...");
    }

    abstract void putSoupPowder();

    public void put(String ingredient) {
        System.out.println("Put " + ingredient + ".");
    }

    public void finish() {
        System.out.println("Finish! Enjoy your Ramyeon:)");
    }

    abstract void cook();

    public void setWater(int water) {
        this.water = water;
    }

    public int getSoupPowder() {
        return soupPowder;
    }

    public void setSoupPowder(int soupPowder) {
        this.soupPowder = soupPowder;
    }

    public void setTimeToBoil(double timeToBoil) {
        this.timeToBoil = timeToBoil;
    }

}
