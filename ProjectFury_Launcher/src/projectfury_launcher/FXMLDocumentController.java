/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectfury_launcher;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/**
 *
 * @author Alexander
 */
public class FXMLDocumentController implements Initializable {
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        engine = wv_main.getEngine();
    }
    
    @FXML
    WebView wv_main;
   
  
   private WebEngine engine;
    
    @FXML
    Button btnClose;
    
    @FXML
    private void bp_Updates(ActionEvent ev)
    {
       if(!wv_main.isVisible())
       {
            wv_main.setVisible(true);
            engine.setJavaScriptEnabled(true);
            engine.load("http://google.de");
            btnClose.setVisible(true);
       }
       else{
            engine.setJavaScriptEnabled(true);
            engine.load("http://google.de");
       }
        
    }
    
    @FXML
    private void bp_Soldier(ActionEvent ev)
    {
       if(!wv_main.isVisible())
       {
            wv_main.setVisible(true);
            engine.setJavaScriptEnabled(true);
            engine.load("http://youtube.de");
            btnClose.setVisible(true);
       }
       else{
            engine.setJavaScriptEnabled(true);
            engine.load("http://youtube.de");
      
       }
    }
    
    @FXML
    private void bp_Play(ActionEvent ev)
    {
        try {
            Runtime.getRuntime().exec("FPSTemplate-Win64-DebugGame.exe");
            System.exit(0);
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    private void bp_Friends(ActionEvent ev)
    {
               if(!wv_main.isVisible())
       {
            wv_main.setVisible(true);
            engine.setJavaScriptEnabled(true);
            engine.load("http://gluonhq.com/products/scene-builder/");
            btnClose.setVisible(true);
       }
       else{
            engine.setJavaScriptEnabled(true);
            engine.load("http://gluonhq.com/products/scene-builder/");
      }
    }
    
    @FXML
    private void bp_Exit(ActionEvent ev)
    {
       System.exit(0);
    }
    @FXML
    private void bp_Donate(ActionEvent ev)
    {
        if(!wv_main.isVisible())
       {
            wv_main.setVisible(true);
            engine.setJavaScriptEnabled(true);
            engine.load("http://docs.oracle.com/javase/8/javafx/get-started-tutorial/jfx-overview.htm#JFXST784");
            btnClose.setVisible(true);
       }
       else{
            engine.setJavaScriptEnabled(true);
            engine.load("http://docs.oracle.com/javase/8/javafx/get-started-tutorial/jfx-overview.htm#JFXST784");
     }
    }
    
    @FXML
    private void bp_Market(ActionEvent ev)
    {
               if(!wv_main.isVisible())
       {
            wv_main.setVisible(true);
            engine.setJavaScriptEnabled(true);
            engine.load("http://trello.com");
            btnClose.setVisible(true);
       }
       else{
            engine.setJavaScriptEnabled(true);
            engine.load("http://trello.com");
     }
    }
    
    @FXML
    private void bp_Close(ActionEvent ev)
    {
        wv_main.setVisible(false);
        btnClose.setVisible(false);
    }
   
    
}
