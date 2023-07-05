package excepcion2;

import javax.swing.JOptionPane;

public class Excepcion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int x,y;
        
        
        try{
             x= Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese numero 1", "Solicito datos",3));
             y= Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese numero 2","Solicito datos",3));
             JOptionPane.showMessageDialog(null,"La Divicion de   "+x+"  /  "+y+" es "+(x/y)," Motrando resultado",1);
        }   catch(NumberFormatException n){
             System.out.println(n.getMessage() +"No es numero entero");
        }catch (ArithmeticException a){
             System.out.println(a.getMessage() +"No se puede dividir entre 0");
        }
    }
}
