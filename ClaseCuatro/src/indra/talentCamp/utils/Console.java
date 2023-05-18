package indra.talentCamp.utils;

import java.util.Scanner;

public class Console {
    private static boolean esNumerico(String numero) {
        try {
            int num = Integer.parseInt(numero);
            //System.out.println("Es un numero");
            return true;
        }catch(Exception e) {
            System.out.println("No es un número");
            return false;
        }
    }
    
    public static int readInt(){
        String numero = null;
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("ingrese un numero");
            numero = in.nextLine();
        }while(!esNumerico(numero));
        
        return Integer.valueOf(numero);
        
    }
    public static int readInt(String prompt){
        String numero = null;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println(prompt);
            numero = in.nextLine();
        }while(!esNumerico(numero));
        
        return Integer.valueOf(numero);
        
    }
    
    public static String readString(String prompt) {
        Scanner in = new Scanner(System.in);
        String entrada = "";
        do {
            System.out.println(prompt);
            entrada = in.nextLine();
            
        }while(entrada.length() == 0);
            
        return entrada;
    }
}
