package Factory;

public class Blog extends Website {

    protected void createWebsite() {
        pages.add(new ContactPage());
        pages.add(new WelcomePage());
    }
}
