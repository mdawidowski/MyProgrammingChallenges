import java.awt.*;

public class AIPaddle implements Paddle{

    double y, yVel;
    boolean upAccel, downAccel;
    int player, x;
    final double GRAVITY = 0.94;
    Ball ball1;

    public AIPaddle(int player, Ball ball) {
        upAccel = false; downAccel = false;
        ball1 = ball;
        y = 210;
        yVel = 0;
        if (player == 1){
            x = 20;
        } else {
            x = 660;
        }
    }

    public void draw(Graphics graphics) {
        graphics.setColor(Color.yellow);
        graphics.fillRect(x, (int)y, 20, 80);
    }

    public void move() {
        y = ball1.getY() - 40;

        if (y < 0){
            y = 0;
        } else if(y > 420){
            y = 420;
        }
    }

    public void setUpAccel(boolean input){
        upAccel = input;
    }

    public void setDownAccel(boolean input){
        downAccel = input;
    }


    public int getY() {
        return (int)y;
    }
}
