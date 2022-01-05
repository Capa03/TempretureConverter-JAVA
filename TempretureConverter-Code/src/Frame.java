import javax.swing.*;

public class Frame extends JFrame {
    Frame() {
        Panel panel = new Panel();
        this.add(panel);
        this.setTitle("Tempreture Converter");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null); // O frame Aparece no centro da Tela
    }
}
