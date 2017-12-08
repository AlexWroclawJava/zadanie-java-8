import java.util.Arrays;

public class TablicaImion {

    public static void main(String[] args) {

        String[] tablicaImion = new String[3];
        tablicaImion[0] = "Jan";
        tablicaImion[1] = "Marek";
        tablicaImion[2] = "Mateusz";

        String arrayString = Arrays.toString(tablicaImion);
        System.out.println(arrayString);

    }
}
