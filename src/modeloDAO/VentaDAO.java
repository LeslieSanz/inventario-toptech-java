/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloDAO;
import config.Conexion;
import java.sql.CallableStatement;
import java.util.List;
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
            ps.setDouble(5, v.getTotalB());
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
            }
        } catch (SQLException ex) {
            Logger.getLogger(DetalleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v;    
    }

    @Override
    public String leerCodVenta() {
        String ultimoCodVen = null;
    try {
        String sql = "SELECT MAX(cod_ven) AS ult_cod FROM venta";
        conn = con.getConexion();
        st = conn.createStatement();
        rs = st.executeQuery(sql);
        if (rs.next()) {
            ultimoCodVen = rs.getString("ult_cod");
        }
    } catch (SQLException ex) {
        Logger.getLogger(VentaDAO.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
     
        // para asegurarte de que se liberen
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
    return ultimoCodVen;
    }
  
      public List<Venta> lisMes(int an){
   List<Venta> lis=new ArrayList();
   conn=con.getConexion();
   String sql="{call sp_reporteanual(?)}";   
   try{
     CallableStatement st=conn.prepareCall(sql);
     st.setInt(1, an);
     ResultSet rs = st.executeQuery();
     
     while(rs.next()){
        Venta v=new Venta();
        v.setMes(rs.getInt(1));
        v.setCantidad(rs.getInt(2));
        v.setTotal(rs.getInt(3));       
        lis.add(v);
     }
   }catch(Exception ex){
     ex.printStackTrace();
   }   
  return lis;    
  } 
    
    public List<Venta> lisDia(int mes, int an) {
    List<Venta> lis = new ArrayList();
    conn = con.getConexion();
    String sql = "{call sp_reportemmensual(?, ?)}";
    try {
        CallableStatement st = conn.prepareCall(sql);
        st.setInt(1, mes);
        st.setInt(2, an);
        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            Venta v = new Venta(); 
            v.setDia(rs.getInt(1)); // Modificar para obtener el día en lugar del mes
            v.setCantidad(rs.getInt(2));
            v.setTotal(rs.getInt(3));
            lis.add(v);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return lis;
}
}


    

