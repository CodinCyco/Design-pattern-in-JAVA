import Builder.LaunchOrder;
import Sigleton.DbSingleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello design patterns!");

        DbSingleton instance = DbSingleton.getInstance();
        long before = System.currentTimeMillis();
        Connection connection = instance.getConnection();
        long after = System.currentTimeMillis();

        System.out.println(after - before);

         before = System.currentTimeMillis();
        Connection connection2 = instance.getConnection();
        after = System.currentTimeMillis();

        System.out.println(after - before);


        /**
         * Builder
         */

        LaunchOrder.Builder launchOrderBuilder = new LaunchOrder.Builder();
        launchOrderBuilder.bread("italian").condiments("fruits").dressing("kiwi").meat("grilled");
        LaunchOrder launchOrder = launchOrderBuilder.build();
        StringBuilder launchOrderString = new StringBuilder();
        launchOrderString.append(launchOrder.getBread()+" ");
        launchOrderString.append(launchOrder.getCondiments()+" ");
        launchOrderString.append(launchOrder.getDressing()+" ");
        launchOrderString.append(launchOrder.getMeat()+" ");
        System.out.println(launchOrderString);
    }
}
