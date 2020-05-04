import javax.swing.*;
import java.awt.*;

public class CrudContratistas
{
    Color blanco = new Color(255,255,255);
    Color rojo = new Color(0,0,255);
    Color azul = new Color(255,0,0);
    Color violeta = new Color(115,0,202);
    
    static Choice lista;
   
    
    public CrudContratistas(String title)
    {
        JFrame vt1 = new JFrame(title);
        //
        vt1.setTitle("Formulario");
        vt1.setSize(1000,700);
        vt1.setVisible(true);
        vt1.setBackground(blanco);
        vt1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vt1.setLocationRelativeTo(null);
        //
        JPanel P1 = new JPanel();
        vt1.add(P1);
        P1.setLayout(null);
        P1.setBackground(blanco);
        
        
        //
        JLabel labelDatos = new JLabel("Datos Personales");
        labelDatos.setBounds(100,1,200,90);
        labelDatos.setFont(new Font("arial",Font.PLAIN,18));
        labelDatos.setForeground(rojo);
        //
        JLabel labelNombre = new JLabel("nombre");
        labelNombre.setBounds(100,70,165,25);
        JTextField fieldnombre = new JTextField();
        fieldnombre.setBounds(170,70,165,25);
        //
        JLabel labelApellido = new JLabel("apellido");
        labelApellido.setBounds(100,70,165,25);
        JTextField fieldapellido = new JTextField();
        fieldapellido.setBounds(170,70,165,25);
        //
        JLabel labelTipo = new JLabel("Tipo");
        labelTipo.setBounds(510,50,165,25);
        labelTipo.setFont(new Font("arial",Font.PLAIN,12));
        JComboBox BoxTipo = new JComboBox();
        BoxTipo.addItem("C.C");
        BoxTipo.addItem("T.I");
        BoxTipo.addItem("Pasaporte");
        BoxTipo.addItem("C.DE EXTRANJERIA");
        //
        JLabel labelIdentificacion = new JLabel("Identificacion");
        labelIdentificacion.setBounds(100,70,165,25);
        JTextField fieldIdentificacion = new JTextField();
        fieldIdentificacion.setBounds(170,70,165,25);
        //
        JLabel labelDireccion = new JLabel("Direccion");
        labelDireccion.setBounds(100,70,165,25);
        JTextField fieldDireccion = new JTextField();
        fieldDireccion.setBounds(170,70,165,25);
        //
        JLabel labelCorreo = new JLabel("Correo Electronico");
        labelCorreo.setBounds(100,70,165,25);
        JTextField fieldCorreo = new JTextField();
        fieldCorreo.setBounds(170,70,165,25);
        //
        JLabel labelTelefono = new JLabel("Telefono");
        labelTelefono.setBounds(100,70,165,25);
        JTextField fieldTelefono = new JTextField();
        fieldTelefono.setBounds(170,70,165,25);
        //
        JLabel labelDatos2 = new JLabel("Datos Educativos");
        labelDatos2.setBounds(100,1,200,90);
        labelDatos2.setFont(new Font("arial",Font.PLAIN,18));
        labelDatos2.setForeground(rojo);
      
        JLabel labelBachillerato = new JLabel("Bachillerato");
        labelBachillerato.setBounds(100,70,165,25);
        JTextField fieldBachillerato = new JTextField();
        fieldBachillerato.setBounds(170,70,165,25);
        
        JLabel labelaño = new JLabel("año de finalizacion");
        labelaño.setBounds(100,70,165,25);
        labelaño.setFont(new Font("arial",Font.PLAIN,12));
        JComboBox BoxTipo2 = new JComboBox();
        BoxTipo2.addItem("");
        BoxTipo2.addItem("");
        BoxTipo2.addItem("");
        BoxTipo2.addItem("");
        BoxTipo2.addItem("");
        BoxTipo2.addItem("");
        BoxTipo2.addItem("");
        BoxTipo2.addItem("");
        BoxTipo2.addItem("");
        BoxTipo2.addItem("");
        BoxTipo2.addItem("");
        BoxTipo2.addItem("");
        BoxTipo2.addItem("");
        BoxTipo2.addItem("");
        BoxTipo2.addItem("");
        BoxTipo2.addItem("");
        BoxTipo2.addItem("");
        BoxTipo2.addItem("");
        BoxTipo2.addItem("");
        BoxTipo2.addItem("");
        
        JLabel labelInstituto = new JLabel("Instituto");
        labelInstituto.setBounds(100,70,165,25);
        JTextField fieldInstituto = new JTextField();
        fieldInstituto.setBounds(170,70,165,25);
        
        JLabel labelUniversitarios = new JLabel("Universitarios");
        labelUniversitarios.setBounds(100,70,165,25);
        JTextField fieldUniversitarios = new JTextField();
        fieldUniversitarios.setBounds(170,70,165,25);
        
        JLabel labelañof = new JLabel("año de finalizacion");
        labelañof.setBounds(100,70,165,25);
        labelañof.setFont(new Font("arial",Font.PLAIN,12));
        JComboBox BoxTipo3 = new JComboBox();
        BoxTipo3.addItem("");
        BoxTipo3.addItem("");
        BoxTipo3.addItem("");
        BoxTipo3.addItem("");
        BoxTipo3.addItem("");
        BoxTipo3.addItem("");
        BoxTipo3.addItem("");
        BoxTipo3.addItem("");
        BoxTipo3.addItem("");
        BoxTipo3.addItem("");
        BoxTipo3.addItem("");
        BoxTipo3.addItem("");
        BoxTipo3.addItem("");
        BoxTipo3.addItem("");
        BoxTipo3.addItem("");
        BoxTipo3.addItem("");
        BoxTipo3.addItem("");
        BoxTipo3.addItem("");
        BoxTipo3.addItem("");
        BoxTipo3.addItem("");
        
        JLabel labelInstituto2 = new JLabel("Instituto");
        labelInstituto2.setBounds(100,70,165,25);
        JTextField fieldInstituto2 = new JTextField();
        fieldInstituto2.setBounds(170,70,165,25);
        
        JLabel labelRef  = new JLabel("Referencias Familiares");
        labelRef.setBounds(100,1,200,90);
        labelRef.setFont(new Font("arial",Font.PLAIN,18));
        labelRef.setForeground(rojo);
        
        JLabel labelNombre2 = new JLabel("nombre");
        labelNombre2.setBounds(100,70,165,25);
        JTextField fieldnombre2 = new JTextField();
        fieldnombre2.setBounds(170,70,165,25);
        
        JLabel labelparentesco = new JLabel("Parentesco");
        labelparentesco.setBounds(100,70,165,25);
        labelparentesco.setFont(new Font("arial",Font.PLAIN,12));
        JComboBox BoxTipo5 = new JComboBox();
        BoxTipo5.addItem("");
        BoxTipo5.addItem("");
        BoxTipo5.addItem("");
        BoxTipo5.addItem("");
        BoxTipo5.addItem("");
        BoxTipo5.addItem("");
        
        JLabel labelTelefono2 = new JLabel("Telefono");
        labelTelefono2.setBounds(100,70,165,25);
        JTextField fieldTelefono2 = new JTextField();
        fieldTelefono2.setBounds(170,70,165,25);
        
        JLabel labelNombre3 = new JLabel("nombre");
        labelNombre3.setBounds(100,70,165,25);
        JTextField fieldnombre3 = new JTextField();
        fieldnombre3.setBounds(170,70,165,25);
        
        JLabel labelparentesco2 = new JLabel("Parentesco");
        labelparentesco2.setBounds(100,70,165,25);
        labelparentesco2.setFont(new Font("arial",Font.PLAIN,12));
        JComboBox BoxTipo6 = new JComboBox();
        BoxTipo6.addItem("");
        BoxTipo6.addItem("");
        BoxTipo6.addItem("");
        BoxTipo6.addItem("");
        BoxTipo6.addItem("");
        BoxTipo6.addItem("");
        
        JLabel labelTelefono3 = new JLabel("Telefono");
        labelTelefono3.setBounds(100,70,165,25);
        JTextField fieldTelefono3 = new JTextField();
        fieldTelefono3.setBounds(170,70,165,25);
        
        P1.add(labelNombre);
        P1.add(labelApellido);
        P1.add(labelDireccion);
        P1.add(labelCorreo);
        P1.add(labelTipo);
        P1.add(labelIdentificacion);
        P1.add(labelTelefono);
        P1.add(BoxTipo);
        P1.add(fieldnombre);
        P1.add(fieldapellido);
        P1.add(fieldDireccion);
        P1.add(fieldCorreo);
        P1.add(fieldTelefono);
        P1.add(fieldIdentificacion);
        P1.add(labelBachillerato);
        P1.add(fieldBachillerato);
        P1.add(BoxTipo2);
        P1.add(labelInstituto);
        P1.add(fieldInstituto);
        P1.add(labelUniversitarios);
        P1.add(fieldUniversitarios);
        P1.add(BoxTipo3);
        P1.add(labelInstituto2);
        P1.add(fieldInstituto2);
        P1.add(labelNombre2);
        P1.add(fieldnombre2);
        P1.add(BoxTipo5);
        P1.add(BoxTipo6);
        P1.add(labelNombre3);
        P1.add(fieldnombre3);
        P1.add(labelTelefono2);
        P1.add(fieldTelefono2);
        P1.add(labelTelefono3);
        P1.add(fieldTelefono3);
        P1.add(labelTipo);
        P1.add(labelaño);
        P1.add(labelañof);
        P1.add(labelRef);
        P1.add(labelparentesco);
        P1.add(labelparentesco2);
     
       
        //
        
        
        
    }
    
   
    
    
   
    
}
