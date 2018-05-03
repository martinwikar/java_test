public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Position getPosToSouth(){
        return new Position(getX(), getY() + 1);
    }

    public Position getPosToNorth(){
        return new Position(getX(), getY() - 1);
    }

    public Position getPosToEast(){
        return new Position(getX() + 1, getY());
    }

    public Position getPosToWest(){
        return new Position(getX() - 1, getY());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Position position = (Position) o;

        if (x != position.x) return false;
        return y == position.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
