public class Z4 extends BMWCar implements Car, EUSpec {

    private String modelSN;
    private IgnitionType ignitionType;
    private float gasLevel;

    private int maxPassengers;

    private final GasType gasType = GasType.VODKA;

    public Z4(String modelSN, IgnitionType ignitionType) {
        this.modelSN = modelSN;
        this.ignitionType = ignitionType;
    }

    @Override
    void activeCollisionDetection() {

    }

    @Override
    public String start() {
        return this.modelSN + " Started using " + this.ignitionType;
    }

    @Override
    public String stop() {
        return this.modelSN + " Stopped using breaks";
    }

    @Override
    public float getGasLevel() {
        return gasLevel;
    }

    @Override
    public String fillUpTank(GasType gasType, float amountOfGas) {
        if (!gasType.equals(this.gasType)) return "Help, not compatible " + gasType;

        this.gasLevel += amountOfGas;
        return "Filling Complete. " + this.gasType + " level " + this.gasLevel;
    }

    @Override
    public String drive(float metres) {
        if (this.gasLevel <= 0) return "not enough gas";
        this.gasLevel -= metres / maxCO2Emission;
        return "driving 20 metres";
    }

    @Override
    public boolean isAirConditionPresent() {
        return false;
    }

    @Override
    public String calculateMaximumAllowedWeight() {
        return "max allowed weight is 500kg";
    }

    @Override
    public void setMaxPassengers(int numberOfPassengers) {
        this.maxPassengers = numberOfPassengers;
    }

    @Override
    public int getMaxPassengers() {
        return this.maxPassengers;
    }
}
