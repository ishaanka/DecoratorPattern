package Impl;

import Interfaces.BasePizza;

public class FarmhousePizza implements BasePizza {
    @Override
    public int getCost() {
        return 400;
    }
}
