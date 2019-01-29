package Decorator;

public class DressingDecorator extends SandiwchDecorator {
    public DressingDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return super.make()+addDressing();
    }

    private String addDressing() {
        return " +Dressing";
    }
}
