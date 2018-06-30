/**
 * Created by elif.dal on 30.06.2018.
 */
public class Board {

    protected char[][] fields;

    Board(int size) {
        if ( !(size >= 3 && size<=10)) {
            throw new IllegalArgumentException("Board size should be between 3 and 10.");
        }
        fields = new char[size][size];
    }

    char[][] getFields() {
        return fields.clone();
    }

    boolean setMove(int x, int y, char symbol) {
        boolean moveMade = false;
        if(x<fields.length && y<fields[x].length) {
            if (fields[x][y] == '\0'){
                fields[x][y] = symbol;
                moveMade = true;
            }
        }
        return moveMade;
    }

}
