package Impl;

import Interfaces.BasePizza;
import Interfaces.IToppings;

public class OlivesTopping extends IToppings {
    public OlivesTopping(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int getCost() {
        return super.getCost() + 35;
    }
}
