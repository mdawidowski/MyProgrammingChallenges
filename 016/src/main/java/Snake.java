import java.awt.*;
import java.util.ArrayList;

public class Snake {
    double x, y, xVel, yVel;
    boolean moveUp, moveDown, moveRight, moveLeft;
    int size;
    ArrayList<SnakePosition> snakePositions = new ArrayList<SnakePosition>();
    SnakePosition snakePosition;

    public Snake(){
        x = 350;
        y = 250;
        snakePosition = new SnakePosition(0,x,y);
        snakePositions.add(snakePosition);
        snakePosition = new SnakePosition(0,x,y-10);
        snakePositions.add(snakePosition);
        snakePosition = new SnakePosition(0,x,y-20);
        snakePositions.add(snakePosition);
        snakePosition = new SnakePosition(0,x-10,y-20);
        snakePositions.add(snakePosition);
        xVel = 0;
        yVel = 0;
        size = 0;
    }

    public void draw(Graphics graphics){
        graphics.setColor(Color.white);
        for (int i = 0; i < snakePositions.size(); i++) {
            graphics.fillOval((int)snakePositions.get(i).posX, (int)(int)snakePositions.get(i).posY, 20, 20);
        }
    }

    public void move() {

        for (int i = snakePositions.size()-1; i > 0; i--) {
            snakePositions.get(i).posX = snakePositions.get(i-1).posX;
            snakePositions.get(i).posY = snakePositions.get(i-1).posY;
        }

        if (moveUp){
            yVel = -1;
            xVel = 0;
        } else if (moveDown){
            yVel = 1;
            xVel = 0;
        } else if(moveLeft){
            xVel = -1;
            yVel = 0;
        } else if(moveRight){
            xVel = 1;
            yVel = 0;
        }

        y += yVel;
        x += xVel;

        snakePositions.get(0).posX = x;
        snakePositions.get(0).posY = y;

        if (y < 5){
            y = 5;
        } else if(y > 495){
            y = 495;
        }

        if (x < 5){
            x = 5;
        } else if(x>695){
            x = 695;
        }
    }

    public void increaseSnakeSize(){
        SnakePosition newSnakePosition = new SnakePosition(snakePositions.size(), snakePositions.get(snakePositions.size()-1).posX-20, snakePositions.get(snakePositions.size()-1).posY-20 );
        snakePositions.add(newSnakePosition);
    }

    public void setMoveUp(boolean moveUp) {
        this.moveUp = moveUp;
    }

    public void setMoveDown(boolean moveDown) {
        this.moveDown = moveDown;
    }

    public void setMoveRight(boolean moveRight) {
        this.moveRight = moveRight;
    }

    public void setMoveLeft(boolean moveLeft) {
        this.moveLeft = moveLeft;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
