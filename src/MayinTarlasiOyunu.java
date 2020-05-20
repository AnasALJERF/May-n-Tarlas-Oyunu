
import java.awt.MenuBar;

import javax.swing.JMenuBar;

public class  MayinTarlasiOyunu implements Runnable {

	GUI gui=new GUI();
	
	
	public static void main(String[] args) {
	
		
		
		
		new Thread(new MayinTarlasiOyunu()).start();
		
	}

	
	
	
	
	@Override
	public void run() {
while(true) {
	
	
	gui.repaint();
	    if(gui.resetter==false) {
	    gui.ZaferDurumu();
	}
}		
	}

}