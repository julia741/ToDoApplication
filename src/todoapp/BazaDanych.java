package todoapp;

import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;



/**
 *
 * @author julia
 */public class BazaDanych {
    

  
public void baza(String Title, String Description, String FinishDate){
        try {
            //zaladowanie sterownika
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //ustanowienie polaczenia
            Connection polaczenie=DriverManager.getConnection(
            "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=Tasks",
                    "user","Khj2j784");
            //przygotowanie zapytania
            Statement skladnia=polaczenie.createStatement();
            ResultSet rezultat=skladnia.executeQuery("SELECT * from Task");
            Task task;
            while(rezultat.next())
                task=new Task (rezultat.getString("Title"),
            rezultat.getString("Description"),
            rezultat.getString("FinishDate"));
            polaczenie.close();
    }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,
                    "Błąd"+e.getMessage(),
                    "Błąd połaczenia",
                    JOptionPane.ERROR_MESSAGE
            );
            
        }

    
    }
     
    public void zapis(String Title, String Description, String FinishDate) {
        try {
            //zaladowanie sterownika
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //ustanowienie polaczenia
            Connection polaczenie=DriverManager.getConnection(
            "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=Tasks",
                    "user","Khj2j784");
            //przygotowanie zapytania
            Statement skladnia=polaczenie.createStatement();
            skladnia.addBatch("INSERT INTO Task(Title,Description,Finishdate) VALUES(\'"+Title+"\',\'"
                    +Description+"\',"+FinishDate+")");
            skladnia.executeBatch();
            JOptionPane.showMessageDialog(null,"zapisano dane","Tasks",
                    JOptionPane.INFORMATION_MESSAGE);
            polaczenie.close();
    }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,
                    "Błąd"+e.getMessage(),
                    "Błąd połaczenia",
                    JOptionPane.ERROR_MESSAGE
            );
                    }
    }
    
      
        

 }
       

    
    
         
 
       
         
         
 
    
 
    
            
        
    
    

    
    

    
    

