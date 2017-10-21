/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectfury_launcher;

import java.io.*;
import javax.net.ssl.*;
import java.security.*;
import javax.swing.JOptionPane;


/**
 *
 * @author anebl
 */
public class Secruity {
    
    static private String Identification;
    static private String[] PersonalInformation;
    
    boolean SendLogin(String Email, String PW) throws IOException, KeyManagementException, NoSuchAlgorithmException
    {
        try{
           SSLSocketFactory factory =
                (SSLSocketFactory)SSLSocketFactory.getDefault();
            SSLSocket socket =
                (SSLSocket)factory.createSocket("launcher.projectfury.net", 443);
            socket.startHandshake();
             PrintWriter out = new PrintWriter(
                                  new BufferedWriter(
                                  new OutputStreamWriter(
                                  socket.getOutputStream())));

            out.println("GET https://launcher.projectfury.net/apis/launcher/login.php?email=" + Email + "&password=" + PW );
            out.println();
            out.flush();
            
            if (out.checkError())
                System.out.println(
                    "SSLSocketClient:  java.io.PrintWriter error");
              
                          /* read response */
            BufferedReader in = new BufferedReader(
                                    new InputStreamReader(
                                    socket.getInputStream()));
            
            if(in.readLine() != null)
            {
                if(!in.readLine().equals("0"))
                {
                    Identification = in.readLine();
                    socket.close();
                    GetAccountInformation();
                    return true;
                }
                else{
                    socket.close();
                    return false;
                }
            }
             else{
                   socket.close();
                    return false;
                }
            
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        
        return false;
    
    }
    
    
    boolean GetAccountInformation ()
    {
        if(Identification.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Error: 0001", "Error cant be get Account information if u are not logged", JOptionPane.ERROR);
            return false;
        }
        
         try{
           SSLSocketFactory factory =
                (SSLSocketFactory)SSLSocketFactory.getDefault();
            SSLSocket socket =
                (SSLSocket)factory.createSocket("launcher.projectfury.net", 443);
            socket.startHandshake();
             PrintWriter out = new PrintWriter(
                                  new BufferedWriter(
                                  new OutputStreamWriter(
                                  socket.getOutputStream())));

            out.println("GET https://launcher.projectfury.net/apis/launcher/userdatamain.php?auth=" + Identification);
            out.println();
            out.flush();
            
            if (out.checkError())
                System.out.println(
                    "SSLSocketClient:  java.io.PrintWriter error. Cant load Account informations");
              
                          /* read response */
            BufferedReader in = new BufferedReader(
                                    new InputStreamReader(
                                    socket.getInputStream()));
            
             System.err.println(in.readLine());
            
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        
        
        
        
        return false;
    }
}
