package Compisite;

import java.util.Iterator;

public class Menu extends MenuComponent {
    public Menu(String name,String url) {
    this.name = name;
    this.url = url;
    }

    public MenuComponent add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
        return menuComponent;
    }

    public MenuComponent remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
        return menuComponent;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(print(this));

        Iterator<MenuComponent> it = menuComponents.iterator();
        while (it.hasNext()){
            MenuComponent menuComponent = it.next();
            builder.append(menuComponent.toString());
        }
        return builder.toString();
    }
}
