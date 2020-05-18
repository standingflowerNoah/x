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
import javafx.scene.input.KeyCode;

public class TypeTraining extends Application{
	public TypeTraining(){
	}

	public void start(Stage primateStage) {
		Group group=new Group();
		
		NewButton nb=new NewButton();
		Button fh=new Button();
		fh=nb.setNewButton("返回菜单",800, 200, fh);
	  //  group.getChildren().add(fh);
	    nb.toMain(fh,primateStage);
		
		Button bt1=new Button();
		bt1=nb.setNewButton("基准键位",800,100,bt1);
		Button bt2=new Button();
		bt2=nb.setNewButton("打字姿势", 800, 150, bt2);
		
	    group.getChildren().add(bt1);
	    group.getChildren().add(bt2);
	    group.getChildren().add(fh);
	    
	    Image image1=new Image("image/基准键位.png");
		nb.showImage(bt1, image1, "基准键位");
	    Image image2=new Image("image/打字姿势.png");
		nb.showImage(bt2,image2,"打字姿势");
	    
	    NewImage newImage=new NewImage();
	    Image image=new Image("image/键盘.png");
	    newImage.setImage(image,279 , 882, 70, 300, group);
	    
	    Image background=new Image("image/打字练习.jpg");
	    newImage.setImage(background,280,474,100,5, group);
	    
	    KeyBoard keyboard=new KeyBoard();
	    
	    ImageView IV11=new ImageView(new Image("image/num1.png"));
	    group.getChildren().add(KeyBoard.setKey(IV11, 125, 300));	
	    ImageView IV22=new ImageView(new Image("image/num2.png"));
	    group.getChildren().add(KeyBoard.setKey(IV22, 185, 300));	
	    ImageView IV3=new ImageView(new Image("image/num3.png"));
	    group.getChildren().add(keyboard.setKey(IV3, 245, 300));
	    ImageView IV4=new ImageView(new Image("image/num4.png"));
	    group.getChildren().add(keyboard.setKey(IV4, 305, 300));
	    ImageView IV5=new ImageView(new Image("image/num5.png"));
	    group.getChildren().add(keyboard.setKey(IV5, 365, 300));
	    ImageView IV6=new ImageView(new Image("image/num6.png"));
	    group.getChildren().add(keyboard.setKey(IV6, 425, 300));	
	    ImageView IV7=new ImageView(new Image("image/num7.png"));
	    group.getChildren().add(keyboard.setKey(IV7, 485, 300));
	    ImageView IV8=new ImageView(new Image("image/num8.png"));
	    group.getChildren().add(keyboard.setKey(IV8, 545, 300));
	    ImageView IV9=new ImageView(new Image("image/num9.png"));
	    group.getChildren().add(keyboard.setKey(IV9, 605, 300));
	    ImageView IV0=new ImageView(new Image("image/num0.png"));
	    group.getChildren().add(keyboard.setKey(IV0, 665, 300));
	    ImageView IVQ=new ImageView(new Image("image/charQ.png"));
	    group.getChildren().add(keyboard.setKey(IVQ, 153, 358));
	    ImageView IVW=new ImageView(new Image("image/charW.png"));
	    group.getChildren().add(keyboard.setKey(IVW, 213, 358));
	    ImageView IVE=new ImageView(new Image("image/charE.png"));
	    group.getChildren().add(keyboard.setKey(IVE, 273, 358));
	    ImageView IVR=new ImageView(new Image("image/charR.png"));
	    group.getChildren().add(keyboard.setKey(IVR, 333, 358));
	    ImageView IVT=new ImageView(new Image("image/charT.png"));
	    group.getChildren().add(keyboard.setKey(IVT, 393, 358));
	    ImageView IVY=new ImageView(new Image("image/charY.png"));
	    group.getChildren().add(keyboard.setKey(IVY, 453, 358));
	    ImageView IVU=new ImageView(new Image("image/charU.png"));
	    group.getChildren().add(keyboard.setKey(IVU, 513, 358));
	    ImageView IVI=new ImageView(new Image("image/charI.png"));
	    group.getChildren().add(keyboard.setKey(IVI, 573, 358));
	    ImageView IVO=new ImageView(new Image("image/charO.png"));
	    group.getChildren().add(keyboard.setKey(IVO, 633, 358));
	    ImageView IVP=new ImageView(new Image("image/charP.png"));
	    group.getChildren().add(keyboard.setKey(IVP, 693, 358));
	    ImageView IVA=new ImageView(new Image("image/charA.png"));
	    group.getChildren().add(keyboard.setKey(IVA, 183, 412));
	    ImageView IVS=new ImageView(new Image("image/charS.png"));
	    group.getChildren().add(keyboard.setKey(IVS, 243, 412));
	    ImageView IVD=new ImageView(new Image("image/charD.png"));
	    group.getChildren().add(keyboard.setKey(IVD, 303, 412));
	    ImageView IVF=new ImageView(new Image("image/charF.png"));
	    group.getChildren().add(keyboard.setKey(IVF, 363, 412));
	    ImageView IVG=new ImageView(new Image("image/charG.png"));
	    group.getChildren().add(keyboard.setKey(IVG, 423, 412));
	    ImageView IVH=new ImageView(new Image("image/charH.png"));
	    group.getChildren().add(keyboard.setKey(IVH, 483, 412));
	    ImageView IVJ=new ImageView(new Image("image/charJ.png"));
	    group.getChildren().add(keyboard.setKey(IVJ, 543, 412));
	    ImageView IVK=new ImageView(new Image("image/charK.png"));
	    group.getChildren().add(keyboard.setKey(IVK, 603, 412));
	    ImageView IVL=new ImageView(new Image("image/charL.png"));
	    group.getChildren().add(keyboard.setKey(IVL, 661, 412));
	    ImageView IVZ=new ImageView(new Image("image/charZ.png"));
	    group.getChildren().add(keyboard.setKey(IVZ, 213, 467));
	    ImageView IVX=new ImageView(new Image("image/charX.png"));
	    group.getChildren().add(keyboard.setKey(IVX, 273, 467));
	    ImageView IVC=new ImageView(new Image("image/charC.png"));
	    group.getChildren().add(keyboard.setKey(IVC, 333, 467));
	    ImageView IVV=new ImageView(new Image("image/charV.png"));
	    group.getChildren().add(keyboard.setKey(IVV, 393, 467));
	    ImageView IVB=new ImageView(new Image("image/charB.png"));
	    group.getChildren().add(keyboard.setKey(IVB, 453, 467));
	    ImageView IVN=new ImageView(new Image("image/charN.png"));
	    group.getChildren().add(keyboard.setKey(IVN, 513, 467));
	    ImageView IVM=new ImageView(new Image("image/charM.png"));
	    group.getChildren().add(keyboard.setKey(IVM, 573, 467));
	    
        Scene scene=new Scene(group,1000,650);
            
        ImageView imag[]={IV11,IV22,IV3,IV4,IV5,IV6,IV7,IV8,IV9,IV0,IVQ,IVW,IVE,IVR,IVT,IVY,IVU,IVI,IVO,IVP,IVA,IVS,IVD,IVF,IVG,IVH,IVJ,IVK,IVL,IVZ,IVX,IVC,IVV,IVB,IVN,IVM};
        KeyCode key[]={KeyCode.DIGIT1,KeyCode.DIGIT2,KeyCode.DIGIT3,KeyCode.DIGIT4,KeyCode.DIGIT5,KeyCode.DIGIT6,KeyCode.DIGIT7,KeyCode.DIGIT8,KeyCode.DIGIT9,KeyCode.DIGIT0,KeyCode.Q,KeyCode.W,KeyCode.E,KeyCode.R,KeyCode.T,KeyCode.Y,KeyCode.U,KeyCode.I,KeyCode.O,KeyCode.P,KeyCode.A,KeyCode.S,KeyCode.D,KeyCode.F,KeyCode.G,KeyCode.H,KeyCode.J,KeyCode.K,KeyCode.L,KeyCode.Z,KeyCode.X,KeyCode.C,KeyCode.V,KeyCode.B,KeyCode.N,KeyCode.M};
        KeyBoard.training(scene,imag,key,group);        
            
        primateStage.setTitle("打字练习");
    	primateStage.setScene(scene);
    	primateStage.show();
 

	    
	}


}
