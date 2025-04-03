package eventos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormularioCitas extends JFrame {
    private JTextField campoNombre;
    private JComboBox<String> comboServicios;
    private JTextField campoFecha;
    private JButton btnRegistrar;
    private JLabel lblNombre, lblServicio, lblFecha;
    
    public FormularioCitas() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Daniel\\Downloads\\muela_hover.jpeg"));
        setTitle("Registro de Citas Odontológicas");
        setSize(830, 427);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
        
        // Configuración de colores y fuente
        getContentPane().setBackground(new Color(206, 236, 242));
        Font fuente = new Font("Times New Roman", Font.PLAIN, 14);
        
        // Crear componentes
        lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(38, 23, 133, 64);
        lblNombre.setFont(fuente);
        campoNombre = new JTextField();
        campoNombre.setBounds(152, 49, 251, 38);
        campoNombre.setMargin(new Insets(5, 20, 5, 20)); 
        
        lblServicio = new JLabel("Servicio:");
        lblServicio.setBounds(38, 121, 133, 64);
        lblServicio.setFont(fuente);
        comboServicios = new JComboBox<>(new String[]{"Consulta General", "Limpieza Dental", "Ortodoncia", "Extracción"});
        comboServicios.setBounds(152, 135, 251, 38);
        
        lblFecha = new JLabel("Fecha:");
        lblFecha.setBounds(38, 219, 133, 64);
        lblFecha.setFont(fuente);
        campoFecha = new JTextField("YYYY-MM-DD");
        campoFecha.setBounds(152, 233, 251, 38);
        campoFecha.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				if(campoFecha.getText().trim().equals("YYYY-MM-DD")) {
					campoFecha.setText("");					
					campoFecha.setForeground(new Color(0, 0, 0));
				}
			}
			
			public void focusLost(FocusEvent e) {
				if(campoFecha.getText().trim().equals("")) {
					campoFecha.setText("YYYY-MM-DD");
					campoFecha.setForeground(new Color(128, 128, 128));
				}
			}
		});
        
        btnRegistrar = new JButton("Registrar Cita");
        btnRegistrar.addMouseListener(new MouseAdapter() {
        	
        	public void mouseEntered(MouseEvent e) {
        		btnRegistrar.setBackground(new Color(87, 119, 126));
        	}
        	public void mouseExited(MouseEvent e) {
        		btnRegistrar.setBackground(new Color(36, 122, 140));
            }
        });
        btnRegistrar.setBounds(240, 316, 233, 64);
        btnRegistrar.setFont(fuente);
        btnRegistrar.setBackground(new Color(36, 122, 140));
        btnRegistrar.setForeground(Color.WHITE);
        
        // Agregar validación al botón
        btnRegistrar.addActionListener(e -> validarFormulario());
        
        // Agregar componentes a la ventana
        getContentPane().add(lblNombre);
        getContentPane().add(campoNombre);
        getContentPane().add(lblServicio);
        getContentPane().add(comboServicios);
        getContentPane().add(lblFecha);
        getContentPane().add(campoFecha);
        getContentPane().add(btnRegistrar);
        
        setVisible(true);
    }
    
    private void validarFormulario() {
        String nombre = campoNombre.getText().trim();
        String fecha = campoFecha.getText().trim();
        
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo de nombre no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (!fecha.matches("\\d{4}-\\d{2}-\\d{2}")) {
            JOptionPane.showMessageDialog(this, "Ingrese una fecha válida en formato YYYY-MM-DD.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        JOptionPane.showMessageDialog(this, "Cita registrada con éxito.", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(FormularioCitas::new);
    }
}