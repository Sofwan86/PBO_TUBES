/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes.database;



import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import tubes.impl.tubesdaoiml;
import tubes.service.tubesdao;

/**
 *
 * @author HP
 */
public class tubesdatabase {
    
    private static Connection connection;
    private static tubesdao paketdao;
    
    public static Connection getConnection() throws SQLException{
        
        if (connection==null){
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://localhost:3306/tubes");
        dataSource.setUser("root");
        dataSource.setPassword("");
        connection =  (Connection) dataSource.getConnection();
        }
       
        return connection;
    }
    
    public static tubesdao gettubesdao() throws SQLException{
        if(paketdao==null){
            paketdao = new tubesdaoiml(getConnection());
        }
        return paketdao;
    }

}
