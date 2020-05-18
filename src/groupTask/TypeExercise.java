package groupTask;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.Event;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.Group;
import javafx.geometry.Insets;
import javafx.scene.image.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import static javafx.scene.input.KeyEvent.KEY_TYPED;
import javafx.scene.layout.Pane;
import java.util.Date;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import javafx.scene.text.*;

public class TypeExercise extends Application{
	private int totalCharacter;
	private int rightCharacter;
	public static long totalTime;
	private int accuracy;
    private static Button start=new Button();
    private static Button over=new Button();
    private long startTime;
    private long overTime;
    private String st="";
    private Label label1;
    private Label label2;
    private Group group=new Group();
    private Text myEntering;
    private static String myEnteringString="";
    private  Label label=new Label("选择难度：");
    private Scene scene=new Scene(group,1000,650);
    private File f1=new File("training1.txt");
    private File f2=new File("training2.txt");
    private static boolean hardOrNot;
		
	public TypeExercise(){
	}
    @Override
	public void start(Stage primateStage) {
		
		
		NewButton nb=new NewButton();
		Button fh=new Button();
		fh=nb.setNewButton("返回菜单", 790, 220, fh);
	    group.getChildren().add(fh);
	    nb.toMain(fh,primateStage);
	    
	    initLabel();
	    group.getChildren().add(label);
	    
		Button n1=new Button();
		n1=nb.setNewButton("简单", 790, 100, n1);
		Button n2=new Button();
		n2=nb.setNewButton("困难",790,150,n2);
	    group.getChildren().add(n1);
	    group.getChildren().add(n2);
	    
	    //nb.chooseLevel(n1,f1);
	    //nb.chooseLevel(n2,f2); 
		n1.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event){
				try{
					
						Scanner input=new Scanner(f1);
						if(!f1.exists()) {
							throw new IOException();
						}
						st="";
						while(input.hasNext()) {
							st+=(input.nextLine()+"\n");
						}
					    label1=new Label(st);
					    label1.setFont(Font.font("STCaiyun",FontWeight.MEDIUM,FontPosture.ITALIC,20));
					    label1.setLayoutX(50);
					    label1.setLayoutY(50);
					    if(group.getChildren().contains(label2)) {
					    	group.getChildren().remove(label2);
					    }
					    group.getChildren().add(label1);
					input.close();
					
				}catch(IOException ex) {
					System.out.println("The file does not exist");
				}

			}
		});
		
		n2.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event){
				try{
					
						Scanner input=new Scanner(f2);
						if(!f2.exists()) {
							throw new IOException();
						}
						st="";
						while(input.hasNext()) {
							st+=(input.nextLine()+"\n");
						}
					    label2=new Label(st);
					    label2.setFont(Font.font("STCaiyun",FontWeight.MEDIUM,FontPosture.ITALIC,20));
					    label2.setLayoutX(50);
					    label2.setLayoutY(50);
					    if(group.getChildren().contains(label1)) {
					    	group.getChildren().remove(label1);
					    }
					    group.getChildren().add(label2);
					input.close();
					
				}catch(IOException ex) {
					System.out.println("The file does not exist");
				}

			}
		});
        
        showMyEntering();

	    /*start=nb.setNewButton("开始测试",200,540,start);
	    over=nb.setNewButton("结束测试",400,540,over);    
	    group.getChildren().add(start);
	    group.getChildren().add(over);*/
		
	    NewImage newImage=new NewImage();
	    Image image=new Image("image/打字测试.jpg");
	    newImage.setImage(image, 256.2, 436.8, 640, 300, group);
	    
	  
	    primateStage.setTitle("打字测试");
	    primateStage.setScene(scene);
	    primateStage.show();
	}
    
    public void initLabel() {
	    label.setFont(Font.font("STCaiyun",FontWeight.BOLD,FontPosture.ITALIC,30));
	    label.setLayoutX(790);
	    label.setLayoutY(50);
    }
    
	/*public long getTime(Button bt) {
		final long t=0;
		return t;
	}
    
    public String displayTotalTime() {
     	start.setOnAction(new EventHandler<ActionEvent>() {
		public void handle(ActionEvent event) {
				startTime=System.currentTimeMillis();
			}
		});
     	over.setOnAction(new EventHandler<ActionEvent>() {
		public void handle(ActionEvent event) {
				overTime=System.currentTimeMillis();

			}
		});
    	totalTime=overTime-startTime;
    	int min=(int)totalTime%60;
    	int sec=(int)totalTime/60;
    	
    	String st=min+"分"+sec+"秒";
    	//System.out.println(st);

    	return st;
    }*/
    
    public void showMyEntering() {
		scene.setOnKeyPressed(e->{
			myEnteringString+=e.getText();
			myEntering=new Text(myEnteringString);
		    myEntering.setLayoutX(70);
		    myEntering.setLayoutY(300);
		    myEntering.setFont(Font.font("Verdana", FontWeight.MEDIUM, 20));
	        group.getChildren().add(myEntering);
			
		});
  
    }
    
  //  public void 
     
    
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	public void setmyEnteringString() {
		myEnteringString="";
	}
	

}
