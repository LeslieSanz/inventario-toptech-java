package modeloDAO;

import config.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import misInterfaces.ProductoInterface;
import modelo.CategoriaProducto;
import modelo.ProductoDTO;
import modelo.Proveedor;

public class productoDAO implements ProductoInterface{
    
    Connection conn;
    Conexion con = new Conexion();
    ProductoDTO p;
    CategoriaProducto c;
    CategoriaProductoDAO cd = new CategoriaProductoDAO();
    Proveedor prov;
    proveedorDAO provd = new proveedorDAO();
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<ProductoDTO> lista = new ArrayList<>();  

    @Override
    public boolean agregar(ProductoDTO p) {
        try {
            String sql = "insert into producto (cod_pro, des_pro, cod_cat, pre_pro,cod_prov,stk_pro)"
                    + " values (?, ?, ?, ?, ?,?)";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, p.getCod());
            ps.setString(2, p.getDescripcion());
            ps.setString(3, p.getCategoria().getCodigo());
            ps.setDouble(4, p.getPrecioUnit());
            ps.setString(5, p.getProveedor().getCodigoprov());
            ps.setInt(6, p.getStock());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(productoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean eliminar(String codigo) {
        try {
            String sql = "delete from producto where cod_pro = "+codigo;
            conn = con.getConexion();
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(productoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean modificar(ProductoDTO p) {
        try {
            String sql = "update producto set cod_pro=?, des_pro=?,"
                    + " cod_cat=?, pre_pro=?, cod_prov=?"
                    + " where cod_pro = '"+p.getCod()+"'";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, p.getCod());
            ps.setString(2, p.getDescripcion());
            ps.setString(3, p.getCategoria().getCodigo());
            ps.setDouble(4, p.getPrecioUnit());
            ps.setString(5, p.getProveedor().getCodigoprov());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(productoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public ArrayList<ProductoDTO> listarTodos() {
         try {
            String sql = "select * from producto";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                p = new ProductoDTO();
                p.setCod(rs.getString("cod_pro"));
                p.setDescripcion(rs.getString("des_pro"));
                //Para la categoria
                String cc = rs.getString("cod_cat");
                c= cd.listarUno(cc);
                p.setCategoria(c);
                p.setPrecioUnit(rs.getDouble("pre_pro"));
                //Para el proveedor
                String cp = rs.getString("cod_prov");
                prov= provd.listarUno(cp);
                p.setProveedor(prov);
                p.setStock(rs.getInt("stk_pro"));
                lista.add(p);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(productoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;

    }

    @Override
    public ProductoDTO listarUno(String codigo) {
        try {
            String sql = "select * from producto where cod_pro='"+codigo+"'";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                p = new ProductoDTO();
                p.setCod(rs.getString("cod_pro"));
                p.setDescripcion(rs.getString("des_pro"));
                //Para la categoria
                String cc = rs.getString("cod_cat");
                c= cd.listarUno(cc);
                p.setCategoria(c);
                p.setPrecioUnit(rs.getDouble("pre_pro"));
                //Para el proveedor
                String cp = rs.getString("cod_prov");
                prov= provd.listarUno(cp);
                p.setProveedor(prov);
                p.setStock(rs.getInt("stk_pro"));
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(productoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
   }
    
   public boolean actualizarStock(ProductoDTO p) {
        try {
            String sql = "update producto set stk_pro=?"
                    + " where cod_pro = '"+p.getCod()+"'";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, p.getStock());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(productoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
   
   public String generaCodProducto() {
    String cod="";

    try {
        String sql = "{? = call gen_cod_pro()}";
        conn = con.getConexion();
        CallableStatement st = conn.prepareCall(sql);
        st.registerOutParameter(1, Types.VARCHAR);
        st.execute();
        cod = st.getString(1);

        } catch (SQLException ex) {
        Logger.getLogger(productoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(productoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return cod;
    }
   
   //Lista productos por codigo de categoria
    public ArrayList<ProductoDTO> listaProdxCat(String nomCat){
        try{
            conn = con.getConexion();
            String sql="{call sp_listaProdCat(?)}";
            CallableStatement st=conn.prepareCall(sql);
            st.setString(1, nomCat);
            ResultSet rs=st.executeQuery();

            while(rs.next()){
                p=new ProductoDTO();
                p.setCod(rs.getString(1));
                p.setDescripcion(rs.getString(2));
                p.setPrecioUnit(rs.getDouble(3));
                p.setStock(rs.getInt(4));
                lista.add(p);        
            }
            conn.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return lista;
    } 
    
}
