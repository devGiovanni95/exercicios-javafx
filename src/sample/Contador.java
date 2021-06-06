package sample;

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

        Label labelTitulo = new Label("Contador");//texto
        Label labelNumero = new Label("0");

        Button botaoIncremento = new Button("+");
        Button botaoDecremento = new Button("-");

        HBox boxBotoes = new HBox();//criando botoes horizontais
        boxBotoes.setAlignment(Pos.CENTER);//alinhamento dos botoes
        boxBotoes.setSpacing(10);//espaçamento entre os botoes
        boxBotoes.getChildren().add(botaoDecremento);
        boxBotoes.getChildren().add(botaoIncremento);

        VBox boxPrincipal = new VBox();//botoes na vertical
        boxPrincipal.setAlignment(Pos.CENTER);//alinhamento dos botoes
        boxPrincipal.setSpacing(10);//espaçamento entre os botoes
        boxPrincipal.getChildren().add(labelTitulo);
        boxPrincipal.getChildren().add(labelNumero);
        boxPrincipal.getChildren().add(boxBotoes);

// cria a chamada dos componentes da tela
//        Scene cenaPrincipal = new Scene(boxPrincipal);
        Scene cenaPrincipal = new Scene(boxPrincipal, 400, 400);//cria o tamanho da janela
        primaryStage.setScene(cenaPrincipal);//coloca os componentes na janelka principal
        primaryStage.show();//chama a janela principal
    }

    public static void main(String[] args) {
        launch(args);
    }
}
