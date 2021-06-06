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

    private int contador = 0;

    private void atualizarLabelNumero(Label label) {
        label.setText(Integer.toString(contador));

        label.getStyleClass().remove("verde");
        label.getStyleClass().remove("vermelho");

        if (contador > 0) {
            label.getStyleClass().add("verde");
        } else if (contador == 0){
            label.getStyleClass().add("numero");
        }else {
            label.getStyleClass().add("vermelho");
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Label labelTitulo = new Label("Contador");//texto
        labelTitulo.getStyleClass().add("titulo");

        Label labelNumero = new Label("0");
        labelNumero.getStyleClass().add("numero");

        /*Adicionando acoes para os botoes*/
        Button botaoDecremento = new Button("-");
        botaoDecremento.getStyleClass().add("botoes");//adicionando propriedades nos botoes
        botaoDecremento.setOnAction(e -> {
            contador--;
            atualizarLabelNumero(labelNumero);
//            labelNumero.setText(Integer.toString(contador));
        });

        Button botaoIncremento = new Button("+");
        botaoIncremento.getStyleClass().add("botoes");//adicionando propriedades nos botoes
        botaoIncremento.setOnAction(e -> {
            contador++;
            atualizarLabelNumero(labelNumero);
//            labelNumero.setText(Integer.toString(contador));
        });
        HBox boxBotoes = new HBox();//criando botoes horizontais
        boxBotoes.setAlignment(Pos.CENTER);//alinhamento dos botoes
        boxBotoes.setSpacing(10);//espaçamento entre os botoes
        boxBotoes.getChildren().add(botaoDecremento);
        boxBotoes.getChildren().add(botaoIncremento);

        VBox boxConteudo = new VBox();//botoes na vertical
        boxConteudo.getStyleClass().add("conteudo");//conteudo e o nome da classe (nao precisa colocar o ponto na frente)
        boxConteudo.setAlignment(Pos.CENTER);//alinhamento dos botoes
        boxConteudo.setSpacing(10);//espaçamento entre os botoes
        boxConteudo.getChildren().add(labelTitulo);
        boxConteudo.getChildren().add(labelNumero);
        boxConteudo.getChildren().add(boxBotoes);

// cria a chamada dos componentes da tela
//        Scene cenaPrincipal = new Scene(boxConteudo);
        String caminhoDoCss = getClass().
                getResource("/basico/Contador.css").toExternalForm();//chamando o caminho que o arquivo css esta localizado

        Scene cenaPrincipal = new Scene(boxConteudo, 400, 400);//cria o tamanho da janela
        cenaPrincipal.getStylesheets().add(caminhoDoCss);
        cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Raleway");
//        cenaPrincipal.getStylesheets().add("https://fonts.google.com/specimen/Josefin+Sans#standard-styles");
        primaryStage.setScene(cenaPrincipal);//coloca os componentes na janelka principal
        primaryStage.show();//chama a janela principal
    }

    public static void main(String[] args) {
        launch(args);
    }
}
