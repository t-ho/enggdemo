package core;

import java.awt.EventQueue;
import javax.swing.UIManager;

/**
 *
 * @author ToanHo
 */
public class Launch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
    	/* Set look and feel for application */
        try {
        	UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        	//UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception ex) {
        	ex.printStackTrace();
        }

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                MidiBlocks midiBlocks = new MidiBlocks();
                try {
					Thread.sleep(600);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
                midiBlocks.setVisible(true);
            }
        });
    }
    
}
