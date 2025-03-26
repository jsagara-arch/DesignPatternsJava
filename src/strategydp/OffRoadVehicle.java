package strategydp;

import strategydp.strategyPattern.strategy.SportsDrivingStrategy;

public class OffRoadVehicle extends Vehicle
{
    OffRoadVehicle(){
        super(new SportsDrivingStrategy());
    }
}