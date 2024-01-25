package sunat.gob.pe.ejercicio02g7;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
    	
        Button btnActual = new Button("Actual");
        btnActual.setPrefSize(80, 25);
        
        Button btnProyectado = new Button("Proyectado");
        btnProyectado.setPrefSize(80, 25);
        
        Button btnEstimado = new Button("Estimado");
        btnEstimado.setPrefSize(80, 25);
        
    	HBox hbox = new HBox(btnActual, btnProyectado, btnEstimado);
    	hbox.setSpacing(5);
    	Insets sangriaHbox = new Insets(10, 0, 0, 0);
    	//hbox.setAlignment(Pos.CENTER);
    	hbox.setAlignment(Pos.BASELINE_CENTER);

    	hbox.setPadding(sangriaHbox);
    	
    	Label lblData = new Label("Data");
    	lblData.setStyle("-fx-font-weight:bold");
    	
    	Insets sangriaLabel = new Insets(0, 0, 0, 10);
    	
    	Label lblVentas = new Label("Ventas");
    	lblVentas.setPadding(sangriaLabel);
    	
    	Label lblMarketing = new Label("Marketing");
    	lblMarketing.setPadding(sangriaLabel);
    	
    	Label lblDistribucion = new Label("Distribucion");
    	lblDistribucion.setPadding(sangriaLabel);
    	
    	Label lblCostos = new Label("Costos");
    	lblCostos.setPadding(sangriaLabel);
    	
    	
    	Insets sangriaVBox = new Insets(10, 0, 0, 10);
    	VBox vbox = new VBox(lblData, lblVentas, lblMarketing, lblDistribucion, lblCostos);
    	vbox.setPadding(sangriaVBox); 	
    	vbox.setSpacing(5);
        
        Scene scene = new Scene(vbox, 640, 480);
        stage.setScene(scene);
        stage.setTitle("Grupo 7");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}