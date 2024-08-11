package Impl;

import Interfaces.BasePizza;
import Interfaces.IToppings;

public class ExtraCheeseTopping extends IToppings {
    public ExtraCheeseTopping(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int getCost() {
        return super.getCost() + 50;
    }
}
