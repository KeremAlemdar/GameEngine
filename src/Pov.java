public class Pov {
    double x,y,z,angle;
    int width, height, horizontalDirection, verticalDirection;

    public Pov(double x, double y, double z, double angle, int width, int height, int horizontalDirection, int verticalDirection) {
        this.x = x;
        this.y = y;
        this.z= z;
        this.angle = angle;
        this.width = width;
        this.height = height;
        this.horizontalDirection = horizontalDirection;
        this.verticalDirection = verticalDirection;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setZ(int z) {
        this.z = z;
    }
    public void setAngle(int angle) {
        this.angle = angle;
    }
    public void w() {
        y++;
    }
    public void a() {
        x--;
    }
    public void s() {
        y--;
    }
    public void d() {
        x++;
    }
}
