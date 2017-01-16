import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by jrizvan on 1/14/17.
 */
public class ReadFile {

    private static final String FILENAME = "raw/ind.txt";

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                sCurrentLine = sCurrentLine.replaceAll("\\|","");
                String[] splitWithComma = sCurrentLine.split(",");
                for (int i = 0; i < splitWithComma.length; i++) {
                    String itemWord = splitWithComma[i];
                    System.out.println(itemWord);
                    String[] itemWordSplit = itemWord.split("=");
                    if(itemWordSplit.length > 1){
                        for (int j = 0; j < 1 ; j++) {
                            System.out.println(itemWordSplit[0] +" -> "+ itemWordSplit[1]);
                        }
                    }
                    continue;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
