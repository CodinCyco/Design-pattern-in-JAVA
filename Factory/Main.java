package Factory;

import java.util.Calendar;

public class Main {
    public static void main(String[] args){
        /**
         * calendar is an exmaple of factory
         */
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println(c.DAY_OF_MONTH);

        /**
         * custom factory (website creation)
         */
        System.out.println("-----------Blog pages ---------------");
        Website website = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        for (Page page:website.getPages())
            System.out.println(page.getName());

        System.out.println("-----------Shop pages ---------------");
        Website shop = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        for (Page page:shop.getPages())
            System.out.println(page.getName());

    }
}
