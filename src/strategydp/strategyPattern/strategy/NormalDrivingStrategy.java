package strategydp.strategyPattern.strategy;


public class NormalDrivingStrategy implements DriveStrategy
{
    public void drive() {
        System.out.println("normal drive capabilities");
    }
}