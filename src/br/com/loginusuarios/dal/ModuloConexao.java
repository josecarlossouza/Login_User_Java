/**
 *
 * @author Ze
 */

package br.com.loginusuarios.dal;


import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Ze
 */
public class ModuloConexao {

       
        
    public static Connection conector() {
        
        java.sql.Connection conexao = null;
        
        String DRIVER = "org.hsqldb.jdbcDriver";
         String URL = "jdbc:hsqldb:file://C:/Netbeans Projects/LoginUsuarios/Base_de_Dados/DB_User;hsqldb.lock_file=false";
        String USER = "SA";
        String PASS = "";
        
   

        //DriverManager.getConnection("jdbc:hsqldb:file:C:\\Netbeans Projects\\LoginUsuarios\\Base_de_Dados\\DB_User", "SA", "");

        try {
            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(URL, USER, PASS);
           // System.out.println("Conectou José! ");
            return conexao;
        } catch (ClassNotFoundException | SQLException e) {
            //throw new RuntimeException("Erro na Conexão José", e);
            System.out.println("Erro na conexão José: "+e);
            return null;
        }

    }
    
    public static void close_Conection(Connection con){
        if(con!=null){
            try{
            con.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Conexão com o Banco não Encerrada!!! = "+e);
            }
        }
        
    }
    
    public static void close_Conection(Connection con, PreparedStatement pst){
        if(pst!=null){
            try{
            pst.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Conexão com o Banco não Encerrada!!! = "+e);
            }
        }
        close_Conection(con);
        
    }
    
    public static void close_Conection(Connection con, PreparedStatement pst, ResultSet rs){
        if(rs!=null){
            try{
            rs.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Conexão com o Banco não Encerrada!!! = "+e);
            }
        }
        close_Conection(con, pst);
    }
    
}


