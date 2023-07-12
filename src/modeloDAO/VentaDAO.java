/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloDAO;
import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import misInterfaces.VentaInterface;
import modelo.Venta;

public class VentaDAO implements VentaInterface{
    Connection conn;
    Conexion con = new Conexion();
    Venta v;
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<Venta> listaDetalle = new ArrayList<>(); 

    @Override
    public boolean agregar(Venta v) {
try {
            String sql = "insert into venta (cod_ven,fec_ven,subtot_ven, igv_ven,tot_ven)"
                    + " values (?, ?, ?, ?, ?)";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, v.getCodigo());
            ps.setString(2, v.getFecha());
            ps.setDouble(3, v.getTotalN());
            ps.setDouble(4, v.getImpuestoIGV());
            ps.setDouble(5, v.getTotalN());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(VentaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;    }

    @Override
    public boolean eliminar(String codigo) {
        try {
            String sql = "delete from venta where cod_pro = "+codigo;
            conn = con.getConexion();
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(VentaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;    }

    @Override
    public boolean modificar(Venta v) {
        try {
            String sql = "update venta set cod_ven=?, can_pro=?,"
                    + " sub_pro=?"
                    + " where cod_ven = "+v.getCodigo();
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, v.getCodigo());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(VentaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;    }

    @Override
    public ArrayList<Venta> listarTodos() {
        try {
            String sql = "select * from venta";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
               /* v = new DetalleDTO();
                v.setCodigoVenta(rs.getString("cod_ven"));
                dd.setCantidad(rs.getInt("can_pro"));
                dd.setImporte(rs.getDouble("sub_total"));
                //p.setStock(rs.getInt("stcpro"));
                String cc = rs.getString("cod_cat");
                c= cd.listarUno(cc);
                listaDetalle.add(dd);*/
            }
        } catch (SQLException ex) {
            Logger.getLogger(DetalleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaDetalle;
    }

    @Override
    public Venta listarUno(String codigo) {
try {
            String sql = "select * from producto";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
           while(rs.next()){
                /*dd.setCodigoVenta(rs.getString("cod_ven"));
                dd.setCantidad(rs.getInt("can_pro"));
                dd.setImporte(rs.getDouble("sub-total"));
                String cc = rs.getString("codpro");
                c = cd.listarUno(cc);*/
            }
        } catch (SQLException ex) {
            Logger.getLogger(DetalleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v;    
    }

    @Override
    public String leerCodVenta() {
        String ultimoCodigoVenta = null;
    try {
        String sql = "SELECT MAX(cod_ven) AS ultimo_codigo FROM venta";
        conn = con.getConexion();
        st = conn.createStatement();
        rs = st.executeQuery(sql);
        if (rs.next()) {
            ultimoCodigoVenta = rs.getString("ultimo_codigo");
        }
    } catch (SQLException ex) {
        Logger.getLogger(VentaDAO.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        // Cierra los recursos (ResultSet, Statement, Connection) en un bloque finally
        // para asegurarte de que se liberen adecuadamente.
        try {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    return ultimoCodigoVenta;
    }

    @Override
    public boolean escribirCodVenta(String codigo) {
         try {
        String sql = "INSERT INTO venta (cod_ven) VALUES (?)";
        conn = con.getConexion();
        ps = conn.prepareStatement(sql);
        ps.setString(1, codigo);
        ps.executeUpdate();
        return true;
    } catch (SQLException ex) {
        Logger.getLogger(VentaDAO.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        // Cierra los recursos (PreparedStatement, Connection) en un bloque finally
        // para asegurarte de que se liberen adecuadamente.
        try {
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    return false;
    }    

     
}


    

