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
    Proveedor p;
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<Proveedor> lista = new ArrayList<>(); 

    @Override
    public boolean agregar(Proveedor p) {
         try {
            String sql = "insert into proveedor (cod_prov, nom_prov,telf_prov,dir_prov)"
                    + " values (?, ?, ?, ?)";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, p.getCodigoprov());
            ps.setString(2, p.getNombreprov());
            ps.setInt(3, p.getTelefono());
            ps.setString(4, p.getDireccion());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(proveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean eliminar(String codigo) {
        try {
            String sql = "delete from proveedor where cod_prov = '"+codigo+"'";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(proveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean modificar(Proveedor p) {
        try {
            String sql = "update proveedor set cod_prov=?, nom_prov=?, telf_prov=?, dir_prov=?"
                    + " where cod_prov = '"+p.getCodigoprov()+"'";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, p.getCodigoprov());
            ps.setString(2, p.getNombreprov());
            ps.setInt(3, p.getTelefono());
            ps.setString(4, p.getDireccion());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(proveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;    }

    @Override
    public ArrayList<Proveedor> listarTodos() {
        try {
            String sql = "select * from proveedor";            
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                p = new Proveedor();
                p.setCodigoprov(rs.getString("cod_prov"));
                p.setNombreprov(rs.getString("nom_prov"));
                p.setTelefono(rs.getInt("telf_prov"));
                p.setDireccion(rs.getString("dir_prov"));
                lista.add(p);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(proveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    @Override
    public Proveedor listarUno(String codigo) {
        try {
            String sql = "select * from proveedor where cod_prov = '"+codigo+"'";            
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                p = new Proveedor();
                p.setCodigoprov(rs.getString("cod_prov"));
                p.setNombreprov(rs.getString("nom_prov"));
                p.setTelefono(rs.getInt("telf_prov"));
                p.setDireccion(rs.getString("dir_prov"));
             }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(proveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
        
    }
}
