package com.mycompany.mvvmexample;

/**
 * Tiffany Chan
 * CSC325
 * Lab12 
 * 
 * 1. Fix the registration from - done
 * 2. Create scenes for signing in and sign out - done
 * 3. Allow the java user's name between the different scenes and ?
 * 4. Add menu - done
 * 5. improve style - done
 */

import com.google.cloud.firestore.Firestore;
import com.google.firebase.auth.FirebaseAuth;
import com.mycompany.mvvmexample.FirestoreContext;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    public static Firestore fstore;
    public static FirebaseAuth fauth;
    public static Scene scene;
    private final FirestoreContext contxtFirebase = new FirestoreContext();

    @Override
    public void start(Stage primaryStage) throws Exception {
        fstore = contxtFirebase.firebase();
        fauth = FirebaseAuth.getInstance();
        scene = new Scene(loadFXML("loginView.fxml"));
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml ));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {

        launch(args);

    }

}
