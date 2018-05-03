public class RightHandRuleRobot extends Robot {

    public RightHandRuleRobot(Maze maze) {
        super(maze);
    }

    @Override
    public void move() {
        Position pos = new Position(getCurrentPosition().getX(), getCurrentPosition().getY());
        if(maze.isMovable(pos.getPosToEast())){
            this.setCurrentPosition(getCurrentPosition().getPosToEast());
        }
        if(maze.isMovable(pos.getPosToNorth())){
            this.setCurrentPosition(getCurrentPosition().getPosToNorth());
        }
        if(maze.isMovable(pos.getPosToWest())){
            this.setCurrentPosition(getCurrentPosition().getPosToWest());
        }
        if(maze.isMovable(pos.getPosToSouth())){
            this.setCurrentPosition(getCurrentPosition().getPosToSouth());
        }
        else{
            System.out.println("No available positions");
        }
    }
}
