
class Pareja<T,V extends T>{
    //Aquí, V debe ser algún tipo como T o una subclase de T
    T primero;
    V segundo;
    Pareja(T a, V b){
        primero=a;
        segundo=b;
    }
    void mostrarTipo(){
        System.out.println("El tipo de T es: "+primero.getClass().getName());
        System.out.println("El tipo de V es: "+segundo.getClass().getName());
    }

}
public class Ejemplo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pareja<Integer, Integer> twin = new Pareja<Integer, Integer>(23,10);
		twin.mostrarTipo();
		
		Pareja<String, String> obDos = new Pareja<String, String> ("cadena1", "Cadena2");
		obDos.mostrarTipo();
		
	}

}
