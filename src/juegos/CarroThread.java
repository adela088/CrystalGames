/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegos;

/**
 *
 * @author andre
 */
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class CarroThread extends Thread {

    private final JLabel carro;
    private final int metaX;
    private final carreras game;
    private final Random random = new Random();
    private volatile boolean llegoMeta = false;

    public CarroThread(JLabel carro, int metaX, carreras game) {
        this.carro = carro;
        this.metaX = metaX;
        this.game = game;
    }

    @Override
    public void run() {
        try {
            while (game.isCarreraActiva() && !llegoMeta) {

                Thread.sleep(80 + random.nextInt(120));

                SwingUtilities.invokeAndWait(() -> {
                    if (!game.isCarreraActiva() || llegoMeta) {
                        return;
                    }

                    int x = carro.getX();
                    int y = carro.getY();

                    int avance = 10 + random.nextInt(25);
                    int nuevoX = x + avance;

                    if (nuevoX > metaX) {
                        nuevoX = metaX;
                    }

                    carro.setLocation(nuevoX, y);

                    game.actualizarTablaPosiciones();

                    if (nuevoX >= metaX && !llegoMeta) {
                        llegoMeta = true;
                        game.notificarGanador(carro);
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
