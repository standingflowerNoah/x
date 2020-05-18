package groupTask;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.Group;

public class NewImage {
	public NewImage() {
	}
	
	public void setImage(Image image,double height,double width,double x,double y,Group group) {
	    ImageView IV1=new ImageView(image);
		IV1.setFitHeight(height);
		IV1.setFitWidth(width);
		IV1.setLayoutX(x);
		IV1.setLayoutY(y);
		group.getChildren().add(IV1);
	}

}
