/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectfury_launcher;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

/**
 *
 * @author Alexander
 */
public class LoginController implements Initializable {
    
    
    
    @FXML
    Pane p_minimenu;
    
    
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
    private void bp_Login(ActionEvent event)
    {
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        OpenLoginRegister();
    }
    
    
}
