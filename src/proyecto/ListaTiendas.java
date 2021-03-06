/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Zekro
 */
public class ListaTiendas implements Serializable{
    private ArrayList<Tienda> listaTiendas;
    IOrdenarArray Orden;
    
    public ListaTiendas(){
        listaTiendas = new ArrayList();
    }
    public void setOrdenarArray(IOrdenarArray Orden){
      this.Orden=Orden;  
    }
    public void mostrarOrdenado(){
        Orden.OrdenarArrayL(listaTiendas);
    }
    
    /*****SOBRECARGA
     * @param GerenteTienda
     * @param DireccionTienda
     * @param IDTienda
     * @return  ******/
    public Tienda crearTienda(Gerente GerenteTienda, String DireccionTienda, String IDTienda){
        Tienda tienda = new Tienda(IDTienda);
        tienda.setGerente(GerenteTienda);
        tienda.setDirec(DireccionTienda);
        GerenteTienda.setTiendaACargo(IDTienda);
        return tienda;
    }
    public DefaultListModel modelVentana(){
        DefaultListModel<String> mdl = new DefaultListModel<>();
        String element = "No hay tiendas registradas actualmente.";
        if(listaTiendas.size()<1){
            mdl.addElement(element);
            return mdl;
        }
        Tienda aux;
        Gerente worker;
        String name = new String();
        ListIterator<Tienda> itr=listaTiendas.listIterator();        
        while (itr.hasNext()) {
            aux = itr.next();
            worker = aux.getGerente();
            if(worker == null){
                name = "null";
            }else{
                name = worker.getName();
            }
            element = ("[ID: "+aux.getID()+"] - [Gerente: "+name+
                    "] - [Vendedores Registrados: "+aux.obtenerTamañoListaVendedores()+""
                    + "] - [Inventario de la Tienda: "+aux.obtenerTamañoListaArticulos()+"]");
            mdl.addElement(element);
        }
        return mdl;
    }
    public int obtenerTamañoListaTiendas(){
        return listaTiendas.size();
    }
    public void agregarTienda(Tienda TObj){
        listaTiendas.add(TObj);
        
    }
    
    public Tienda buscarTienda(String id) {
    	Tienda auxshop;
    	ListIterator<Tienda> itr=listaTiendas.listIterator();
        while (itr.hasNext()) {
        	auxshop = itr.next();
        	if(auxshop.getID().equals(id)){
        		return auxshop;
        	}
        }
    	
    	return null; 
    }
    public Gerente buscarGerente(String Rut){

        Gerente ger;
        ListIterator<Tienda> itr=listaTiendas.listIterator();
        while(itr.hasNext()){
            ger = itr.next().getGerente();
            if(ger.getRut().equals(Rut)){
                return ger;
            }
            
        }
        return null;
    }
    public boolean eliminarTienda(String IDTienda){
        if(listaTiendas.size()<1){            
            return false;
        }
        Tienda aux;
    	ListIterator<Tienda> itr=listaTiendas.listIterator();
        while (itr.hasNext()) {
        	aux = itr.next();
        	if(aux.getID().equals(IDTienda)) {
                    aux.getGerente().setTiendaACargo(null);
                    itr.remove();
                    return true;
                }
        }
        return false;
    }
    public void mostrarTiendasEnArchivo() throws IOException{
        try (FileWriter writer = new FileWriter("TiendasRegistradas.txt")) {
                if(listaTiendas.size()<1){
                    writer.write("No hay tiendas registradas actualemente");
                    writer.close();
                }
                String element;
                Tienda aux;
                Gerente worker;
                ListIterator<Tienda> itr=listaTiendas.listIterator();
                while (itr.hasNext()) {
                    aux = itr.next();
                    worker = aux.getGerente();
                    element = ("[ID: "+aux.getID()+"] - [Gerente: "+worker.getName()+
                            "] - [Trabajadores Registrados: "+aux.obtenerTamañoListaVendedores()+"]"
                            + " - [Inventario de la Tienda: "+aux.obtenerTamañoListaArticulos()+"]\n");
                    writer.write(element);
                }
            writer.close();
        } catch (IOException ex){}
    }
    /*public void guardarTiendas() throws FileNotFoundException, IOException{ 
        Tienda aux;
        ListIterator<Tienda> itr=listaTiendas.listIterator();           
        FileOutputStream fos = new FileOutputStream(new File("Tiendas.txt"));
        try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            while (itr.hasNext()) {
                aux = itr.next();
                oos.writeObject(aux);
                System.out.println(""+aux.getID());
            }
            oos.close();
        }
	fos.close();
    }
    public void cargarTiendas() throws FileNotFoundException, IOException, ClassNotFoundException{
        
        FileInputStream fi = new FileInputStream(new File("Tiendas.txt"));
        
        try(ObjectInputStream oi = new ObjectInputStream(fi)){
            Tienda aux;
            while((aux = (Tienda) oi.readObject()) != null){
                System.out.println(""+aux.getID());
                listaTiendas.add(aux);
            }
        }catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Archivo con datos a cargar no encontrado.");
        }catch (EOFException e) {
            
	}
    }*/
    public int gananciaTotalTiendas(){
           
        int total=0; 
     	Tienda auxshop;
    	ListIterator<Tienda> itr=listaTiendas.listIterator();
        while (itr.hasNext()) {
        	auxshop = itr.next();
                total=total+auxshop.calcularGananciaTienda();
        }
    	
    	return total;     
  
     }
     
