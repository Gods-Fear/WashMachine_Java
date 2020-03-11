public class Main {
    public static void main (String [] args){
        Beko beko = new Beko();

        beko.on();
        System.out.println();
        beko.chooseMode();
        System.out.println();
        beko.chooseTemperature();
        System.out.println();
        beko.chooseSpeed();
        beko.putClothes();
        beko.takeClothes();
        beko.repeat();
        //beko.off();
    }

}
