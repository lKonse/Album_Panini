
package ipc1.proyecto2_201700584;

import javax.swing.JOptionPane;


public class ListaUsuarios {
    static int tamaño;
	static NodoUsuarios primero, valor;
	
	public ListaUsuarios() {
		
	}
	
	public Boolean estaVacia() {
		if(primero == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void añadirUsuario(Object cui, Object nombre, Object correo, Object user, Object contra) {
		if(primero == null) {
			primero = new NodoUsuarios(cui, nombre, correo, user, contra);
		}
		else {
			NodoUsuarios aux = primero;
			NodoUsuarios nuevo = new NodoUsuarios(cui, nombre, correo, user, contra);
			nuevo.enlazar(aux);
			primero = nuevo;
		}
		tamaño++;
	}
        
        public void eliminarUsuario(int indice){
            int contador = 0;
            NodoUsuarios temp = primero;
            
            if(indice == 0){
                primero = primero.obtenerSiguiente();
            }else if(indice == obtenerTamaño()-1){
                while(contador < indice-1){
                    temp = temp.obtenerSiguiente();
                    contador++;
                }
                temp.enlazar(null);
            }
            else{
                while(contador < indice-1){
                temp = temp.obtenerSiguiente();
                contador++;
                }
                temp.enlazar(temp.obtenerSiguiente().obtenerSiguiente());
            }
            tamaño--;
        }
	
	public Object Obtener(int indice, String p) {
		int contador = 0;
		NodoUsuarios temp = primero;
		
		while(contador < indice) {
			temp = temp.obtenerSiguiente();
			contador++;
		}
		return temp.obtenerValor(p);
	}
	
	public int obtenerTamaño() {
		return tamaño;
	}
}

//Lista Equipos

class ListaEquipos{
    static int tamaño;
    static NodoEquipos primero;
    
    public void añadirEquipo(Object codigo, Object nombre, Object mundiales){
        if(tamaño == 0){
            primero = new NodoEquipos(codigo, nombre, mundiales);
        }else{
            NodoEquipos aux = primero;
            NodoEquipos nuevo = new NodoEquipos(codigo, nombre, mundiales);
            nuevo.enlazarSiguiente(aux);
            primero = nuevo;
            aux.enlazarAnterior(primero);
        }
        tamaño++;
    }
    
    public void eliminarEquipo(int indice){
        int contador = 0;
        NodoEquipos temp = primero;

        if(indice == 0){
            primero = primero.obtenerSiguiente();
            primero.enlazarAnterior(null);
            
        }else if(indice == obtenerTamaño()-1){
            while(contador < indice-1){
                temp = temp.obtenerSiguiente();
                contador++;
            }
            temp.enlazarSiguiente(null);
        }
        else{
            while(contador < indice-1){
            temp = temp.obtenerSiguiente();
            contador++;
            }
            NodoEquipos aux = temp.obtenerSiguiente().obtenerSiguiente();
            temp.enlazarSiguiente(aux);
            aux.enlazarAnterior(temp);
        }
        tamaño--;
    }
    
    public Object Obtener(int indice, String p) {
        int contador = 0;
        NodoEquipos temp = primero;

        while(contador < indice) {
                temp = temp.obtenerSiguiente();
                contador++;
        }
        return temp.obtenerValor(p);
    }

    public int obtenerTamaño() {
        return tamaño;
    }
    
    //    public Object obtenerA(int indice, String p){
//        int contador = obtenerTamaño();
//        NodoEquipos temp = primero.obtenerSiguiente().obtenerSiguiente().obtenerSiguiente();
//
//        while(contador > indice) {
//                temp = temp.obtenerAnterior();
//                contador--;
//        }
//        return temp.obtenerValor(p);
//    }
}

//Lista jugadores--------------------------------------------------------------------------------------------------
class ListaJugadores{
    
    static int tamaño;
    int a = 0;
    static NodoJugadores primero;
    static ListaEquipos equipo = new ListaEquipos();
    
    public void añadirJugador(Object ID, Object nombre, Object numero, Object posicion, Object titularobanca){
        for(int n = 0; n < equipo.obtenerTamaño(); n++){
            if(ID.equals(equipo.Obtener(n, "codigo"))){
                if(tamaño == 0){
                    primero = new NodoJugadores(ID, nombre, numero, posicion, titularobanca);
                }else{
                    NodoJugadores aux = primero;
                    NodoJugadores nuevo = new NodoJugadores(ID, nombre, numero, posicion, titularobanca);
                    nuevo.enlazarSiguiente(aux);
                    primero = nuevo;
                    aux.enlazarAnterior(primero);
                }
                a++;
                tamaño++;
            }
        }
        if(a == 0){
            JOptionPane.showMessageDialog(null, "No existe ningun equipo con ese ID", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void eliminarJugador(int indice){
        int contador = 0;
        NodoJugadores temp = primero;

        if(indice == 0){
            primero = primero.obtenerSiguiente();
            primero.enlazarAnterior(null);
            
        }else if(indice == obtenerTamaño()-1){
            while(contador < indice-1){
                temp = temp.obtenerSiguiente();
                contador++;
            }
            temp.enlazarSiguiente(null);
        }
        else{
            while(contador < indice-1){
            temp = temp.obtenerSiguiente();
            contador++;
            }
            NodoJugadores aux = temp.obtenerSiguiente().obtenerSiguiente();
            temp.enlazarSiguiente(aux);
            aux.enlazarAnterior(temp);
        }
        tamaño--;
    }
    
    public Object Obtener(int indice, String p) {
        int contador = 0;
        NodoJugadores temp = primero;

        while(contador < indice) {
                temp = temp.obtenerSiguiente();
                contador++;
        }
        return temp.obtenerValor(p);
    }

    public int obtenerTamaño() {
        return tamaño;
    }
    
}

class ListaEstampas{
    static int tamaño;
    static NodoEstampas primero;
    
    public void añadirEstampa(Object nombre, Object equipo, Object rareza, Object ruta){
        if(tamaño == 0){
            primero = new NodoEstampas(nombre, equipo, rareza, ruta);
        }else{
            NodoEstampas aux = primero;
            NodoEstampas nuevo = new NodoEstampas(nombre, equipo, rareza, ruta);
            nuevo.enlazarSiguiente(aux);
            primero = nuevo;
            aux.enlazarAnterior(primero);
        }
        tamaño++;
    }
    
    public void eliminarEquipo(int indice){
        int contador = 0;
        NodoEstampas temp = primero;

        if(indice == 0){
            primero = primero.obtenerSiguiente();
            primero.enlazarAnterior(null);
            
        }else if(indice == obtenerTamaño()-1){
            while(contador < indice-1){
                temp = temp.obtenerSiguiente();
                contador++;
            }
            temp.enlazarSiguiente(null);
        }
        else{
            while(contador < indice-1){
            temp = temp.obtenerSiguiente();
            contador++;
            }
            NodoEstampas aux = temp.obtenerSiguiente().obtenerSiguiente();
            temp.enlazarSiguiente(aux);
            aux.enlazarAnterior(temp);
        }
        tamaño--;
    }
    
    public int obtenerTamaño() {
        return tamaño;
    }
}
