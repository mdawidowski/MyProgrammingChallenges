public class SnakePosition {
    int index;
    double posX;
    double posY;

    public SnakePosition(int index, double posX, double posY) {
        this.index = index;
        this.posX = posX;
        this.posY = posY;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public double getPosX() {
        return posX;
    }

    public void setPosX(double posX) {
        this.posX = posX;
    }

    public double getPosY() {
        return posY;
    }

    public void setPosY(double posY) {
        this.posY = posY;
    }
}
