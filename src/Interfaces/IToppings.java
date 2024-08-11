package Interfaces;

public abstract class IToppings implements BasePizza {
    BasePizza basePizza;

    public IToppings(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int getCost() {
        return basePizza.getCost();
    }
}
