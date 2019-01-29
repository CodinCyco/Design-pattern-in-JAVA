package Compisite;

public class Client {

    public static void main(String[] args){
        Menu menu = new Menu("nav_bar_menu","/");
        MenuItem home = new MenuItem("Home","/home");
        menu.add(home);
        menu.add(new Menu("x","e"));

        System.out.println(menu.toString());
    }
}
