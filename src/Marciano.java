/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos Gochez
 */
public class Marciano {
    private String nombre;
    private static int contador;

    static{
        contador = 0;
        System.out.println("La guerra ha Iniciado");
    }

    static{
        System.out.println("Marte esta lista");
    }

    public Marciano(String n){
        nombre = n;
        contador++;
    }

    public static int getContador(){
        return contador;
    }

    public void Atacar(){
         
        if( contador >= 5 ){
            System.out.println("Yo " + nombre +
                    " Estoy" +
                    " listo para Atacar!! junto con mis " +
                    contador + " hermanos marcianos");
        }
        else{
            System.out.println("No Puedo Atacar Aun solo tenemos " +
                    contador + " hermanos marcianos enlistados, atte " + nombre);
        }
    }
}
