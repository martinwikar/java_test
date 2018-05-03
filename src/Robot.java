public abstract class Robot {
    private Position position;

    protected Maze maze;

    public Robot(Maze maze) {

    }

    public abstract void move();

    public Position getCurrentPosition(){
        return position;
    }

    public String posString(){
        return Integer.toString(position.getX()) + "," + Integer.toString(position.getY());
    }

    protected void setCurrentPosition(Position position){
        this.position = position;

    }

    public boolean hasReachedGoal(){
        if(maze.isGoal(position)){
            return true;
        }
        else {
            return false;
        }
    }


}
