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
    	
       /* Button btnActual = new Button("Actual");
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
    	vbox.setSpacing(5);*/
    	
    	Button btnResumen = new Button("Resumen");
    	btnResumen.setPrefSize(80, 25);
    	Button btnCredito = new Button("Credito");
    	btnCredito.setPrefSize(80, 25);
    	Button btnAhorro = new Button("Ahorro");
    	btnAhorro.setPrefSize(80, 25);
    	
    	Button btnMovimiento = new Button("Movimiento");
    	btnMovimiento.setPrefSize(80, 25);
    	Button btnDeudas = new Button("Deudas");
    	btnDeudas.setPrefSize(80, 25);
    	Button btnHistorial = new Button("Historial");	
    	btnHistorial.setPrefSize(80, 25);    	
    	
    	HBox hboxPrimeraFila = new HBox(btnResumen, btnCredito, btnAhorro);
    	hboxPrimeraFila.setSpacing(10);
    	
    	HBox hboxSegundaFila = new HBox(btnMovimiento, btnDeudas, btnHistorial);
    	hboxSegundaFila.setSpacing(10);
    	
    	VBox tabla = new VBox(hboxPrimeraFila, hboxSegundaFila);
    	tabla.setSpacing(10);
    	
    	Insets sangriaTabla = new Insets(20, 0, 0, 20);
    	tabla.setPadding(sangriaTabla);
    	   	
    	Scene scene = new Scene(tabla, 640, 480);
        stage.setScene(scene);
        stage.setTitle("Grupo 7");
        stage.show();
        
    }

    public static void main(String[] args) {
        launch();
    }

}