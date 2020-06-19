import java.awt.*;

public interface Paddle {
    void draw(Graphics graphics);
    void move();
    int getY();
}
