import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.print.Doc;
import java.net.URI;
import java.net.URL;

/**
 * Created by jrizvan on 1/16/17.
 */
public class Scrapper {
    public static void main(String[] args) {
        try{
            Elements element = Jsoup.connect("http://firstpost.com").get().getElementsByAttribute("href");
            for (int i = 0; i < element.size(); i++) {
                printf(element.get(i).text()+System.lineSeparator());
            }
        }
        catch (Exception e){

        }
    }

    public static void printf(String word){
        System.out.println("-> "+word);
    }
}
