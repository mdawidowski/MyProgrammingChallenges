import java.awt.*;
import java.util.Random;

public class Apple {

    Random random = new Random();
    int posX;
    int posY;

    public Apple() {
        posX = 400;
        posY = 300;
    }

    public void setRandomPositionOfApple(){
        posX = random.nextInt(650)+10;
        posY = random.nextInt(450)+10;
    }

    public void draw(Graphics graphics){
        graphics.setColor(Color.green);
        graphics.fillOval((int)posX, (int)posY, 20, 20);
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}
