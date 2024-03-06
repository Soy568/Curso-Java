package descuentoCompras;
import javax.swing.JOptionPane;
public class DescuentoCompras {
    public static void main(String[] args){
        /*
        En megaPlaza se hace un descuento del 20% por compras superiores a los 300$.
        Cual es la cantidad que se debe pagar al final?
        * */
    float entrada,descuento,total;
    entrada=Float.parseFloat(JOptionPane.showInputDialog("Valor de la Compra"));
    if(entrada>300){
        descuento=(float) (entrada*0.20);
        total=entrada-descuento;
        JOptionPane.showMessageDialog(null,"Total a Pagar : "+total);
    }else{
        JOptionPane.showMessageDialog(null,"Sin Descuento");
    }
    }
}

