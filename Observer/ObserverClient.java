package Observer;

public class ObserverClient {
    public static void main(String[] args){
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new OctalObserver(subject);
        subject.setState(5);
    }
}
