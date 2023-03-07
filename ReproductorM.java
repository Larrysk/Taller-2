import java.io.File;
import javax.sound.sampled.*;

public class ReproductorM implements Runnable {
    private final int id;

    public ReproductorM(int id) {
        this.id = id;
    }
    @Override
    public void run() {
        System.out.println("Hilo " + id + " iniciado");

  
        if (id == 3) {
            try {
                File file = new File("Musica/cancion.wav");

                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();

                while (clip.isOpen()) {
                    Thread.sleep(4000);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                Thread.sleep((long) (Math.random() * 5000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Hilo " + id + " finalizado");
    }
}
