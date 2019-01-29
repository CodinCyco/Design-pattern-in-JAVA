package Decorator;

public class MeatDecorator extends SandiwchDecorator {


    public MeatDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return super.make()+addMeat();
    }

    private String addMeat() {
        return " Meat ";
    }
}
