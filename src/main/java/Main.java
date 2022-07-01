public class Main {
    public static void main(String[] args) {
        Z4 model2002 = new Z4("Z4M2002 - 010101", IgnitionType.KEY);
        Z4 model2003 = new Z4("Z4M2003 - 010101", IgnitionType.BUTTON);
        Z4 model2004 = new Z4("Z4M2004 - 010101", IgnitionType.REMOTE);
        Z4 model2005 = new Z4("Z4M2005 - 010101", IgnitionType.VOICE);

        System.out.println(model2002.start());
        System.out.println(model2002.drive(2999));
        System.out.println(model2002.notifyOutOfGas());
        System.out.println(model2002.stop());

        System.out.println(model2003.start());
        System.out.println(model2003.fillUpTank(GasType.DIESEL, 345));
        System.out.println(model2003.fillUpTank(GasType.WOOD, 245));
        System.out.println(model2003.fillUpTank(GasType.VODKA, 345));
        System.out.println(model2003.stop());

        System.out.println(model2003.start());
        System.out.println("has Air condition: " + model2003.isAirConditionPresent());
        System.out.println(model2004.getGasLevel());
        System.out.println(model2004.fillUpTank(GasType.VODKA, 433));
        System.out.println(model2004.drive(27));
        System.out.println(model2003.stop());




    }
}
