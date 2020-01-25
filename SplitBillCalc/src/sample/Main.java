import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;

public class Main extends Application {
    private TextField tfBill = new TextField();
    private TextField tfTax = new TextField();
    private TextField tfSplit = new TextField();
    private TextField tfTotal = new TextField();
    private Button btCalculate = new Button("Calculate");

    @Override
    public void start(Stage primaryStage) {
        //Create UI
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.add(new Label("Bill:"),0,0);
        gridPane.add(tfBill, 1, 0);
        gridPane.add(new Label("Tax:"),0,1);
        gridPane.add(tfTax, 1, 1);
        gridPane.add(new Label("Split:"),0, 2);
        gridPane.add(tfSplit, 1, 2);
        gridPane.add(tfTotal, 1, 3);

        //Set properties for UI
        gridPane.setAlignment(Pos.CENTER);
        tfBill.setAlignment(Pos.BOTTOM_RIGHT);
        tfTax.setAlignment(Pos.BOTTOM_RIGHT);
        tfSplit.setAlignment(Pos.BOTTOM_RIGHT);
        GridPane.setHalignment(btCalculate, HPos.LEFT);

        //Process events
        btCalculate.setOnAction(e -> calculateSplitBill());

        //Create a scene and place it in the stage
        Scene scene = new Scene(gridPane, 400, 400);
        primaryStage.setTitle("Split Bill Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void calculateSplitBill(){
        //Get input from text fields.
        double bill = Double.parseDouble(tfBill.getText());
        double tax = Double.parseDouble(tfTax.getText());
        int split = Integer.parseInt(tfSplit.getText());

        double total = (bill + (bill*tax));
        double totalSplit = total/split;

        tfTotal.setText(String.format("The total for the bills is $%.2f and split %.0d ways is $%.2f", total, split, totalSplit));



    }
    public static void main(String[] args) {
        launch(args);
    }

}


