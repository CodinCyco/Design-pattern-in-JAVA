package Decorator;

public abstract class SandiwchDecorator implements Sandwich {
    protected Sandwich customSandwich;

    public SandiwchDecorator(Sandwich customSandwich) {
        this.customSandwich = customSandwich;
    }
    public String make(){
        return customSandwich.make();
    }
}
