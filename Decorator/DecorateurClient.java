package Decorator;

import java.io.*;

@SuppressWarnings("ALL")
public class DecorateurClient {
    public static void main(String[] args){

        /**
         * Daily example
         */
//        File file = new File("./output.txt");
//        try {
//            file.createNewFile();
//            OutputStream stream =  new FileOutputStream(file);
//            DataOutputStream outputStream = new DataOutputStream(stream);
//            outputStream.writeChars("text");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
        System.out.println(sandwich.make());
    }
}
