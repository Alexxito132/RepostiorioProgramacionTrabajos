package org.example.holafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import sun.jvm.hotspot.utilities.Observable;

import java.awt.*;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Label lnlNombre = new Label();
        TextField tfNombre = new TextField();
        Label lblComentario = New Label("Opciones");
        ObservableList<String> opciones = FXCollections.observableArrayList("A", "B", "C");
        ComboBox cmbOpciones = new ComboBox(opciones);
        Button btnAceptar = new Button("Aceptar");
        Label lblResultado = new Label();

        btnAceptar.setOnAction{
            String nombre = tfNombre.getText();
            String comentario = tfComentario.getText();
            String seleccion = cmbOpciones.getSelectedItem().toString();
            if(nombre.isEmpty() || comentario.isEmpty() || seleccion.isEmpty()) {
                System.out.println("Todos los campos son obligatorios");
            } else {
                lblResultado.setText("Nombre: " + nombre + "\nComentario:" + c)
            }
        }
        GridPane form = new GridPane();
        form.setAlignment(Pos.CENTER);
        form.setHgap(10);
        form.setVgap(10);
        root.setPadding(new Insets(20));
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 500, 700);

        stage.setTitle("Mi primer app en java");
        Image image = new Image(getClass().getResourceAsStream("/images/chilli-pepper_6469778.png"));
        stage.getIcons().add(image);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}