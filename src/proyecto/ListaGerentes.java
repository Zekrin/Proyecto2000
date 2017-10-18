/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author Zekro
 */
public class ListaGerentes {
    private ArrayList<Gerente> listaGerentes;
    
    public ListaGerentes(){
         listaGerentes = new ArrayList<>();
    }
    public int obtenerTamañoListaGerente(){
        return listaGerentes.size();
    }
    
    public void agregarGerente(Gerente obj){
        listaGerentes.add(obj);
    }
    public Gerente crearGerente(String Nombre, String Rut, String Sueldo){
    	Gerente nuevo = new Gerente();
    	nuevo.setName(Nombre);
    	nuevo.setRut(Rut);
    	nuevo.setSueldo(Integer.parseInt(Sueldo));
    	return nuevo;
    }
    public Gerente buscarGerente(String rut) {
    	ListIterator<Gerente> itr=listaGerentes.listIterator();
        while (itr.hasNext()) {
            Gerente aux = itr.next();
            if(aux.getRut().equals(rut)) {
            	return aux;
            }
        }
    	return null;
    }
    public Gerente eliminarGerente(String rut){
        ListIterator<Gerente> itr=listaGerentes.listIterator();
        while (itr.hasNext()) {
            Gerente aux = itr.next();
            if(aux.getRut().equals(rut)) {
                itr.remove();
            	return aux;
            }
        }
    	return null;
    }
    public ArrayList listaParaCombobox(){
        ArrayList<String> array = new ArrayList<String>();
        ListIterator<Gerente> itr=listaGerentes.listIterator();
        while (itr.hasNext()) {
            Gerente aux = itr.next();
            if(aux.getTiendaACargo()== null){
                System.out.println(""+aux.getTiendaACargo());
                array.add(aux.getRut());
            } 
        }
        if(array.size()<1)return null;
        
        return array;
    }
}