/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectfury_launcher;

import java.io.IOException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Alexander
 */
public class LoginController implements Initializable {
    
Connection conn=null;
PreparedStatement pst=null;
ResultSet rs=null;
        /*
    
       So Siridutt this is the code file.
       This @FXML is annonation i hope i wrote it correct
       u need this if u want controll over  some elements in the
       code. If u add ,we say a Textfield, then u must go 
       under code on the right in the sidebar (make sure u select the element) and must look for
       fx:id and there u write a id for the object. And if u done this
       u get a warning but this is not interessted maybe u will understand
       what it say. So now u must go in this file and wirte:
    
         @FXML
          TextField (and as name u must use what u have typed in fx:id);

         So u can use the TextField now.
         
         And this work with all other things in Scene Builder.
         
         
    
    Also u must declare if u add a button the Action.
    How do u do this? U can look the button i have already created.
    Remember: If u need something here , u must go in the Scene Builder 
    sidebar under coding.
    
    So u Login Method u must wirte here in this file!
    
    
    
    This File is like a Controller for the fxml File.
    The Programm starts in the ProjectFury_Launcher.java
    
    The Button Action for the Login button is: bp_Login
    
    Goodluck if u have any problems
    ask me :D
    
    */
    
    
    
    @FXML
    Pane p_minimenu;
    
    Secruity secure = new Secruity();
    
    //All Buttons
    @FXML
    Button btn_SignIn;
    @FXML
    Button btn_SignUp;
    @FXML
    Button btn_Back;
    @FXML
    Button btn_Login;
    
    //Textfields
    @FXML
    TextField tf_email;
   
    //Passwordfields
    @FXML
    PasswordField pf_password;
    
    //Labels
    @FXML
    Label l_email;
    @FXML
    Label l_password;
    
    
    //Pictures
    
    
    private void OpenLoginRegister()
    {
        p_minimenu.setVisible(true);
        btn_SignIn.setVisible(true);
        btn_SignUp.setVisible(true);
        HideLogin();
        HideRegister();
    }
    
    private void OpenLogin()
    {
        tf_email.setVisible(true);
        pf_password.setVisible(true);
        btn_Login.setVisible(true);
        l_email.setVisible(true);
        l_password.setVisible(true);
        btn_Back.setVisible(true);
    }
    
    private void HideLoginRegister()
    {
        btn_SignIn.setVisible(false);
        btn_SignUp.setVisible(false);
    }
    
    private void HideLogin()
    {
        tf_email.setVisible(false);
        pf_password.setVisible(false);
        btn_Login.setVisible(false);
        l_email.setVisible(false);
        l_password.setVisible(false);
        btn_Back.setVisible(false);
    }
    
    private void HideRegister()
    {
        
    }

    
   @FXML 
    private void bp_SignIn(ActionEvent event)
    {
        HideLoginRegister();
        OpenLogin();
    }
    
    @FXML
    private void bp_SignUp(ActionEvent event)
    {
        
        
    }
    
    @FXML
    private void bp_Back(ActionEvent event)
    {
        
        HideLogin();
        HideRegister();
        OpenLoginRegister();
    }
    
    @FXML
    private void bp_Login(ActionEvent event) throws IOException, KeyManagementException, NoSuchAlgorithmException
    {
         if(secure.SendLogin(tf_email.getText(), pf_password.getText()) == true)
         {
             
         }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        OpenLoginRegister();
    }
    
    
}
