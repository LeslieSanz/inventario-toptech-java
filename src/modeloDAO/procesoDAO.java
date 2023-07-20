/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloDAO;
import config.Conexion;
import java.util.ArrayList;
import misInterfaces.ProcesoInterface;
import modelo.ProcesoDTO;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Entrada;
import modelo.ProductoDTO;
import modelo.Salida;

public class procesoDAO implements ProcesoInterface{
    Connection conn;
    Conexion con = new Conexion();
    ProcesoDTO proce;
    ProductoDTO p;
    productoDAO pd = new productoDAO();
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<ProcesoDTO> lista = new ArrayList<>(); 

    @Override
    public boolean agregar(ProcesoDTO proce, String tipo) { //El tipo puede ser Entrada o Salida
        try {
            String sql = "insert into proceso (tipo_proce, cod_pro, fec_proce, cant_solicitada,cant_recibida, estado)"
                    + " values (?, ?, ?, ?, ?, ?)";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            //No se incluye el codigo del proceso, porque en la base de datos se incrementa automaticamente
            ps.setString(1, tipo);            
            ps.setString(2, proce.getProducto().getCod());
            ps.setString(3, proce.getFecha());
            ps.setInt(4, proce.getCantidad_solicitada());
            
            /*En caso el proceso se una instancia de Entrada,
            se hace hace un casting para obtener la cantidad recibida
            porque cantidad_recibida solo existe en Entrada*/
            if (proce instanceof Entrada) {
            Entrada e = (Entrada) proce;
            ps.setInt(5, e.getCantidad_recibida());
        } else {
            /* Manejar el caso en que proceso no sea una instancia de Entrada
            (es decir, que sea una Salida), estableceremos la cantidad como 0*/
            ps.setInt(5, 0);
        }
            ps.setString(6, proce.getEstadoConfirmacion());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(procesoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean eliminar(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean modificar(ProcesoDTO c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<ProcesoDTO> listarTodos(String tipo) {
        try {
            String sql = "select * from proceso where tipo_proce='"+tipo+"'";            
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                proce = new ProcesoDTO();
                switch (tipo){
                case "E":
                        proce = new Entrada();
                        ((Entrada) proce).setCantidad_recibida(rs.getInt("cant_recibida"));
                break;
                case "S":  
                        proce = new Salida();
                break;
                }
                //Seteando los atributos comunes de las clases Entrada y Salida
                //Para el producto
                String cp = rs.getString("cod_pro");
                p= pd.listarUno(cp);
                proce.setProducto(p);
                proce.setFecha(rs.getString("fec_proce"));
                proce.setCantidad_solicitada(rs.getInt("cant_solicitada"));
                proce.setEstadoConfirmacion(rs.getString("estado"));
                lista.add(proce);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;         
    }

    @Override
    public ProcesoDTO listarUno(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }  
    
}
