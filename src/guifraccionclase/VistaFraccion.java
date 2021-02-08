package guifraccionclase;
import java.awt.*;
import javax.swing.*;


public final class VistaFraccion extends JFrame{
    JTextField n1;
    JTextField d1;
    JTextField n2;
    JTextField d2;
    JTextField n3;
    JTextField d3;
    JButton sumar;
    JButton limpiar;
    JPanel f1, f2, f3;
    JPanel superior, inferior;
    
    
    public VistaFraccion(){
        //Etiquetas de texto
        n1 = new JTextField("",3);
        d1 = new JTextField("",3);
        n2 = new JTextField("",3);
        d2 = new JTextField("",3);
        n3 = new JTextField("",3);
        d3 = new JTextField("",3);
        //Botones
        sumar = new JButton("Calcular");
        limpiar = new JButton("Limpiar");
        //Paneles
        f1 = new JPanel();
        f2 = new JPanel();
        f3 = new JPanel();
        superior = new JPanel();
        inferior = new JPanel();
        
        setDiseño();
        addComponentes();
        setComponentes();
        setVentana();
        
        
    }
    public void setComponentes(){
        n3.setEditable(false);
        d3.setEditable(false);
        n1.setHorizontalAlignment(JTextField.CENTER);
        n2.setHorizontalAlignment(JTextField.CENTER);
        n3.setHorizontalAlignment(JTextField.CENTER);
        d1.setHorizontalAlignment(JTextField.CENTER);
        d2.setHorizontalAlignment(JTextField.CENTER);
        d3.setHorizontalAlignment(JTextField.CENTER);
    }
    public void setDiseño(){
        f1.setLayout(new GridLayout(2,1));
        f2.setLayout(new GridLayout(2,1));
        f3.setLayout(new GridLayout(2,1));
        superior.setLayout(new FlowLayout());
        inferior.setLayout(new GridLayout(1,2));
        this.setLayout(new BorderLayout());
    }
    public void addComponentes(){
        f1.add(n1);
        f1.add(d1);
        f2.add(n2);
        f2.add(d2);
        f3.add(n3);
        f3.add(d3);
        superior.add(f1);
        superior.add(new JLabel(" / "));
        superior.add(f2);
        superior.add(new JLabel(" = "));
        superior.add(f3);
        inferior.add(sumar);
        inferior.add(limpiar);
        this.add(superior,BorderLayout.NORTH);
        this.add(inferior,BorderLayout.SOUTH);
    }
    public void setVentana(){
        this.setVisible(true);
        this.setTitle("Suma de fracciones");
        this.setSize(200, 120);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
}
