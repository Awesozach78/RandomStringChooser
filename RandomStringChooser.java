import java.util.ArrayList;

/**
 * Created by zacha on 1/22/2017.
 */
public class RandomStringChooser {
    private ArrayList<String> words;

    public RandomStringChooser(String[] Array) {
        words = new ArrayList<String>();
        for (int i = 0; i < Array.length; i++) {
            words.add(Array[i]);
        }
    }


    public String getNext() {

        if (words.size() == 0)
            return "None";
        int random = (int) (Math.random() * words.size());
        String temp = words.get(random);
        words.remove(random);
        return temp;
    }
}
