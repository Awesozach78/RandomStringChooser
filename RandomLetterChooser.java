/**
 * Created by zacha on 1/22/2017.
 */

class RandomLetterChooser extends RandomStringChooser {
    public RandomLetterChooser(String str) {
        super(getSingleLetters(str));
    }

    public static String[] getSingleLetters(String str) {
		return str.split("");
    }
}
