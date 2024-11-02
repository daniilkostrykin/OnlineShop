
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label myLabel;

    @FXML
    private void handleButtonAction() {
        myLabel.setText("Кнопка нажата!");
    }
}
