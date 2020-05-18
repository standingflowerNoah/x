package groupTask;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.scene.Group;
import javafx.geometry.Insets;
import javafx.scene.image.*;

public class TypeGame extends Application{
	public TypeGame(){
	}
	public void start(Stage primateStage) {
		Group group=new Group();
		Image image=new Image("image/打字游戏.jpg");
	    ImageView IV1=new ImageView(image);
		IV1.setFitHeight(626);
		IV1.setFitWidth(500);
		IV1.setLayoutX(30);
		IV1.setLayoutY(80);
		group.getChildren().add(IV1);
		
		Label label=new Label("成绩：");
		label.setFont(Font.font("LiSu",FontWeight.NORMAL,FontPosture.ITALIC,25));
		label.setLayoutX(100);
		label.setLayoutY(50);
		group.getChildren().add(label);
		
		
	    Button fh=new Button("返回菜单");
	    fh.setStyle("-fx-font:22 arial;-fx-base:#FFE4C4");
	    fh.setLayoutX(100);
	    fh.setLayoutY(500);	 
	    group.getChildren().add(fh);
	    
		FanHui lll=new FanHui();
		lll.fanHui(fh,primateStage);
		
	    Scene scene=new Scene(group,1000,650);
		    
		primateStage.setTitle("打字游戏");
		primateStage.setScene(scene);
		primateStage.show();
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}
