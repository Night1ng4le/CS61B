/** A class that represents a path via pursuit curves. */
public class Path {
    // TODO
    private Point curr = new Point();
    private Point next;

    public Path(double x, double y){
        next = new Point(x, y);
    }

    /** Returns the x-coordinate of curr. */
    public double getCurrX() {
        return curr.getX();
    }

    /** Returns the y-coordinate of curr. */
    public double getCurrY() {
        return curr.getY();
    }

    /** Returns the x-coordinate of next. */
    public double getNextX() {
        return next.getX();
    }

    /** Returns the y-coordinate of next. */
    public double getNextY() {
        return next.getY();
    }

    /** Returns curr. */
    public Point getCurrentPoint() {
        return curr;
    }

    public void setCurrentPoint(Point point) {
        curr = point;
    }

    public void iterate(double dx, double dy) {
        double next_x = next.getX();
        double next_y = next.getY();
        curr.setX(next_x);
        curr.setY(next_y);
        next.setX(next_x + dx);
        next.setY(next_y + dy);
    }
}
