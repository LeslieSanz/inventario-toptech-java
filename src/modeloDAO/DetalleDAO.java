/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloDAO;

import java.sql.CallableStatement;
import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import misInterfaces.DetalleInterface;
import modelo.CategoriaProducto;
import modelo.DetalleDTO;

/**
 *
 * @author esther
 */
public class DetalleDAO implements DetalleInterface{
    Connection conn;
    Conexion con = new Conexion();
    DetalleDTO dd;
    CategoriaProducto c;
    CategoriaProductoDAO cd;
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<DetalleDTO> listaDetalle = new ArrayList<>(); 

    @Override
    public boolean agregar(DetalleDTO dd) {
try {
            String sql = "insert into detalle (cant_deta,monto_deta,cod_pro,cod_ven)"
                    + " values (?, ?, ?, ?)";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, dd.getCantidad());
            ps.setDouble(2, dd.getImporte());
            ps.setString(3, dd.getProducto().getCod());
            ps.setString(4, dd.getCodigoVenta());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DetalleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;    }

    @Override
    public boolean eliminar(String codigo) {
        try {
            String sql = "delete from detalle where cod_pro = "+codigo;
            conn = con.getConexion();
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DetalleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;    }

    @Override
    public boolean modificar(DetalleDTO dd) {
        try {
            String sql = "update detalle set cod_ven=?, can_pro=?,"
                    + " sub_pro=?"
                    + " where cod_ven = "+dd.getCodigoVenta();
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, dd.getCodigoVenta());
            ps.setInt(2, dd.getCantidad());
            ps.setDouble(3, dd.getImporte());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DetalleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;    }

    @Override
    public ArrayList<DetalleDTO> listarTodos() {
        try {
            String sql = "select * from detalle";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                dd = new DetalleDTO();
                dd.setCodigoVenta(rs.getString("cod_ven"));
                dd.setCantidad(rs.getInt("can_pro"));
                dd.setImporte(rs.getDouble("sub_total"));
                //p.setStock(rs.getInt("stcpro"));
                String cc = rs.getString("cod_cat");
                c= cd.listarUno(cc);
                listaDetalle.add(dd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DetalleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaDetalle;
    }

    @Override
    public DetalleDTO listarUno(String codigo) {
try {
            String sql = "select * from producto";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                dd.setCodigoVenta(rs.getString("cod_ven"));
                dd.setCantidad(rs.getInt("can_pro"));
                dd.setImporte(rs.getDouble("sub-total"));
                String cc = rs.getString("codpro");
                c = cd.listarUno(cc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DetalleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dd;    }
    
    public ArrayList<DetalleDTO> lisFactura(String codven){
   ArrayList<DetalleDTO> lis=new ArrayList();
   conn=con.getConexion();
   String sql="{call sp_MostrarDetalleVenta(?)}";   
   try{
       CallableStatement st=conn.prepareCall(sql);
     st.setString(1, codven);
     ResultSet rs = st.executeQuery();
     
     while(rs.next()){
        DetalleDTO f=new DetalleDTO();
        f.setCodigoVenta(rs.getString(1));
        f.setCantidad(rs.getInt(2));      
        lis.add(f);
     }
   }catch(Exception ex){
     ex.printStackTrace();
   }   
  return lis;    
  } 
}
