// Una clase DosGen simple con dos parámetros de tipo:
// T y V.

class ClaseGenerica<T, V>{
    // Usa dos parámetros de tipo
    T ob1; //Declara un objeto de tipo T
    V ob2; //Declara un objeto de tipo V

    //Pase al constructor una referencia a un objeto de tipo T y V.
    public ClaseGenerica(T o1, V o2){
        ob1=o1;
        ob2=o2;
    }

    public T getOb1(){
        return ob1;
    }

    public V getOb2(){
        return ob2;
    }

    //Muestra el tipo de T y V
    void mostrarTipo(){
        System.out.println("El tipo de T es: "+ob1.getClass().getName());
        System.out.println("El tipo de V es: "+ob2.getClass().getName());
    }
}

//Demostración de clase DosGen
class Ejemplo2 {
    public static void main(String[] args) {

       ClaseGenerica<Integer,String> dosGen= new ClaseGenerica<Integer, String>(28,"Genericos");

       //Mostrar los tipos
        dosGen.mostrarTipo();

        //Obtener y mostrar los valores
        int v=dosGen.getOb1();
        System.out.println("Valor: "+v);

        String str=dosGen.getOb2();
        System.out.println("Valor: "+str);
    }
}