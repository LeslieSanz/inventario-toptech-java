/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package misInterfaces;

import java.util.ArrayList;
import modelo.ProcesoDTO;

public interface ProcesoInterface{
    public boolean agregar(ProcesoDTO c,String tipo);
    public boolean eliminar(String codigo);
    public boolean modificar(ProcesoDTO c);
    public ArrayList<ProcesoDTO> listarTodos(String tipo);
    public ProcesoDTO listarUno(String codigo);
    
}
