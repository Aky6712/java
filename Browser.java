import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Browser extends Application {
    @Override
    public void start(Stage stage) {
        WebView webView = new WebView();
        TextField addressBar = new TextField("https://www.google.com");
        Button goButton = new Button("Go");

        HBox addressBarContainer = new HBox(addressBar, goButton);
        VBox mainContainer = new VBox(addressBarContainer, webView);

        goButton.setOnAction(e -> webView.getEngine().load(addressBar.getText()));

        Scene scene = new Scene(mainContainer);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
