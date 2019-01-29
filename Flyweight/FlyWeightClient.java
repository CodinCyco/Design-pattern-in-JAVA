package Flyweight;

public class FlyWeightClient {
    public static void main(String[] args){
        InventorySystem ins = new InventorySystem();
        ins.takeOrder("x",1);
        ins.takeOrder("y",2);
        ins.takeOrder("z",3);
        ins.takeOrder("x",1);
        ins.takeOrder("y",2);
        ins.takeOrder("z",3);
        ins.takeOrder("x",1);
        ins.takeOrder("y",2);
        ins.takeOrder("z",3);
        ins.takeOrder("x",1);
        ins.takeOrder("y",2);
        ins.takeOrder("z",3);
        ins.process();
        System.out.println(ins.report());
    }
}
