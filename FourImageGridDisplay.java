import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FourImageGridDisplay extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Creates a window 
        GridPane gridPane = new GridPane();

        // Load all 4 images
        Image FirstLogo = new Image("file:Java_Code/FF6Logo.png");
        Image SecondLogo = new Image("file:Java_Code/FF7Logo.png");
        Image ThirdLogo = new Image("file:Java_Code/FF10_2Logo.png");
        Image FourthLogo = new Image("file:Java_Code/FF15Logo.png");

        // Create ImageViews for each image
        ImageView ViewFirst = new ImageView(FirstLogo);
        ImageView ViewSecond = new ImageView(SecondLogo);
        ImageView ViewThird = new ImageView(ThirdLogo);
        ImageView ViewFourth = new ImageView(FourthLogo);

        // Sets each image to a set width and height so they fit the gridpane
        ViewFirst.setFitWidth(300);
        ViewFirst.setFitHeight(300);
        ViewSecond.setFitWidth(300);
        ViewSecond.setFitHeight(300);
        ViewThird.setFitWidth(300);
        ViewThird.setFitHeight(300);
        ViewFourth.setFitWidth(300);
        ViewFourth.setFitHeight(300);

        // Add each of the images to the gridpane in their respective positions
        gridPane.add(ViewFirst, 0, 0);
        gridPane.add(ViewSecond, 1, 0);
        gridPane.add(ViewThird, 0, 1);
        gridPane.add(ViewFourth, 1, 1);

        // Create a new scene and set it to a stage
        Scene Logoscene = new Scene(gridPane, 600, 600);
        primaryStage.setTitle("Final Fantasy Logo display");
        primaryStage.setScene(Logoscene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
