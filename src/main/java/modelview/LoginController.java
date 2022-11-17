package modelview;

import java.io.IOException;
import java.util.TreeMap;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import models.User;
import models.StoreAndBackUpData;

public class LoginController {

    private String userNa;
    private String userPass;
    private TreeMap<String, User> useraAccounts = StoreAndBackUpData.getUseraAccounts();

    @FXML
    private TextField userNameTextField;

    @FXML
    private PasswordField passwordTextField;

    @FXML
    private Button signInButton;

    @FXML
    private Button signUpButton;

    @FXML
    void logInMethod(ActionEvent event) throws IOException {

        userNa = userNameTextField.getText();
        userPass = passwordTextField.getText();

        if (userNa == "login" && userPass == "password") {
            changeScene(event, "AccessFBView.fxml");
        }

    }

    public void changeScene(ActionEvent event, String str) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(str));
        Parent root = loader.load();
        Scene scene = new Scene(root, 700, 700);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setWidth(700);
        window.setHeight(700);
        window.setScene(scene);
        window.show();
    }

}
