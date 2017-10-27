import javax.swing.SwingUtilities;

import controller.MainController;
import view.GameView;
import model.GameModel;


public class GameMain {
	
	public static void main(String [] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				GameView view;
				GameModel model = new GameModel();
				view = new GameView();
				MainController controller = new MainController(view, model);
				
			}
		});
		
	}

}
