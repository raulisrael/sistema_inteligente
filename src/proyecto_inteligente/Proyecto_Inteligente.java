
package proyecto_inteligente;

import java.io.IOException;
import java.util.Scanner;
import org.jpl7.*;

public class Proyecto_Inteligente {
   
    public static void main(String[] args) throws IOException {
    Scanner entrada = new Scanner(System.in);
    String t1 = "consult('computador.pl')";//aqui colocan el nombre de su archivo a compilar
    Query q1 = new Query(t1);
    System.out.println(t1 + " " + (q1.hasSolution() ? "verdadero" : "fallo")); //mostrara
    
    int opcion =1;
    System.out.println("¿desea realizar una consulta?");
    System.out.println("1. Si"
            + "\n2. no");
    opcion = entrada.nextInt();
    
    if(opcion== 1){
    do{
        System.out.println("Seleccione una opcion: "
                            + "\n1.Detectar errores de harware."
                            + "\n2.corregir problemas software y hardware"
                            + "\n3.Prevenir problemas perdida de informacion"
                            + "\n4.Sugerencia de buenas marcss"
                            + "\n5.Detectar sintomas de virus");
        int opc = entrada.nextInt();
        if(opc==1){
            System.out.println("Seleccione una opcion para indicarle como detectar el problema"
                            + "\n1.Error en el refresco de la memoria RAM."
                            + "\n2.Error en el circuito de partida"
                            + "\n3.Error en el controlador delteclado"
                            + "\n4.Error en la memoria cache"
                            + "\n5.Detectar sobrecalentamiento"
                            + "\n6.Selecciona esta opcion para escribir manualmente lo que hace tu pc!!");
        String pro="";
        int opc2 = entrada.nextInt();
        if(opc2>0&&opc2<6){
        switch(opc2){
            case 1: pro = "error_en_el_refresco_de_la_ram";
            break;
            case 2: pro ="error_en_el_circuito_de_partida";
            break;
            case 3: pro ="error_en_el_controlador_del_teclado";
            break;
            case 4: pro = "error_en_la_memoria_cache";
            break;
            case 5: pro = "detectar_sobrecalentamiento";
            break;
        }    
        
        String convertir;//
        String problema1 = "problema_de(Y,"+pro.toLowerCase()+")";
        Query q3 = new Query(problema1);
        convertir = q3.oneSolution().get("Y").toString();
        System.err.println("puedes detectar este problema con: " +convertir.replaceAll("_", " "));
        }
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////77
        if(opc==2){
        System.out.println("Seleccione una opcion para indicarle como coregir el problema"
                            + "\n1.mi computadora se sobrecalienta."
                            + "\n2.No me reconoce el puerto UBS y los iconos de pantalla estan grandes"
                            + "\n3.mi sistema operstivo no arranca"
                            
                            );
        String pro="";
        int opc2 = entrada.nextInt();
        if(opc2>0&&opc2<5){
        switch(opc2){
            case 1: pro = "sobrecalentamiento";
            break;
            case 2: pro ="drivers_desactualizados";
            break;
            case 3: pro ="fallas_de_sistema_operativo";
            break;
                    }
        }
        
        String convertir;//
        String problema1 = "solucion_de("+pro.toLowerCase()+",Y)";
        Query q3 = new Query(problema1);
        convertir = q3.oneSolution().get("Y").toString();
        System.err.println("puedes corregir este problema con: " +convertir.replaceAll("_", " "));
        }
        
        if(opc==3){
        System.out.println("Seleccione una opcion para indicarle como prevenir los siguientes problemas"
                            + "\n1. Fallas de sistema operativo."
                            + "\n2. Quitar archivos_basura"
                            + "\n3. Perdida_de_informacion"
                            + "\n4. Infeccion por virus"
                            
                            );
        String pro="";
        int opc2 = entrada.nextInt();
        if(opc2>0&&opc2<5){
        switch(opc2){
            case 1: pro = "fallas_de_sistema_operativo";
            break;
            case 2: pro ="archivos_basura";
            break;
            case 3: pro ="perdida_de_informacion";
            break;
            case 4: pro = "virus";
            break;
            }
        String convertir;//
        String problema1 = "como_prevenir("+pro.toLowerCase()+",Y)";
        Query q3 = new Query(problema1);
        convertir = q3.oneSolution().get("Y").toString();
        System.err.println("puedes evitar este problema con: " +convertir.replaceAll("_", " "));
        }
        }
        
         if(opc==4){
        System.out.println("Seleccione una opcion para indicarle si es una marca de PC recomendable"
                            + "\n1. HP."
                            + "\n2. Acer"
                            + "\n3. Asus"
                            + "\n4. Dell"
                            + "\n5. Lenovo"
                            + "\n6. Samsumg"
                            + "\n7. Lanix"
                            );
        String pro="";
        int opc2 = entrada.nextInt();
        if(opc2>0&&opc2<8){
        switch(opc2){
            case 1: pro = "hp";
            break;
            case 2: pro ="acer";
            break;
            case 3: pro ="asus";
            break;
            case 4: pro = "dell";
            break;
            case 5: pro = "lenovo";
            break;
            case 6: pro = "samsung";
            break;
            case 7: pro = "lanix";
            break;
            }
        String convertir;//
        String problema1 = "es_recomendable_marca("+pro.toLowerCase()+",Y)";
        Query q3 = new Query(problema1);
        convertir = q3.oneSolution().get("Y").toString();
        System.err.println("Hemos recopilado lo siguiente: " +convertir.replaceAll("_", " "));
        }
        }
         //
        if(opc==5){
        
        String pro = "virus";
        String convertir;//
        String problema1 = "detectar_virus("+pro.toLowerCase()+",Y)";
        Query q3 = new Query(problema1);
        convertir = q3.oneSolution().get("Y").toString();
        System.err.println("Sabra si tiene virus si: " + convertir.replaceAll("_", " ")+" PREVENCION: actualizando_antivirus_o_instalar_uno");
        }
        
        //empieza el if
        
        System.out.println(" ");   
  System.out.println("Desea realizar otra consulta\n1. Si\n2. no");
  opcion = entrada.nextInt();
    }while(opcion!=2);
    
    }
    
    }
    
}
