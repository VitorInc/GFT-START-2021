package Entities;



public class Movel extends Produto {



    public Movel() {
    super();
}

    public Movel(String name, Double value, Integer quantity) {
        super(name, value, quantity);
    }

    @Override
    public Double finalValue() {

        return getQuantity() * getValue();


    }
}
