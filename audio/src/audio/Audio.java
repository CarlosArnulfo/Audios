/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package audio;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;
/**
 *
 * @author calot
 */
public class Audio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        Scanner scanner = new Scanner(System.in);
		
		File file = new File("./UbicacionDelAudio.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		
		int opcion=1;
		while(opcion!=0) {
			System.out.println("1 = play, 2 = Stop, 3 = Reset, 4=close, 0 = Salir");
			System.out.print("Ingrese su opcion: ");
			
			opcion = scanner.nextInt();
			
			switch(opcion) {
				case (1): clip.start();
				break;
				case (2): clip.stop();
				break;
				case (3): clip.setMicrosecondPosition(0);
				break;
				case (4): clip.close();
				default: System.out.println("ingrese numero valido");
			}
		 }
    }
    
}
