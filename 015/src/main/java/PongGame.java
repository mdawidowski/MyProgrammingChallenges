import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PongGame extends Applet implements Runnable, KeyListener {
    final int WIDTH = 700, HEIGHT = 500;
    Thread thread;
    HumanPaddle player1;
    AIPaddle player2;
    Ball ball;
    boolean gameStarted;
    Graphics gfx;
    Image img;

    public void init(){
        this.resize(WIDTH, HEIGHT);

        this.addKeyListener(this);
        gameStarted = false;
        player1 = new HumanPaddle(1);
        ball = new Ball();
        player2 = new AIPaddle(2, ball);
        img = createImage(WIDTH, HEIGHT);
        gfx = img.getGraphics();
        thread = new Thread(this);
        thread.start();
    }

    public void paint(Graphics graphics){
        gfx.setColor(Color.black);
        gfx.fillRect(0, 0, WIDTH, HEIGHT);
        if(ball.getX() < -10 || ball.getX() > 710){
            gfx.setColor(Color.red);
            gfx.drawString("Game Over", 350, 250);
        } else {
            player1.draw(gfx);
            player2.draw(gfx);
            ball.draw(gfx);
         }

        if (!gameStarted) {
            gfx.setColor(Color.white);
            gfx.drawString("Tennis", 340, 100);
            gfx.drawString("Press Enter to Begin...", 310, 130);
        }

        graphics.drawImage(img, 0, 0, this);
    }

    public void update(Graphics graphics){
        paint(graphics);
    }

    public void run() {
        for(;;){
            if (gameStarted){

                player1.move();
                player2.move();
                ball.move();
                ball.checkPaddleCollision(player1, player2);
            }

            repaint();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP){
            player1.setUpAccel(true);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN){
            player1.setDownAccel(true);
        } else if (e.getKeyCode() == KeyEvent.VK_ENTER){
            gameStarted = true;
        }
    }

    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP){
            player1.setUpAccel(false);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN){
            player1.setDownAccel(false);
        }
    }
}
