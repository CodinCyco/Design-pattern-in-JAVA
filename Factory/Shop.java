package Factory;

public class Shop extends Website {
    protected void createWebsite() {
        pages.add(new WelcomePage());
        pages.add(new ProductsPage());
    }
}
