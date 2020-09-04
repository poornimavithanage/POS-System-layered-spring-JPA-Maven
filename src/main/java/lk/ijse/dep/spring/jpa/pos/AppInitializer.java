package lk.ijse.dep.spring.jpa.pos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lk.ijse.dep.spring.jpa.pos.db.JPAUtil;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class AppInitializer extends Application {

    private static AnnotationConfigApplicationContext ctx; // can access anywhere in the project

    public static AnnotationConfigApplicationContext getApplicationContext(){
        return ctx;
    }


    public static void main(String[] args) throws IOException {

        ctx= new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        launch(args);
        JPAUtil.getEntityManagerFactory().close();


    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(this.getClass().getResource("/view/MainForm.fxml"));
        Scene mainScene = new Scene(root);
        primaryStage.setScene(mainScene);
        primaryStage.setTitle("Spring-JPA POS");
        primaryStage.centerOnScreen();
        primaryStage.show();

    }
       
    }



