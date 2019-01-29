package Prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String,Item> items = new HashMap<>();

    public Registry(){
        loadItems();
    }
    public Item createItem(String type){
        Item item = null;

        try {
            item =  items.get(type).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("captain america");
        movie.setPrice(50.0);
        movie.setUrl("http://movies.com/ca");
        movie.setRunTime("120:12");
        items.put("Movie",movie);

        Book book = new Book();
        book.setTitle("cauption of life");
        book.setPrice(150.0);
        book.setUrl("http://books.com/col");
        book.setNumberOfPages(245);
        items.put("Book",book);
    }

}
