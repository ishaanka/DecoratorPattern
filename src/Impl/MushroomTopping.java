package Impl;

import Interfaces.BasePizza;
import Interfaces.IToppings;

public class MushroomTopping extends IToppings {
    public MushroomTopping(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int getCost() {
       return super.getCost() + 35;
    }
}
