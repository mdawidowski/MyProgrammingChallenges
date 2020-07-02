import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SnakeGame extends Applet implements Runnable, KeyListener {

    final int WIDTH = 700, HEIGHT = 500;
    Thread thread;
    Graphics gfx;
    Image img;
    Snake snake;
    Apple apple;

    public void init() {
        this.resize(WIDTH, HEIGHT);
        this.addKeyListener(this);
        snake = new Snake();
        apple = new Apple();
        img = createImage(WIDTH, HEIGHT);
        gfx = img.getGraphics();
        thread = new Thread(this);
        thread.start();
    }

    public void paint(Graphics g) {
        gfx.setColor(Color.black);
        gfx.fillRect(0, 0, WIDTH, HEIGHT);
        snake.draw(gfx);
        apple.draw(gfx);

        if (snake.getX() > apple.getPosX()-5 && snake.getX() < apple.getPosX()+5 && snake.getY() > apple.getPosY()-5 && snake.getY() < apple.getPosY()+5){
            apple.setRandomPositionOfApple();
            snake.increaseSnakeSize();
        }

        g.drawImage(img, 0, 0, this);
    }

    public void update(Graphics graphics){
        paint(graphics);
    }

    public void run() {
        for (; ; ) {
            snake.move();

            repaint();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP){
            snake.setMoveUp(true);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN){
            snake.setMoveDown(true);
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT){
            snake.setMoveLeft(true);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            snake.setMoveRight(true);
        }
    }

    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP){
            snake.setMoveUp(false);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN){
            snake.setMoveDown(false);
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT){
            snake.setMoveLeft(false);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            snake.setMoveRight(false);
        }
    }
}
