/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daychooser;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Brian
 */
public class DayChooser extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Label picklabel = new Label("Select a date: ");
        Label xmaslabel = new Label();
        Label prevlabel = new Label();
        Label currentlabel = new Label();
        Label nextlabel = new Label();
        Label zodiaclabel = new Label();
        Label daylabel = new Label();
        //ImageView zodiacimage = new ImageView(new Image(DayChooser.class.getResourceAsStream("leo.jpg")));
        ImageView zodiacimage = new ImageView();

        currentlabel.setStyle("-fx-font: bold italic 40pt \"Arial\";");
        String regex = "^[0-9]{4}-(((0[13578]|(10|12))-(0[1-9]|[1-2][0-9]|3[0-1]))|(02-(0[1-9]|[1-2][0-9]))|((0[469]|11)-(0[1-9]|[1-2][0-9]|30)))$";
        Pattern pattern = Pattern.compile(regex);
        

        DatePicker dpick = new DatePicker();
        dpick.setOnAction(new EventHandler() {
            @Override
            public void handle(Event t) {
                LocalDate date = dpick.getValue();
                System.err.println("Testing " + date.toString());
                Matcher matcher = pattern.matcher(date.toString());
                System.err.println(matcher.matches());
                
                //parse and clense here
                System.err.println("Selected date: " + date);
                ChosenDate userdate = new ChosenDate(date);
                userdate.showNextDay();
                xmaslabel.setText(userdate.showShoppingDays().toString() + " days left to shop!");
                prevlabel.setText(userdate.showPrevDay().toString());
        
                currentlabel.setText(userdate.showCurrentDay().toString());
                nextlabel.setText(userdate.showNextDay().toString());
                zodiaclabel.setText(userdate.getZodiac());
                daylabel.setText(userdate.showDayOfWeek().toString());
                System.err.println("Trying " + userdate.getZodiac());
                switch (userdate.getZodiac()) {
                    case "Leo":
                        zodiacimage.setImage(new Image(DayChooser.class.getResourceAsStream("leo.jpg")));
                        break;
                    case "Cancer":
                        zodiacimage.setImage(new Image(DayChooser.class.getResourceAsStream("cancer.jpg")));
                        break;
                    case "Taurus":
                        zodiacimage.setImage(new Image(DayChooser.class.getResourceAsStream("taurus.jpg")));
                        break;
                    case "Libra":
                        zodiacimage.setImage(new Image(DayChooser.class.getResourceAsStream("libra.jpg")));
                        break;   
                    case "Scorpio":
                        zodiacimage.setImage(new Image(DayChooser.class.getResourceAsStream("scorpio.jpg")));
                        break;
                    case "Aries":
                        zodiacimage.setImage(new Image(DayChooser.class.getResourceAsStream("aries.jpg")));
                        break; 
                    case "Sagittarius":
                        zodiacimage.setImage(new Image(DayChooser.class.getResourceAsStream("sagittarius.jpg")));
                        break;
                    case "Capricorn":
                        zodiacimage.setImage(new Image(DayChooser.class.getResourceAsStream("capricorn.jpg")));
                        break;
                    case "Aquarius":
                        zodiacimage.setImage(new Image(DayChooser.class.getResourceAsStream("aquarius.jpg")));
                        break;   
                    case "Gemini":
                        zodiacimage.setImage(new Image(DayChooser.class.getResourceAsStream("gemini.jpg")));
                        break;
                    case "Virgo":
                        zodiacimage.setImage(new Image(DayChooser.class.getResourceAsStream("virgo.jpg")));
                        break; 
                    case "Pisces":
                        zodiacimage.setImage(new Image(DayChooser.class.getResourceAsStream("pisces.jpg")));
                        break;
                    
                        
                }
                
           
            }
        });
        
        dpick.setOnKeyPressed(new EventHandler() {
            @Override
            public void handle(Event t) {
                LocalDate date = dpick.getValue();
                System.err.println("Testing " + date.toString());
                Matcher matcher = pattern.matcher(date.toString());
                System.err.println(matcher.matches());
                
                //parse and clense here
                System.err.println("Selected date: " + date);
                ChosenDate userdate = new ChosenDate(date);
                userdate.showNextDay();
                xmaslabel.setText(userdate.showShoppingDays().toString() + " days left to shop!");
                prevlabel.setText(userdate.showPrevDay().toString());
        
                currentlabel.setText(userdate.showCurrentDay().toString());
                nextlabel.setText(userdate.showNextDay().toString());
                zodiaclabel.setText(userdate.getZodiac());
                daylabel.setText(userdate.showDayOfWeek().toString());
                System.err.println("Trying " + userdate.getZodiac());
                switch (userdate.getZodiac()) {
                    case "Leo":
                        zodiacimage.setImage(new Image(DayChooser.class.getResourceAsStream("leo.jpg")));
                        break;
                    case "Cancer":
                        zodiacimage.setImage(new Image(DayChooser.class.getResourceAsStream("cancer.jpg")));
                        break;
                    case "Taurus":
                        zodiacimage.setImage(new Image(DayChooser.class.getResourceAsStream("taurus.jpg")));
                        break;
                    case "Libra":
                        zodiacimage.setImage(new Image(DayChooser.class.getResourceAsStream("libra.jpg")));
                        break;   
                    case "Scorpio":
                        zodiacimage.setImage(new Image(DayChooser.class.getResourceAsStream("scorpio.jpg")));
                        break;
                    case "Aries":
                        zodiacimage.setImage(new Image(DayChooser.class.getResourceAsStream("aries.jpg")));
                        break; 
                    case "Sagittarius":
                        zodiacimage.setImage(new Image(DayChooser.class.getResourceAsStream("sagittarius.jpg")));
                        break;
                    case "Capricorn":
                        zodiacimage.setImage(new Image(DayChooser.class.getResourceAsStream("capricorn.jpg")));
                        break;
                    case "Aquarius":
                        zodiacimage.setImage(new Image(DayChooser.class.getResourceAsStream("aquarius.jpg")));
                        break;   
                    case "Gemini":
                        zodiacimage.setImage(new Image(DayChooser.class.getResourceAsStream("gemini.jpg")));
                        break;
                    case "Virgo":
                        zodiacimage.setImage(new Image(DayChooser.class.getResourceAsStream("virgo.jpg")));
                        break; 
                    case "Pisces":
                        zodiacimage.setImage(new Image(DayChooser.class.getResourceAsStream("pisces.jpg")));
                        break;
                }
                
                
            }
        });
 
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        //root.setGridLinesVisible(true);
        
        GridPane.setRowIndex(picklabel, 0);
        GridPane.setColumnIndex(picklabel, 2);
        GridPane.setHalignment(picklabel, HPos.CENTER);
        root.getChildren().add(picklabel);
        
        GridPane.setRowIndex(dpick, 1);
        GridPane.setColumnIndex(dpick, 2);
        GridPane.setHalignment(dpick, HPos.CENTER);
        root.getChildren().add(dpick);
  
        GridPane.setRowIndex(xmaslabel, 5);
        GridPane.setColumnIndex(xmaslabel, 2);
        GridPane.setHalignment(xmaslabel, HPos.CENTER);
        root.getChildren().add(xmaslabel);
        
        GridPane.setRowIndex(prevlabel, 2);
        GridPane.setColumnIndex(prevlabel, 1);
        root.getChildren().add(prevlabel);
        
        GridPane.setRowIndex(currentlabel, 2);
        GridPane.setColumnIndex(currentlabel, 2);
        GridPane.setHalignment(currentlabel, HPos.CENTER);
        root.getChildren().add(currentlabel);
        
        GridPane.setRowIndex(nextlabel, 2);
        GridPane.setColumnIndex(nextlabel, 3);
        root.getChildren().add(nextlabel);
        
        GridPane.setRowIndex(zodiaclabel, 6);
        GridPane.setColumnIndex(zodiaclabel, 2);
        GridPane.setHalignment(zodiaclabel, HPos.CENTER);
        root.getChildren().add(zodiaclabel);
        
        GridPane.setRowIndex(zodiacimage, 7);
        GridPane.setColumnIndex(zodiacimage, 2);
        GridPane.setHalignment(zodiacimage, HPos.CENTER);
        root.getChildren().add(zodiacimage);
        
        GridPane.setRowIndex(daylabel, 4);
        GridPane.setColumnIndex(daylabel, 2);
        GridPane.setHalignment(daylabel, HPos.CENTER);
        root.getChildren().add(daylabel);
        
        Scene scene = new Scene(root, 500, 350);

       //add background
        scene.getStylesheets().add
                (DayChooser.class.getResource("daychooser.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
