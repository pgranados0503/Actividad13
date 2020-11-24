
package actividad13java;
import java.util.*;

public class Actividad13Java {
  
    static List <String> nombres = new ArrayList<>();
    
    
    public static void main(String[] args) {
 
    claseAnonima claseA = new claseAnonima(){
       
            @Override
            public void lengthOrder(List<String> lista){
                lista.sort((String o1, String o2) -> {
                int result;
                if (o1.length()>o2.length()){
                    result = 1;
                } else if (o1.length()<o2.length()){
                    result = -1;
                } else {
                    result = 0;
                }
                return result;
                });
            }
     
            @Override
            public void alphOrder(List<String>lista){
                lista.sort((String s1, String s2) -> s1.compareTo(s2));
            }
        };      
         

        nombres.add("Paul");
        nombres.add("Francisco");
        nombres.add("Granados");
        nombres.add("Ojeda");
        nombres.add("Ana");
        nombres.add("Patricia");
        nombres.add("Flores");
        nombres.add("Moreno");
        nombres.add("Joel");
        nombres.add("Antonio");  
        
   
    System.out.println("Nombres: " + nombres);
    

    sortList lengthOrder = Actividad13Java::lengthOrder;
    sortList alphOrder = Actividad13Java::alphOrder;
    

    System.out.println("Nombres por Longitud: ");
    

    claseA.lengthOrder(nombres);
    System.out.println("Clase Anonima");
    System.out.println(nombres);
        

    nombres.sort(Comparator.comparingInt(String::length));
    System.out.println("Lamba: ");
    System.out.println(nombres);
    

    lengthOrder.sort(nombres);
    System.out.println("Metodo de Referencia: ");
    System.out.println(nombres);


    System.out.println("Nombres por Alfabeto");
    

    claseA.alphOrder(nombres);
    System.out.println("Clase Anonima");
    System.out.println(nombres);
    

    nombres.sort((String s1, String s2) -> s1.compareTo(s2));
    System.out.println("Lamba: ");
    System.out.println(nombres);
    

    alphOrder.sort(nombres);
        System.out.println("Metodo de Referencia: ");
    System.out.println(nombres);
        
    }
    
        public static void lengthOrder(List<String> nombres){
        nombres.sort((String o1, String o2) -> {
            int result;
            if (o1.length()>o2.length()){
                result = 1;
            } else if (o1.length()<o2.length()){
                result = -1;
            } else {
                result = 0;
            }
            return result;
        });
    }
        

    public static void alphOrder(List<String>nombres){
        nombres.sort((String s1, String s2) -> s1.compareTo(s2));
    }
    

    interface sortList {
        void sort(List<String> listaNom);
    }
    

    interface claseAnonima{

        public void lengthOrder(List<String> nombres);
        public void alphOrder(List<String>nombres);
    }
    
}
