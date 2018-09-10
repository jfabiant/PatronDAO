package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import oracle.jdbc.*;

public class UsuarioDatos{
    
    Connection con;
    PreparedStatement agregarUsuario, consultarUsuario;
    
    public UsuarioDatos () throws Exception {
        DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
        con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jfabian", "jfabian");
        
        agregarUsuario = con.prepareStatement("insert into usuarios (nombres, email) values (?, ?)");
        consultarUsuario = con.prepareStatement("select nombres, email from usuarios");
        
    }
    
    public void registrarUsuario (Usuario usr) throws Exception {
        agregarUsuario.setString(1, usr.getNombres());
        agregarUsuario.setString(2, usr.getEmail());
        agregarUsuario.executeUpdate();
    }
    
    public List recuperarUsuario () throws Exception {
        List l = new ArrayList();
        ResultSet res = consultarUsuario.executeQuery();
        while (res.next()) {
            Usuario usr = new Usuario ();
            usr.setNombres(res.getString(1));
            usr.setEmail(res.getString(2));
            l.add(usr);
        }
        return l;
    }
    
    public void finalizar() throws Exception {
        con.close();
        agregarUsuario.close();
        consultarUsuario.close();
    }
}
