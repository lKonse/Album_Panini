
package ipc1.proyecto2_201700584;


public class NodoUsuarios {
    Object cui, nombre, correo, usuario, contraseña, valor;
	NodoUsuarios enlace;
	
	public NodoUsuarios(Object cui, Object nombre, Object correo, Object user, Object contra) {
		this.cui = cui;
		this.nombre = nombre;
		this.correo = correo;
		this.usuario = user;
		this.contraseña = contra;
                
		enlace = null;
	}
	
	public void enlazar(NodoUsuarios n) {
		enlace = n;
	}
	
	public Object obtenerValor(String p) {
		
		switch(p) {
		case "cui":
			valor = cui;
			break;
		case "nombre":
			valor = nombre;
			break;
		case "correo":
			valor = correo;
			break;
		case "usuario":
			valor = usuario;
			break;
		case "contraseña":
			valor = contraseña;
			break;
		default:
			break;
		}
		
		return valor;
			
	}
	
	public NodoUsuarios obtenerSiguiente() {
		return enlace;
	}
}

//Nodo Equipos

class NodoEquipos{
    Object codigo, nombre, mundiales;
    NodoEquipos enlaceS, enlaceA;
    Object valor;
    
    public NodoEquipos(Object codigo, Object nombre, Object mundiales){
        this.codigo = codigo;
        this.nombre = nombre;
        this.mundiales = mundiales;
        
        enlaceS = null;
        enlaceA = null;
    }
    
    public void enlazarSiguiente(NodoEquipos n){
        enlaceS = n;
    }
    
    public void enlazarAnterior(NodoEquipos n){
        enlaceA = n;
    }
    
    public Object obtenerValor(String p){
        switch(p){
            
            case "codigo":
                valor = codigo;
                break;
                
            case "nombre":
            valor = nombre;
            break;

            case "mundiales":
            valor = mundiales;
            break;
        }
        return valor;
    }
    
    public NodoEquipos obtenerSiguiente(){
            return enlaceS;
    }
    
    public NodoEquipos obtenerAnterior(){
            return enlaceA;
    }
}

//Nodo jugadores----------------------------------------------------------------------------------------------
class NodoJugadores{
    Object IDequipo, NombreJugador, NumeroCamisola, Posicion, TitularoBanca, valor;
    NodoJugadores enlaceS, enlaceA;
    NodoEquipos enlaceEquipo;
    
    public NodoJugadores(Object ID, Object nombre, Object numero, Object posicion, Object titularobanca){
        IDequipo = ID;
        NombreJugador = nombre;
        NumeroCamisola = numero;
        Posicion = posicion;
        TitularoBanca = titularobanca;
        
        enlaceS = null;
        enlaceA = null;
        enlaceEquipo = null;
    }
    
    public void enlazarSiguiente(NodoJugadores n){
        enlaceS = n;
    }
    
    public void enlazarAnterior(NodoJugadores n){
        enlaceA = n;
    }
    public void enlazarEquipo(NodoEquipos n){
        enlaceEquipo = n;
    }
    
    public Object obtenerValor(String p){
        switch(p){
            
            case "IDequipo":
                valor = IDequipo;
                break;
                
            case "nombre":
                valor = NombreJugador;
                break;

            case "numero":
                valor = NumeroCamisola;
                break;
                
            case "posicion":
                valor = Posicion;
                break;
                
            case "titular":
                valor = TitularoBanca;
                break;
        }
        return valor;
    }
    
    public NodoJugadores obtenerSiguiente(){
        return enlaceS;
    }
    
    public NodoJugadores obtenerAnterior(){
        return enlaceA;
    }
    
    public NodoEquipos obtenerEquipo(){
        return enlaceEquipo;
    }
}

class NodoEstampas{
    Object NombreJugador, NombreEquipo, Rareza, RutaImagen, valor;
    NodoEstampas enlaceS, enlaceA;
    
    public NodoEstampas(Object nombre, Object equipo, Object rareza, Object ruta){

        NombreJugador = nombre;
        NombreEquipo = equipo;
        Rareza = rareza;
        RutaImagen = ruta;
        
        enlaceS = null;
        enlaceA = null;
    }
    
    public void enlazarSiguiente(NodoEstampas n){
        enlaceS = n;
    }
    
    public void enlazarAnterior(NodoEstampas n){
        enlaceA = n;
    }
    
    public Object obtenerValor(String p){
        switch(p){
                
            case "nombre":
                valor = NombreJugador;
                break;

            case "equipo":
                valor = NombreEquipo;
                break;
                
            case "rareza":
                valor = Rareza;
                break;
                
            case "ruta":
                valor = RutaImagen;
                break;
        }
        return valor;
    }
    
    public NodoEstampas obtenerSiguiente(){
        return enlaceS;
    }
    
    public NodoEstampas obtenerAnterior(){
        return enlaceA;
    }
}
