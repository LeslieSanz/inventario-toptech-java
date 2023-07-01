/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package misInterfaces;

import java.util.ArrayList;


public interface CRUD<T> {
    public boolean agregar(T c);
    public boolean eliminar(String codigo);
    public boolean modificar(T c);
    public ArrayList<T> listarTodos();
    public T listarUno(String codigo);
}
