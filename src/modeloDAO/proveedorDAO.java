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
import misInterfaces.ProveedorInterface;
import modelo.Proveedor;

/**
 *
 * @author user
 */
public class proveedorDAO implements  ProveedorInterface{
    Connection conn;
    Conexion con = new Conexion();
    Proveedor prov;
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<Proveedor> lista = new ArrayList<>(); 

    @Override
    public boolean agregar(Proveedor prov) {
         try {
            String sql = "insert into proveedor (cod_prov, nom_prov,telf_prov,dir_prov)"
                    + " values (?, ?, ?, ?)";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, prov.getCodigoprov());
            ps.setString(2, prov.getNombreprov());
            ps.setInt(3, prov.getTelefono());
            ps.setString(4, prov.getDireccion());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(proveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean eliminar(String codigo) {
        try {
            String sql = "delete from provedor where cod_prov = "+codigo;
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean modificar(Proveedor c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Proveedor> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Proveedor listarUno(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
