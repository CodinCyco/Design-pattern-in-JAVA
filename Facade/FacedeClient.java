package Facade;

public class FacedeClient {
    public static void main(String[] args){
        System.out.println(new ClassOne().print());
        System.out.println(new ClassTwo().print());
    }
}
