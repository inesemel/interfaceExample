public interface Car {

    String start();
    String stop();
    float getGasLevel();
    String fillUpTank(GasType gasType, float amountOfGas);
    String drive(float metres);
    boolean isAirConditionPresent();


}
