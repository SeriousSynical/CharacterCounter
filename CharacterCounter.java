import java.util.ArrayList;

public class CharacterCounter {

    public static int minRepeat(String string) {

        int min;
        ArrayList<Integer> repeatList = new ArrayList<>();

        for (char character1 : string.toCharArray()) {

            int repeats = 0;

            for (char character2 : string.toCharArray()) {


                if (character1 == character2) {

                    repeats++;

                }


            }

            repeatList.add(repeats);

        }

        min = repeatList.get(0);
        for(int i = 1; i < repeatList.size(); i++ ) {

            if(repeatList.get(i) < min) {

                min = repeatList.get(i);

            }

        }

        return min;

    }

    public static int maxRepeat(String string) {

        int max;
        ArrayList<Integer> repeatList = new ArrayList<>();

        for (char character1 : string.toCharArray()) {

            int repeats = 0;

            for (char character2 : string.toCharArray()) {


                if (character1 == character2) {

                    repeats++;

                }


            }

            repeatList.add(repeats);

        }

        max = repeatList.get(0);
        for(int i = 1; i < repeatList.size(); i++ ) {

            if(repeatList.get(i) > max) {

                max = repeatList.get(i);

            }

        }

        return max;

    }

}
