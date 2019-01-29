package Strategy;

public class Context {
    private Strategy strategy;


    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int x, int y){
        if(strategy==null)
            return 0;
        return strategy.doOperation(x,y);
    }
}
