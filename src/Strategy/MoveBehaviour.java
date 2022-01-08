package Strategy;

import Main.NewJFrame;

public interface MoveBehaviour {
	
    NewJFrame frame = null;
    
	void move(NewJFrame frame);
	
}
