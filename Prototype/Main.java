package Prototype;

public class Main {
    public static void main(String[] args){
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");
        System.out.println(movie.getRunTime());
        System.out.println(movie.getPrice());

        Book book =(Book) registry.createItem("Book");
        System.out.println(book.getNumberOfPages());
    }
}
