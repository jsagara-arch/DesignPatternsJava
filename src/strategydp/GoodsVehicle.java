package strategydp;

import strategydp.strategyPattern.strategy.NormalDrivingStrategy;

public class GoodsVehicle extends Vehicle
{
    GoodsVehicle( ) {
        super(new NormalDrivingStrategy());
    }
}