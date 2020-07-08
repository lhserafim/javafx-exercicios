package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label labelTitulo = new Label("Contador");
        Label labelNumero = new Label("0");

        Button botaoDecremento = new Button("-");
        Button botaoIncremento = new Button("+");

        HBox boxBotoes = new HBox();
        boxBotoes.setAlignment(Pos.CENTER);
        boxBotoes.setSpacing(10);
        // Aidicionando botões ao HBox
        boxBotoes.getChildren().add(botaoDecremento);
        boxBotoes.getChildren().add(botaoIncremento);

        VBox boxPrincipal = new VBox();
        boxPrincipal.setAlignment(Pos.CENTER);
        boxPrincipal.setSpacing(10);
        // Adicionando Elementos ao VBox
        boxPrincipal.getChildren().add(labelTitulo);
        boxPrincipal.getChildren().add(labelNumero);
        boxPrincipal.getChildren().add(boxBotoes);

        // Carregar o VBox dentro da Scene
        Scene cenaPrincipal = new Scene(boxPrincipal, 400, 400);
        // Carregar Scene no Stage (palco)
        primaryStage.setScene(cenaPrincipal);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
