
package spp.jposadasa.a12;
import java.util.*;
import javax.swing.JOptionPane;
public class SPPJPosadasAA12 {

    public static void main(String[] args) {
        
        double l, w, imc;
        String eIMC;
        boolean flag;
        
        w = pedirDato("peso");
        l = pedirDato("altura");
        
        imc= w / Math.pow (l,2);
         if (imc > 25){
            JOptionPane.showMessageDialog(null, "Usted sufre de sobrepeso. IMC = " + imc);
        }else if(imc<19){
            JOptionPane.showMessageDialog(null, "Usted sufre de desnutricion. IMC = " + imc);
        }else{
            JOptionPane.showMessageDialog(null, "Usted tiene un IMC normal. IMC = " + imc);
        }      
    }
    

public static double pedirDato (String mensaje) {
boolean flag;
double dato = 0;
    do{
        String datoP = JOptionPane.showInputDialog(null, "Introduce tu " + mensaje);
        try{
            dato = Double.parseDouble(datoP);
            flag = false;
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Error, el dato no es un numero");
            flag = true;
        }
        } while (flag);
return dato;
}
}