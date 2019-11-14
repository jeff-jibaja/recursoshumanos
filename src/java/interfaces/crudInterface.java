/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;

/**
 *
 * @author jeff
 */
public interface crudInterface {
    
    public boolean insert(Object obj[]);
    
    public boolean delet(int id);
    
    public boolean update(Object obj[]);
    
    public ArrayList<Object> listar(int id);
    
    public ArrayList<Object> listar();
}
