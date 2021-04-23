import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sistema {
    private JTextField textNombre;
    public JPanel Parcial;
    private JTextField textApellido;
    private JTextField textIdentificacion;
    private JTextField textCorreo;
    private JTextField textMateria;
    private JTextField textCódigo;
    private JTextField textNota1;
    private JTextField textNota2;
    private JTextField textNota3;
    private JTextField textNota4;
    private JTextField textNota5;
    private JButton registroButton;
    private JDialog dlgShowInfo;
    private JLabel lblEvaluation;

    private double one;
    private double two;
    private double tree;
    private double four;
    private double five;
    private double suma;
    private int divisor = 5;
    private double promedio =0;

    public Sistema() {

        registroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                one = Double.parseDouble(textNota1.getText());
                two = Double.parseDouble(textNota2.getText());
                tree = Double.parseDouble(textNota3.getText());
                four = Double.parseDouble(textNota4.getText());
                five = Double.parseDouble(textNota5.getText());
                suma = one+two+tree+four+five;
                promedio= suma/divisor;


                try{
                    Window window = SwingUtilities.windowForComponent(registroButton);
                    dlgShowInfo = new JDialog(window);
                    dlgShowInfo.setModal(true);
                    dlgShowInfo.add(new JLabel("Nombre: " + textNombre.getText()
                            +"\n Apellido: " +textApellido.getText()+
                            "\n Numero de identificación : " +textIdentificacion.getText()+
                            "\n Correo: " +textCorreo.getText()+ "\n Materia: " +textMateria.getText()));
                    //dlgShowInfo.add(new JTextField("Promedio " +promedio));
                    dlgShowInfo.pack();
                    dlgShowInfo.setVisible(true);
                    if(one > 0 && one < 5 && two > 0 && two < 5 && tree > 0 && tree < 5 && four > 0 && four < 5 && five > 0 && five < 5 ){
                        suma = one+two+tree+four+five;
                        promedio= suma/divisor;
                        lblEvaluation.setText("Promedio " + promedio);
                    }

                }catch (Exception ex){
                    lblEvaluation.setText("ERR: " + ex.getMessage());
                }
            }
        });
    }
}
