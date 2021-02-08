package guifraccionclase;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class Controlador{
    Fraccion f1, f2, f3;
    VistaFraccion vf1;
    
    public Controlador(){
        vf1 = new VistaFraccion();
        
        vf1.sumar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            
            }
        });
        vf1.sumar.addActionListener(new ObjetoEscuchaSumar());
        vf1.limpiar.addActionListener(new ObjetoEscuchaLimpiar());
    }
    
    public class ObjetoEscuchaSumar implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String n1, n2, n3, d1, d2, d3;
            int n, d;
            
            try{
                n1 = vf1.n1.getText();
                d1 = vf1.d1.getText();
                n2 = vf1.n2.getText();
                d2 = vf1.d2.getText();

                n = Integer.parseInt(n1);
                d = Integer.parseInt(d1);
                Fraccion f1 = new Fraccion(n,d);
                n = Integer.parseInt(n2);
                d = Integer.parseInt(d2);
                Fraccion f2 = new Fraccion(n,d);
                Fraccion f3 = f1.dividir(f2);

                n3 = f3.getNum()+"";
                d3 = f3.getDen()+"";

                vf1.n3.setText(n3);
                vf1.d3.setText(d3);
            }
            catch(ArithmeticException e1){
                JOptionPane.showMessageDialog(null, e1.getMessage(), "Error", JOptionPane.PLAIN_MESSAGE);
                limpiarCajasTexto();
            }
            catch(NumberFormatException e2){
                JOptionPane.showMessageDialog(null, "Usted debe proporcionar valores numéricos en las cajas de texto.", "Error", JOptionPane.PLAIN_MESSAGE);
            }
        }
        
    }
    public void limpiarCajasTexto(){
        vf1.n1.setText("");
        vf1.d1.setText("");
        vf1.n2.setText("");
        vf1.d2.setText("");
        vf1.n3.setText("");
        vf1.d3.setText("");
    }
    public class ObjetoEscuchaLimpiar implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            limpiarCajasTexto();
        }
    }
}
