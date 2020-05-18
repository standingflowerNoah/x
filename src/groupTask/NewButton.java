package groupTask;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.image.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

import java.util.*;

import game.Typer;
import javafx.scene.control.*;
import java.io.*;

public class NewButton {
	
    private static final String btStyle="-fx-font:22 arial;-fx-base:#FFE4C4";
    private static String st="";
    private static Label la;
    
	public NewButton() {
	}
	
	public Button setNewButton(String i,double x,double y,Button bt) {	
		bt=new Button(i);
		bt.setStyle(btStyle);
	    bt.setLayoutX(x);
	    bt.setLayoutY(y);
	    return bt;
	}
	
	public void toExercise(Button bt,Stage stage) {
		bt.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
					TypeExercise tt3=new TypeExercise();
					tt3.start(stage);
			}
		});
	}
	
	
	public void toTraining(Button bt,Stage stage) {
		bt.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
					TypeTraining tt3=new TypeTraining();
					tt3.start(stage);
			}
		});
	}
	
	public void toGame(Button bt,Stage stage) {
		bt.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				Typer tt1=new Typer();
				try {
					tt1.startGame();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}
	
	public void toMain(Button bt,Stage stage) {
		bt.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
					mainPane mp=new mainPane();
					mp.start(stage);		
						
			}
		});
	}
	
	public void showImage(Button bt,Image im,String st) { 
		bt.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
					Stage stage2=new Stage();
				    ImageView IV1=new ImageView(im);
				    Group group2=new Group();
				    group2.getChildren().add(IV1);
					Scene scene2=new Scene(group2,871,400);
					stage2.setTitle(st);
					stage2.setScene(scene2);
					stage2.show();
										
			}
		});
	}
	
	public static void chooseLevel(Button bt,File file){ 
	//	bt.setOnAction(new EventHandler<ActionEvent>() {
		//	public void handle(ActionEvent event) {
					/*Stage stage2=new Stage();
				    Group group2=new Group();
				    
				    NewButton nb=new NewButton();
					Button n1=new Button();
					n1=nb.setNewButton("简单",100,50, n1);
				    group2.getChildren().add(n1);
				    
					n1.setOnAction(new EventHandler<ActionEvent>() {
						
						public void handle(ActionEvent event){
							File file=new File("training1.txt");
							try{
								//readFile(file);
								
									Scanner input=new Scanner(file);
									if(!file.exists()) {
										throw new IOException();
									}
									while(input.hasNext()) {
										st=input.nextLine();}
								input.close();
							}catch(IOException ex) {
								System.out.println("The file does not exist");
							}

						}
					});
					

					Button n2=new Button();
					n2=nb.setNewButton("困难",100,125, n2);
				    group2.getChildren().add(n2);

					n2.setOnAction(new EventHandler<ActionEvent>() {
						public void handle(ActionEvent event) {
							File file=new File("training2.txt");
							try{
								Scanner input=new Scanner(file);
								if(!file.exists()) {
									throw new IOException();
								}
								while(input.hasNext()) {
									st=input.next();}
							input.close();
							}catch(IOException ex) {
								System.out.println("The file's not exist");
							}
						}
					});
				    
					Scene scene2=new Scene(group2,300,200);
					stage2.setTitle("选择难度");
					stage2.setScene(scene2);
					stage2.show();*/
				bt.setOnAction(new EventHandler<ActionEvent>() {
					
					public void handle(ActionEvent event){
						//File file=new File("training1.txt");
						try{
							//readFile(file);
							
								Scanner input=new Scanner(file);
								if(!file.exists()) {
									throw new IOException();
								}
								while(input.hasNext()) {
									st+=(input.nextLine()+"\n");
								}
								//System.out.print(st);
							input.close();
						}catch(IOException ex) {
							System.out.println("The file does not exist");
						}

					}
				});


	}
	

	public static String getString() {
		return st;
	}
	public static Label getLabel() {
	    la=new Label(st);
		return la;
	}
}