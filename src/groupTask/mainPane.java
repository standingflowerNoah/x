package groupTask;
import groupTask.NewImage;
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
import javafx.scene.paint.*;

public class mainPane extends Application{
	
    private Button b1=new Button();
    private Button b2=new Button();
    private Button b3=new Button();
    private Button b4=new Button("about us");
    private	Group group=new Group();
    private NewButton nb=new NewButton();
    private NewImage background=new NewImage();
    private Image image=new Image("image/mainPane.png");
    private Image picture1=new Image("image/c.jpg");
    private Image picture2=new Image("image/z.jpg");    
    private  Label label=new Label("小新打字");
    private Scene scene=new Scene(group,1000,650);
    public mainPane(){
	}
	public void start(Stage primateStage) {
	    TypeExercise exercise=new TypeExercise();
	    exercise.setmyEnteringString();

	    b1=nb.setNewButton("打字游戏",400,200,b1);
	    b2=nb.setNewButton("打字测试",400,300,b2);
	    b3=nb.setNewButton("打字练习", 400,400,b3);
	    nb.toGame(b1, primateStage);
	    nb.toExercise(b2, primateStage);
	    nb.toTraining(b3, primateStage); 
	    setLabel();

	    b4=nb.setNewButton("About Us", 400,500,b4);
	    aboutUs();
	    group.getChildren().addAll(b1,b2,b3,b4);
        background.setImage(image,140,180,600,300,group);
        
	    primateStage.setTitle("小新打字");
	    primateStage.setScene(scene);
	    primateStage.show();
	   	    
		
		
	}
	/*public void setButton4() {
		b4.setStyle("-fx-font-size:500;-fx-highlight-fill: #00ff00; -fx-highlight-text-fill: #000000");
		b4.setStyle(" -fx-background-color: white;");
		b4.setTextFill(Paint.valueOf("#ff0000"));
		//b4.setStyle("-fx-background-color:#4d4d4d;-fx-border-color: #545454;-fx-border-width: 1px;-fx-border-style: solid;");
	    b4.setLayoutX(383);
	    b4.setLayoutY(470);
	    b4.setPrefWidth(150);
	    b4.setPrefHeight(40);
	    group.getChildren().add(b4);

	}*/
	
	public void setLabel() {
	    label.setFont(Font.font("STCaiyun",FontWeight.BOLD,FontPosture.ITALIC,50));
	    label.setLayoutX(370);
	    label.setLayoutY(100);
	    group.getChildren().add(label);
	}
	
	public void aboutUs() {
		b4.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
					Stage stage2=new Stage();
				    Group group2=new Group();
				    Text text=new Text("关于我们\r\n" + 
				    		"开发人员：\r\n" + 
				    		"");
				    text.setFont(Font.font("Verdana", FontWeight.MEDIUM, 23));
				    text.setLayoutX(50);
				    text.setLayoutY(20);
				    text.setFill(Color.DARKGOLDENROD);
				    Text text1=new Text("陈曦冉                          \r\n" + 
				    		"四川大学生命科学学院\r\n" + 
				    		"计算生物学\r\n" + 
				    		"2019级本科生\r\n" + 
				    		"");
				    text1.setLayoutX(50);
				    text1.setLayoutY(400);
				    text1.setFont(Font.font("Verdana", FontWeight.MEDIUM, 20));
				    Text text2=new Text("詹沛文 \r\n" + 
				    		"四川大学商学院\r\n" + 
				    		"财务管理\r\n" + 
				    		"2018级本科生\r\n" + 
				    		"");
				    text2.setLayoutX(400);
				    text2.setLayoutY(400);
				    text2.setFont(Font.font("Verdana", FontWeight.MEDIUM, 20));
				    Text text3=new Text("如果您有任何对于 小新打字version1.0 的建议，请联系我们\r\n" + 
				    		"陈曦冉 2939295656@qq.com\r\n" + 
				    		"詹沛文 534973156@qq.com\r\n" + 
				    		"");
				    text3.setLayoutX(70);
				    text3.setLayoutY(520);
				    text3.setFont(Font.font("Verdana", FontWeight.MEDIUM, 20));
				    group2.getChildren().addAll(text,text1,text2,text3);
				    
				    NewImage ni=new NewImage();
				    ni.setImage(picture1,288,216.0,50.0,70.0, group2);
				    ni.setImage(picture2, 288, 216, 400, 70, group2);
				    				    
					Scene scene2=new Scene(group2,871,600);
					stage2.setTitle("关于我们");
					stage2.setScene(scene2);
					stage2.show();
										
			}
		});
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
