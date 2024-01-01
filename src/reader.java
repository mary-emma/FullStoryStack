
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mary-emmabarnhill
 */
public class reader {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    public static String reader;
    
    public reader() {
        conn = databaseConnection.connection();
    }
        
    public String getReader() {
        return this.reader;   
    }
    
    public void setReader(String newReader) {
        this.reader = newReader;
    }
}
