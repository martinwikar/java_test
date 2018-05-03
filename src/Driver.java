import java.io.*;

public class Driver {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\Martin\\IdeaProjects\\OU2\\src\\maze.txt");
        BufferedReader in = new BufferedReader(new FileReader(file));

        Maze maze = new Maze(in);
        //System.out.println("\n" + maze.getStartPosition().getX() + "," + maze.getStartPosition().getY());
        /*
        Robot rightRobot = new RightHandRuleRobot(maze);
        rightRobot.setCurrentPosition(maze.getStartPosition());
        System.out.println(rightRobot.posString());
        rightRobot.move();
        System.out.println(rightRobot.posString());
        */

        /*
        Reader reader = new FileReader(args[0]);
        Maze maze = new Maze(reader);



        FileReader fr = new FileReader(args[0]);
        char [] a = new char[100];
        fr.read(a);

        for(char c : a){
            System.out.println(c);
        }
        fr.close();
        */
    }
}
