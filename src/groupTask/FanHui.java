package groupTask;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class FanHui implements FanHuiBehavior{
	public FanHui() {
	}
	@Override
	public void fanHui(Button fh,Stage st) {
		fh.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
					mainPane mp=new mainPane();
					mp.start(st);		
						
			}
		});
	}
}