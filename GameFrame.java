import javax.swing.JFrame;

public class GameFrame extends JFrame {
    
    GameFrame(){

        GamePanel panel = new GamePanel();

        this.add(panel);
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack(); //add components, take jframe and fit it around components we add to frame
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
