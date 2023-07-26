
package modeloDAO;

import config.Conexion;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import misInterfaces.UsuarioInterface;
import modelo.Usuario;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.Timer;


public class usuarioDAO implements UsuarioInterface{

    Connection conn;
    Conexion con = new Conexion();
    Usuario u;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    
    
    public Usuario validarLogueo(String usu, String pas, String Tipo) {
        
        try {
            String sql = "Select * from usuarios where nomusu ='" + usu + "' and pasusu = '" + pas + "' and tipo = '" + Tipo + "'";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                u = new Usuario();
                u.setNombreUsuario(rs.getString("nomusu"));
                u.setContraseña(rs.getString("pasusu"));
                u.setNombres(rs.getString("Nombres")); // Obtener el nombre desde la base de datos
            }

            // Validación exitosa, mostrar JDialog con mensaje y barra de carga
            if (u != null) {
                String mensaje = "¡Hola de nuevo " + u.getNombres() + "!";
                JDialog dialog = new JDialog();
                JProgressBar progressBar = new JProgressBar();
                progressBar.setIndeterminate(true); // Barra de carga indeterminada (animada)
                dialog.setLayout(new BorderLayout());
                dialog.add(new JLabel(mensaje), BorderLayout.NORTH);
                dialog.add(progressBar, BorderLayout.CENTER);
                dialog.pack();
                dialog.setLocationRelativeTo(null);
                dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE); // Impide cerrar el diálogo
                dialog.setModal(true); // Hace que el diálogo sea modal (bloquea la interacción con el formulario anterior)

                Timer timer = new Timer(2000, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        dialog.dispose(); // Cierra el diálogo después de 2 segundos
                        // Luego puedes mostrar el siguiente formulario o realizar otras acciones necesarias
                    }
                });
                timer.setRepeats(false);
                timer.start();

                dialog.setVisible(true); // Muestra el diálogo con el mensaje y la barra de carga
            }

        } catch (SQLException ex) {
            Logger.getLogger(usuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return u;
    }
    

    public void registrarUsuario(String usu, String pas, String Tipo, String Nombres) {
        try {
        String sql = "INSERT INTO usuarios (nomusu, pasusu, tipo, Nombres) VALUES (?, ?, ?, ?)";
        conn = con.getConexion();
        ps = conn.prepareStatement(sql);
        ps.setString(1, usu);
        ps.setString(2, pas);
        ps.setString(3, Tipo);
        ps.setString(4,Nombres);
        ps.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(usuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        // Cerrar recursos (Statement, ResultSet, etc.) y la conexión
        try {
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(usuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }}

    
}

