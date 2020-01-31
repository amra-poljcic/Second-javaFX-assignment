package ba.unsa.etf.rpr.t7;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Locale;
import java.util.ResourceBundle;

import static javafx.scene.layout.Region.USE_COMPUTED_SIZE;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        KorisniciModel model = new KorisniciModel();
        model.napuni();
        KorisnikController ctrl = new KorisnikController(model);
        ResourceBundle resourceBundle = ResourceBundle.getBundle("Translation", new Locale("en", "US"));
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/korisnici.fxml"), resourceBundle);
        loader.setController(ctrl);
        Parent root = loader.load();
        primaryStage.setTitle("Korisnici");
        primaryStage.setScene(new Scene(root, USE_COMPUTED_SIZE, USE_COMPUTED_SIZE));
        primaryStage.show();
        //primaryStage.setResizable(false);
    }


    public static void main(String[] args) {
        launch(args);

    }
}
