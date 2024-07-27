package porto.java.PortoJava;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
    	FXMLLoader Loader = new FXMLLoader(App.class.getResource("App.fxml"));
        scene = new Scene(Loader.load());
        stage.setScene(scene);
        
        stage.setTitle("ObservableList CRUD");
        
        stage.show();
    }
    
    public static void main(String[] args) {
        launch();
    }

}