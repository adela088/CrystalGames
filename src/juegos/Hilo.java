
package juegos;

/**
 *
 * @author User
 */
public class Hilo extends Thread{
    
        carreras Juegocarreras;
        public Hilo(carreras Juegocarreras){
            this.Juegocarreras = Juegocarreras;
        }
        public void run(){
            try{
                while(true){
                    Juegocarreras.moverFondo();
                    sleep(100);
                }
            }
            catch(Exception e){
                System.out.println("");
            }
        }
    
}
