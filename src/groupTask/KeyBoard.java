package groupTask;
import javafx.application.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.LinearGradient;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.*;
import javafx.scene.control.Label;
import javafx.scene.text.*;
import javafx.scene.paint.*;

public class KeyBoard {
	private Group group;
	private static String st="";
	private static Text text=new Text(st);
	public KeyBoard() {
	}
	public static ImageView setKey(ImageView i,double x,double y) {
	    i.setFitHeight(58);
	    i.setFitWidth(60);
	    i.setLayoutX(x);
	    i.setLayoutY(y);
	    return i;
	}
	

      public static void training(Scene c,ImageView iv[],KeyCode kc[],Group group) {
		
		c.setOnKeyPressed(e->{
			//System.out.println(e.getCode().toString());
			for(int i=0;i<kc.length;i++)
			{
			if(e.getCode()==kc[i]) {
			    iv[i].setFitHeight(62);
			    iv[i].setFitWidth(64);
			 
			    switch(i){
			    case 0:
			    	st="1";
			    	break;
			    case 1:
			    	st="2";
			    	break;
			    case 2:
			    	st="3";
			    	break;
			    case 3:
			    	st="4";
			    	break;
			    case 4:
			    	st="5";
			    	break;
			    case 5:
			    	st="6";
			    	break;
			    case 6:
			    	st="7";
			    	break;
			    case 7:
			    	st="8";
			    	break;
			    case 8:
			    	st="9";
			    	break;
			    case 9:
			    	st="0";
			    	break;
			    case 10:
			    	st="Q";
			    	break;
			    case 11:
			    	st="W";
			    	break;
			    case 12:
			    	st="E";
			    	break;
			    case 13:
			    	st="R";
			    	break;
			    case 14:
			    	st="T";
			    	break;
			    case 15:
			    	st="Y";
			    	break;
			    case 16:
			    	st="U";
			    	break;
			    case 17:
			    	st="I";
			    	break;
			    case 18:
			    	st="O";
			    	break;
			    case 19:
			    	st="P";
			    	break;
			    case 20:
			    	st="A";
			    	break;
			    case 21:
			    	st="S";
			    	break;
			    case 22:
			    	st="D";
			    	break;
			    case 23:
			    	st="F";
			    	break;
			    case 24:
			    	st="G";
			    	break;
			    case 25:
			    	st="H";
			    	break;
			    case 26:
			    	st="J";
			    	break;
			    case 27:
			    	st="K";
			    	break;
			    case 28:
			    	st="L";
			    	break;
			    case 29:
			    	st="Z";
			    	break;
			    case 30:
			    	st="X";
			    	break;
			    case 31:
			    	st="C";
			    	break;
			    case 32:
			    	st="V";
			    	break;
			    case 33:
			    	st="B";
			    	break;
			    case 34:
			    	st="N";
			    	break;
			    case 35:
			    	st="M";
			    	break;
			    default:
			    	break;
			    }
			   // text=new Text(st);
			   text = TextBuilder.create().text(st).
	                    font(Font.font("Tahoma", 80)).build();
			    st="";
              //  System.out.println(st);
			    initText();
			    group.getChildren().add(text);
			}   	 
			}
		});
		c.setOnKeyReleased(e->{
			for(int i=0;i<kc.length;i++)
			if(e.getCode()==kc[i]) {
			    iv[i].setFitHeight(58);
			    iv[i].setFitWidth(60);
			    group.getChildren().remove(text);
			    st="";
			}
			group.getChildren().remove(text);
		});
	
	}
      public static void initText() {
    	  text.setLayoutX(600);
    	  text.setLayoutY(100);
    	  text.setFill(new LinearGradient(0, 0, 1, 2, true, CycleMethod.REPEAT, new
    		         Stop[]{new Stop(0, Color.AQUA), new Stop(0.5f, Color.RED)}));
    		text.setStrokeWidth(1);
    		text.setStroke(Color.BLACK);
    		
      }


}



