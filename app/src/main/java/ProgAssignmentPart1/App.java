/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ProgAssignmentPart1;
import javax.swing.*;

public class App {

    public static void main(String[] args) {
   
     
   //Declaring
     SwingUtilities.invokeLater(() -> { 
     String Name = JOptionPane.showInputDialog("Enter name");
     String Surname = JOptionPane.showInputDialog("Surname");
     String Username = JOptionPane.showInputDialog("Enter Username"); 
     String password;
     
     //If Username is or not succesful
         int num =0;
         int length = Username.length();
    if (length<6 && length>4)
                 {
                  num = 1;
                 }
    if ( Username.matches("(?=.*[_].*)"))
    {
        num =2;
    }
         else
        
         {
          num =3;               
           } 
         
         boolean Num = (num + num)=3;
         Num = (Num?"Username successfully captured":"Username must be 5 character long" + "contain Underscore (_)") 
         JOptionPane.showMessageDialog(null,Num); 
         
         
         //Password 
         password = JOptionPane.showInputDialog("Enter Password");
         int score = 0;
         int lengths = password.length ();    
         if (lengths>=8 && lengths<=10)               
         {
             score +=1;
         }      
         if (password.matches("(?=.*[a-z].*)"))
         {
             score +=2;
         }
         if (password.matches("(?= .*[A-Z].*)"))
         {
             score +=3;
         }
         if (password.matches("(?= .*[0-9].*)"))
         {
             score++;
         }
         if (password.matches("(?= .*[!@#$%^&*].*)"))
         {
             score++;
         }
     
     boolean checkusercomplexity=(score) >= score++;
                         
      String message = "Name: "+ Name + "\n" + "Surname: " +Surname + "\n" +
              "checkcusercomplexity:" + "\n" + (checkusercomplexity? "Password Succesfully captured": """
                                             Must conatin at least 8 characters 
                                             Contain a capital letter
                                             Contain a Number
                                             Contain a Special Character
                                             """);
      
      
      JOptionPane.showMessageDialog(null,message);
         
                 
}); 