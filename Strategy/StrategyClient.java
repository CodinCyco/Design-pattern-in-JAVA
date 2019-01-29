package Strategy;

public class StrategyClient {
    public static void main(String[] args){
        Context context = new Context();
        context.setStrategy(new StrategyAdd());
       int res = context.executeStrategy(6,8);
        System.out.println("addition : " + res);
       context.setStrategy(new StrategyMultiply());
       res = context.executeStrategy(6,8);
        System.out.println("multiplection : " + res);
    }
}
