/**

 * Created by 20171340 on 1/20/2017.

 */

class Main {

    public static void main(String[] args) {

        RandomStringChooser chooser =

                new RandomStringChooser(new String[]{"wheels", "on", "the", "bus"});


        for (int k = 0; k < 6; k++) {

            System.out.print(chooser.getNext() + " ");

        }


        RandomLetterChooser letterChooser =
                new RandomLetterChooser("cat");
        for (int k = 0; k < 4; k++) {
            System.out.print(letterChooser.getNext());
        }
    }
}