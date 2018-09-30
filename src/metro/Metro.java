/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metro;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author MO CODER
 */
public class Metro extends Application {
    
    @Override
    public void start(Stage primaryStage) {
      BorderPane border=new BorderPane();//For All the Scene
      border.autosize();
      final TilePane temp=new TilePane();
      temp.autosize();
       temp.setPadding(new Insets(200));
      temp.setStyle("-fx-background-image:url(Image/transparent.jpg);");
      
      //Enabling Background Changing
      temp.setOnMouseClicked(new EventHandler<MouseEvent>(){

          @Override
          public void handle(MouseEvent event) {
             if(event.isSecondaryButtonDown()){
                 //Show the Menu 
                 //The Allow User to Select the Backgroud Pic
                 //The Apply the Change
                 //Store the Picture directory
                //temp.setStyle("-fx-background-image:url("picture Directory");");
             }
          }
      
      
      
      
      
      
      
      });
      
      
      
      
      
      
       String[] iconname=new String[]{
            "word-128.png",
            "flying_stork_with_bundle-128.png",
            "mouse-128.png",
            "firefox-128.png",
            "notebook-128.png",
            "firefox-128.png",
            "publisher-128.png",
            "mouse-128.png",
            "mouse-128.png",
            "flying_stork_with_bundle-128.png",
            "notebook-128.png",
            "firefox-128.png",
        "firefox-128.png",
            "mouse-128.png",
            "mouse-128.png",
            "flying_stork_with_bundle-128.png",
            "notebook-128.png",
            "firefox-128.png"};
       String[] text=new String[]{
           "Microsoft Word",
           "Mozilar",
           "Office",
           "Tweet",
          "Facebook",
          "Firefox",
          "Publisher",
          "Mozilar",
          "Office",
           "Tweet",
          "Facebook",
       "Firefox",
       "Chrome",
          "Mozilar",
          "Office",
           "Tweet",
          "Facebook",
       "Firefox"};
       
       
       //Colors for Tiles
      String[] colors=new String[]{
          "-fx-background-color:Green;",
           "-fx-background-color:Teal;",
           "-fx-background-color:Purple;",
           "-fx-background-color:Blue;",
           "-fx-background-color:orange;",
           "-fx-background-color:Teal;",
           "-fx-background-color:Green;",
           "-fx-background-color:magenta;",
           "-fx-background-color:Purple;",
           "-fx-background-color:lime;",
           "-fx-background-color:orange;",
           "-fx-background-color:Teal;",
          "-fx-background-color:Green;",
           "-fx-background-color:magenta;",
           "-fx-background-color:Purple;",
           "-fx-background-color:lime;",
           "-fx-background-color:orange;",
           "-fx-background-color:Teal;"};
      
      //Application name To be Opned
      final String[] appName={
          "C:\\Program Files\\Microsoft Office\\Office15\\WINWORD.exe",
          "C:\\Program Files\\Microsoft Office\\Office15\\POWERPNT.exe",
          "C:\\Program Files\\Microsoft Office\\Office15\\VISIO.exe",
          "C:\\Program Files\\Microsoft Office\\Office15\\OUTLOOK.exe",
          "C:\\Program Files\\Microsoft Office\\Office15\\GROOVE.exe",
          "C:\\Program Files\\Microsoft Office\\Office15\\MSACCESS.exe",
          "C:\\Program Files\\Microsoft Office\\Office15\\MSPUB.exe",
          "C:\\Program Files\\Microsoft Office\\Office15\\EXCEL.exe",
          "C:\\Program Files\\NetBeans 8.0.1\\bin\\netbeans64.exe",
          "C:\\Program Files\\Tracker Software\\PDF Viewer\\PDFXCview.exe",
          "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe",
          "C:\\Program Files\\VideoLAN\\VLC\\vlc.exe",
          "C:\\Program Files\\Microsoft Office\\Office15\\MSPUB.exe",
          "C:\\Program Files\\Microsoft Office\\Office15\\EXCEL.exe",
          "C:\\Program Files\\NetBeans 8.0.1\\bin\\netbeans64.exe",
          "C:\\Program Files\\Tracker Software\\PDF Viewer\\PDFXCview.exe",
          "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe",
          "C:\\Program Files\\VideoLAN\\VLC\\vlc.exe"
      };
     //Manuva
       for(int i=0;i<iconname.length;i++){
           //final Text text_value=new Text(text[i]);
           final StackPane tile=new StackPane();
          
           final Rectangle rect=new Rectangle(150,150);
                 rect.setSmooth(true);
                 
           final VBox vbox=new VBox();//to Tile
           final VBox vbox_vbox=new VBox();
                //Getting the User Data
           vbox_vbox.setUserData(appName[i]);
           vbox_vbox.setAlignment(Pos.CENTER);
           
           final Label text_value=new Label(text[i]);
           text_value.setStyle("-fx-text-fill:white;");
           text_value.setLayoutY(20);
          //vbox.setStyle("-fx-background-color:Lime;");
          vbox_vbox.setStyle(colors[i]);
           
           final ImageView icon=new ImageView(new Image("Icons/"+iconname[i]));
           vbox_vbox.getChildren().addAll(icon,text_value);
           tile.getChildren().addAll(rect,vbox_vbox);
           VBox.setMargin(tile, new Insets(2));
           vbox.getChildren().addAll(tile);
           
           //border.getChildren().addAll(icon,text_value);
           //border.getChildren().add(icon);
           
           vbox_vbox.setOnMouseEntered(new EventHandler<MouseEvent>(){

               @Override
               public void handle(MouseEvent event) {
                   vbox_vbox.setOpacity(0.3);
               }
           
           
           
           });
            vbox_vbox.setOnMouseExited(new EventHandler<MouseEvent>(){

               @Override
               public void handle(MouseEvent event) {
                   vbox_vbox.setOpacity(1);
               }
           
           
           
           });
            
            //Changing the tile color of the Vbox
            vbox_vbox.setOnMousePressed(new EventHandler<MouseEvent>(){

               @Override
               public void handle(MouseEvent event) {
                   //Creating the Contextmenu Object
                   Circle crc=new Circle(5,5,5);
                   crc.setFill(Color.RED);
                   ContextMenu contextmenu=new ContextMenu();
                   MenuItem mnitemred=new MenuItem("Red",crc);
                    //Event fot this 
                        mnitemred.setOnAction(new EventHandler<ActionEvent>(){

                       @Override
                       public void handle(ActionEvent event) {
                           //Change the Color of the Selected Vbox_Vbox
                           vbox_vbox.setStyle("-fx-background-color:Red;");
                       }});
                    Circle crcblue=new Circle(5,5,5);
                   crcblue.setFill(Color.BLUE);
                   MenuItem mnitemblue=new MenuItem("Blue",crcblue);
                    //Event for this
                        mnitemblue.setOnAction(new EventHandler<ActionEvent>(){

                       @Override
                       public void handle(ActionEvent event) {
                           //Change the Color of the Selected Vbox_Vbox
                           vbox_vbox.setStyle("-fx-background-color:Blue;");
                       }});
                        Circle crcgreen=new Circle(5,5,5);
                   crcgreen.setFill(Color.GREEN);
                   MenuItem mnitemgreen=new MenuItem("Green",crcgreen);
                        //EVent for this Menu
                            mnitemgreen.setOnAction(new EventHandler<ActionEvent>(){

                       @Override
                       public void handle(ActionEvent event) {
                           //Change the Color of the Selected Vbox_Vbox
                           vbox_vbox.setStyle("-fx-background-color:Green;");
                       }});
                   //Create a Menu Item
                 //Adding the Menu to the Context Menu
                     contextmenu.getItems().addAll(mnitemgreen,mnitemblue,mnitemred);
                   
                     vbox_vbox.addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>(){

                       @Override
                       public void handle(MouseEvent event) {
                           if(event.getButton()==MouseButton.SECONDARY){
                           
                               contextmenu.show(vbox_vbox,event.getSceneX(),event.getSceneY());
                           }
                       }
                     
                     
                     
                     });
                     
                     
                   
               }
            
            
            });
            //Trying to Opne Another App
            
            vbox_vbox.setOnMouseClicked(new EventHandler<MouseEvent>(){

               @Override
               public void handle(MouseEvent event) {
                  
                  
                  //Checking whihc Mose Button CLicked
                  
                        if(event.getButton()==MouseButton.PRIMARY){
                        
                        try{
                             Runtime runtime=Runtime.getRuntime();
                            Process process=runtime.exec(vbox_vbox.getUserData().toString());
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        
                        
                        }
               }
            
            
            
            });
           
           
           
           
           temp.getChildren().addAll(vbox);
           //border.getChildren().add(temp,);
       }
       
       
       //Manuva
       border.setCenter(temp);//Adding Content to the Center
     // border.setTop(sytesmDetails());
        Scene scene = new Scene(border, 465, 310);
        primaryStage.setTitle("DashBoard");
        primaryStage.setMaximized(true);
        primaryStage.getIcons().add(new Image("Icons/Start Alt.png"));
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
  
  //HBOX for Showing User Deatils
    
    //Getting User Name
    //User Account Image
    //WIndowss Version
    //Computer Name
    //Bits
    //Ram Size
    //Processor Info
    public HBox sytesmDetails(){
    HBox tempLocal=new HBox();
        String osName=System.getProperty("os.name");
        String osVersion=System.getProperty("os.version");
        String userName=System.getProperty("user.name");
        //Image for Accout Picture
        ImageView accountPic=new ImageView(new Image("Icons/flying_stork_with_bundle-128.png"));
        
        //Vertical Box For OS Details
        VBox osDetails=new VBox();
        Label dispOsName=new Label("Operating Sytem: " + osName);
        Label dispOsVer=new Label("Operating System Vertion:" +osVersion);
        Label dispUserName=new Label("User Name: " + userName); 
        //Adding the Two Label to Veticsl Box
        osDetails.getChildren().addAll(dispUserName,dispOsName,dispOsVer);
        
        //Adding to the Horizontal Box
        tempLocal.getChildren().addAll(accountPic,osDetails);
        tempLocal.setStyle("-fx-background-image:url(Image/fabulousgirl.jpg);");
        tempLocal.setAlignment(Pos.TOP_RIGHT);
    return tempLocal;
    }
    
}
