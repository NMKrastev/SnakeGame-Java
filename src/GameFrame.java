import javax.swing.*;

public class GameFrame extends JFrame {

    GameFrame() {

        System.setProperty("java.awt.headless", "false");
        SwingUtilities.invokeLater(() -> {
            this.add(new GamePanel());
            this.setTitle("Snake");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setResizable(false);
            this.pack();
            this.setVisible(true);
            this.setLocationRelativeTo(null);
        });
    }
}
