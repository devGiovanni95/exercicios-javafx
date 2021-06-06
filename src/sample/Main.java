package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
        Button botaoA = new Button("A");//criando botoes
        Button botaoB = new Button("B");
        Button botaoC = new Button("C");

        botaoA.setOnAction(e -> System.out.println("A"));
        botaoB.setOnAction(e -> System.out.println("B"));
        botaoC.setOnAction(e -> System.exit(0));

        HBox box = new HBox();//janelas na horizontal
//        VBox box = new VBox();//janelas na vertical
        box.setAlignment(Pos.CENTER);//alinhamento (posicao central)
        box.setSpacing(10);//espaço entre caixas
        box.getChildren().add(botaoA);//adicionando na vertical
        box.getChildren().add(botaoB);
        box.getChildren().add(botaoC);

        Scene unicaCena = new Scene(box, 200, 150);
        primaryStage.setScene(unicaCena);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
