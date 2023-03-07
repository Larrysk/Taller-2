import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Reproductor de musica");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton startButton = new JButton("Play Music");
        startButton.setBackground(new java.awt.Color(250, 128, 114 ));
        startButton.addActionListener(e -> {
            for (int i = 0; i < 4; i++) {
                Thread thread = new Thread(new ReproductorM(i));
                thread.start();
            }
        });

        frame.add(startButton);
        frame.setVisible(true);
    }
}