    public void calcularPorcentajesDeGanancia(int total){
      
        Tienda auxshop;
    	ListIterator<Tienda> itr=listaTiendas.listIterator();
        while (itr.hasNext()) {
        	auxshop = itr.next();
                auxshop.setPorcentajeGanancia((auxshop.calcularGananciaTienda()*100)/total);
        }
        
        
    } 
    public ArrayList listaParaCombobox(){
        ArrayList<String> array = new ArrayList<>();
        ListIterator<Tienda> itr=listaTiendas.listIterator();
        while (itr.hasNext()) {
            Tienda aux = itr.next();
            array.add(aux.getID());
        }
        if(array.size()<1)return null;
        
        return array;
    }
    public DefaultListModel modelVendedores(String ID){
        Tienda aux = buscarTienda(ID);
        DefaultListModel<String> mdl = aux.modelVentana();        
        return mdl;
    }
    public int agregarVendedor(String nombre, String rut, String sueldo, String IDTienda){
        Tienda aux = buscarTienda(IDTienda);
               
        return aux.añadirVendedor(nombre, rut, sueldo);
    }
    public int eliminarVendedor(String rut,String IDTienda){
        Tienda aux = buscarTienda(IDTienda);
        
        return aux.eliminarVendedor(rut);
    }
    public int modificarVendedor(String nombre, String rut, String sueldo,String rutnuevo, String IDTienda){
        Tienda aux = buscarTienda(IDTienda);
               
        return aux.modificarVendedor(nombre, rut, sueldo,rutnuevo);
    }
    public Tienda obtenerTiendaMayorGanancia(){
        ListIterator<Tienda> itr=listaTiendas.listIterator();
        Tienda mayor=null;
        Tienda aux;
        while (itr.hasNext()) {
            if(mayor==null){
                mayor=itr.next();
            }else{
                aux=itr.next();
                
            if(aux.calcularGananciaTienda()>mayor.calcularGananciaTienda()){
                mayor=aux;
            }
         
        }
     }
     return mayor;
    }
    public int calcularPorcentajesGananciaTotal(){
        ListIterator<Tienda> itr=listaTiendas.listIterator();
        int sum=0;
        Tienda aux;
        while (itr.hasNext()) {
            aux = itr.next();
            sum = aux.calcularGananciaTienda();
        }
        if(sum == 0)return 0;
        
        return (sum/listaTiendas.size());
    }
}
    /*public ArrayList articulosMasVendidos(){
      Tienda auxshop;
     ArrayList<Articulo> articulosMasVendidos;
     articulosMasVendidos=new ArrayList<>();
     Articulo aux;
     Articulo aux1;
     
     ListIterator<Tienda> itr=listaTiendas.listIterator();
    
    
        while (itr.hasNext()) {
        	auxshop = itr.next();
                ArrayList<Articulo> listaArticulosAuxShop;
                //listaArticulosAuxShop=new ArrayList<>();
                listaArticulosAuxShop=auxshop.obtenerArticulos();//duplikar
               
                ListIterator<Articulo> itr3=articulosMasVendidos.listIterator();
                
                ListIterator<Articulo> itr2=listaArticulosAuxShop.listIterator();
                
                while(itr2.hasNext()){
                    aux=itr2.next();
                    
                    if(!itr3.hasNext()){
                        
                    }else{
                            while(itr3.hasNext()){
                                aux1=itr3.next();
                                if(aux1.getCodigo().equals(aux.getCodigo())){
                                    aux1.setVecesVendido(aux1.getVecesVendido()+aux.getVecesVendido());
                                    break;
                                }
                              if(!itr.hasNext()){
                                articulosMasVendidos.add(aux);
                                }  
                            }                        
                    }

                }
        }
        
         ArrayList<Articulo> lista;
     
     
     
     return articulosMasVendidos;
     }*/

