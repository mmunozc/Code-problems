import java.util.ArrayList;

public class Repetidos {
    public static int detectorDeRepetidos(ArrayList<Integer> a) {
        int repetido = 0;

        for (int i = 0; i < a.size(); i++) {
            if (i == 0) {
                if (a.get(i) == a.get(i + 1)) {
                    repetido++;
                }
            } else if (i == (a.size() - 1)) {
                break;
            } else {
                if ((a.get(i) == a.get(i + 1)) && (a.get(i) != a.get(i - 1))) {
                    repetido++;
                }
            }
        }
        return repetido;
    }
}