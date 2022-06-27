import javax.swing.*;

public class SnakeGame {
    public static void main(String[] args) {

        System.setProperty("java.awt.headless", "false");
        SwingUtilities.invokeLater(() -> {
            new GameFrame();
        });
    }
}
