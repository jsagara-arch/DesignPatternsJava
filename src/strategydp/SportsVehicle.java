package strategydp;

import strategydp.strategyPattern.strategy.SportsDrivingStrategy;

public class SportsVehicle extends Vehicle
{
    SportsVehicle() {
        super( new SportsDrivingStrategy());
    }
}