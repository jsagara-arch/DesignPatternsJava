package strategydp.strategyPattern.strategy;


public class SportsDrivingStrategy implements DriveStrategy
{
    public void drive() {
        System.out.println("Sports drive capabilities");
    }
}