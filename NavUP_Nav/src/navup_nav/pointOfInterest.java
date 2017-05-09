/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package navup_nav;

/**
 *
 * @author User
 */

import java.sql.*;
import java.lang.Exception;

public class pointOfInterest {
    

    public  Statement stmt;
    
        public void savePoint(Connection conn, String lat, String lng){
            
            try{
               stmt = conn.createStatement();
               
               String sql = "INSERT INTO pointofinterest" +
                   " VALUES(" + lat + "," + lng + ")";
            }
            catch(Exception e){
                System.out.print(e.toString());
            }
            
        }
    
}
