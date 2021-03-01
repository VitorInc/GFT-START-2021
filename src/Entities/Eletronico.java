package Entities;

public class Eletronico extends Produto {

    public Eletronico(){
        super();
    }

    public Eletronico(String name, Double value, Integer quantity) {
        super(name, value, quantity);
    }

    @Override
    public Double finalValue() {
        return getQuantity() * getValue() * 15 / 100;
    }
}
