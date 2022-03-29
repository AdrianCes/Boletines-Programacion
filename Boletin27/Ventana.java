
package boletin26;


import javax.swing.*;
import java.awt.event.*;


public class Ventana implements ActionListener {
    JFrame marco;
    JPanel panel;
    JButton boton1, boton2;
    JLabel et1, et2;
    JTextField txt1, text2;
    JTextArea areaTexto;
    String nome;

    public void iniciar(){
        marco = new JFrame();
        panel = new JPanel();
        boton1 = new JButton("Preme");
        boton2 = new JButton("Limpa");
        txt1 = new JTextField();
        text2 = new JTextField();
        et1 = new JLabel("NOME:");
        et2 = new JLabel("PASSWORD:");
        areaTexto = new JTextArea();


        marco.setSize(750,600);
        panel.setSize(750, 750);
        panel.setLayout(null);
        boton1.setBounds(200, 400, 100, 50);
        boton2.setBounds(400, 400, 100, 50);
        txt1.setBounds(300, 75, 300, 50);
        text2.setBounds(300, 150, 300, 50);
        areaTexto.setBounds(150, 250, 450, 100);
        areaTexto.setText("Area Texto.");
        et1.setBounds(50, 25, 100, 150);
        et2.setBounds(50, 75, 100, 200);

        panel.add(txt1);
        panel.add(text2);
        panel.add(areaTexto);
        panel.add(boton2);
        panel.add(boton1);
        panel.add(et1);
        panel.add(et2);
        marco.setLocationRelativeTo(marco);
        marco.add(panel);
        
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

  //  @Override
    public void actionPerformed(ActionEvent e) {
        Object ob = e.getSource();
        if(ob==boton1)
            areaTexto.setText("Hola " + txt1.getText());
        else  
            areaTexto.setText("");
    }

    //
}
