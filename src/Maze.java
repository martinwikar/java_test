import javafx.geometry.Pos;

import java.awt.Robot;
import java.io.*;
import java.nio.CharBuffer;


public class Maze {

    //initialize mazeData as a char array that can store a labyrinth of max size 200*200
    private int rows = 0, cols;
    //private char[][] mazeData = new char[200][200];
    private CharBuffer[][] mazeData = new CharBuffer[200][200];

    private int x, y;


    public Maze(Reader reader) throws Exception {
        x = 0;
        y = 0;

        int c = reader.read(mazeData[x][y]);
        while (c != -1) {
            if ((char) c == '\n') {
                y++;
                if (rows < x) {
                    rows = x;
                }
                x = 0;
            } else {
                if (x < 200 && y < 200) {
                    //mazeData[x][y] = (char)c;
                    x++;
                }

            }
            c = reader.read(mazeData[x][y]);
        }
        cols = y;
        reader.close();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(mazeData[i][j]);
            }
        }

    }

    public boolean isMovable(Position currentPosition) {
        /*
        if(mazeData[currentPosition.getPosToEast().getX()][currentPosition.getPosToEast().getY()] == ' '){
            return true;
        }
        if(mazeData[currentPosition.getPosToWest().getX()][currentPosition.getPosToWest().getY()] == ' '){
            return true;
        }
        if(mazeData[currentPosition.getPosToSouth().getX()][currentPosition.getPosToSouth().getY()] == ' '){
            return true;
        }
        if(mazeData[currentPosition.getPosToNorth().getX()][currentPosition.getPosToNorth().getY()] == ' '){
            return true;
        }
        else {
            return false;
        }
        */
        return false;
    }

    public boolean isGoal(Position currentPosition) {
        /*
        if(mazeData[currentPosition.getX()][currentPosition.getY()] == 'G'){
            return true;
        }
        else {
            return false;
        }
        */
        return false;
    }

    public Position getStartPosition() throws InstantiationError {
        /*
        Position startPosition = new Position(-1,-1);
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(mazeData[i][j] == 'S'){
                    startPosition = new Position(i,j);
                }
            }
        }
        if(startPosition.getX() == -1 || startPosition.getY() == -1){
            throw new InstantiationError("No start position in maze");
        }

        return startPosition;
    }
    */
        return new Position(0, 0);
    }
}
