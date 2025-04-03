package eventos;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Voleibol extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txNombre;
    private JTextField txApellido;
    private JSpinner txEdad;
    private JComboBox<String> comboCategoria;
    private JComboBox<String> comboPrograma;
    private JTextArea listaInscritos;
    private ArrayList<String> inscritos = new ArrayList<>();

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Voleibol frame = new Voleibol();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Voleibol() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 999, 600);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(173, 197, 217));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Daniel\\eclipse-workspace\\SENA\\src\\eventos\\voleibol-removebg-preview (1).png"));
        lblNewLabel.setBounds(345, 70, 30, 30);
        lblNewLabel.setVisible(false);
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Daniel\\eclipse-workspace\\SENA\\src\\eventos\\voleibol-removebg-preview (1).png"));
        lblNewLabel_1.setBounds(345, 110, 45, 30);
        lblNewLabel_1.setVisible(false);
        contentPane.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Daniel\\eclipse-workspace\\SENA\\src\\eventos\\voleibol-removebg-preview (1).png"));
        lblNewLabel_2.setBounds(252, 144, 45, 30);
        lblNewLabel_2.setVisible(false);
        contentPane.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Daniel\\eclipse-workspace\\SENA\\src\\eventos\\voleibol-removebg-preview (1).png"));
        lblNewLabel_3.setBounds(345, 179, 45, 30);
        lblNewLabel_3.setVisible(false);
        contentPane.add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Daniel\\eclipse-workspace\\SENA\\src\\eventos\\voleibol-removebg-preview (1).png"));
        lblNewLabel_4.setBounds(345, 225, 45, 30);
        lblNewLabel_4.setVisible(false);
        contentPane.add(lblNewLabel_4);
        
        JLabel lblNewLabel_5 = new JLabel("");
        lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Daniel\\eclipse-workspace\\SENA\\src\\eventos\\voleibol-removebg-preview (1).png"));
        lblNewLabel_5.setBounds(308, 280, 59, 30);
        lblNewLabel_5.setVisible(false);
        contentPane.add(lblNewLabel_5);
        
        JLabel lblNewLabel_6 = new JLabel("");
        lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Daniel\\eclipse-workspace\\SENA\\src\\eventos\\voleibol-removebg-preview (1).png"));
        lblNewLabel_6.setBounds(20, 280, 30, 30);
        lblNewLabel_6.setVisible(false);
        contentPane.add(lblNewLabel_6);
        
        
        JLabel lbTitulo = new JLabel("REGISTRO VOLEIBOL");
        lbTitulo.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        lbTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lbTitulo.setBounds(10, 10, 975, 41);
        contentPane.add(lbTitulo);
        
        // Labels y campos de entrada
        JLabel lbNombre = new JLabel("Nombre :");
        lbNombre.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		lblNewLabel.setVisible(true);
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		lblNewLabel.setVisible(false);
        	}
        });
        lbNombre.setFont(new Font("GeoSlab703 Md BT", Font.PLAIN, 14));
        lbNombre.setBounds(10, 70, 72, 22);
        contentPane.add(lbNombre);

        txNombre = new JTextField();
        txNombre.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		lblNewLabel.setVisible(true);
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		lblNewLabel.setVisible(false);
        	}
        });
        txNombre.setBounds(183, 72, 157, 22);
        contentPane.add(txNombre);
        
        JLabel lbApellido = new JLabel("Apellido :");
        lbApellido.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		lblNewLabel_1.setVisible(true);
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		lblNewLabel_1.setVisible(false);
        	}
        });
        lbApellido.setFont(new Font("GeoSlab703 Md BT", Font.PLAIN, 14));
        lbApellido.setBounds(10, 110, 72, 22);
        contentPane.add(lbApellido);
        
        txApellido = new JTextField();
        txApellido.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		lblNewLabel_1.setVisible(true);
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		lblNewLabel_1.setVisible(false);
        	}
        });
        txApellido.setBounds(183, 112, 157, 22);
        contentPane.add(txApellido);
        
        JLabel lbEdad = new JLabel("Edad :");
        lbEdad.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		lblNewLabel_2.setVisible(true);
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		lblNewLabel_2.setVisible(false);
        	}
        });
        lbEdad.setFont(new Font("GeoSlab703 Md BT", Font.PLAIN, 14));
        lbEdad.setBounds(10, 150, 250, 22);
        contentPane.add(lbEdad);
        
        txEdad = new JSpinner(new SpinnerNumberModel(18, 10, 50, 1));
        txEdad.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		lblNewLabel_2.setVisible(true);
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		lblNewLabel_2.setVisible(false);
        	}
        });
        txEdad.setBounds(183, 152, 59, 22);
        contentPane.add(txEdad);
        
        JLabel lbCategoria = new JLabel("Categoría:");
        lbCategoria.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		lblNewLabel_3.setVisible(true);
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		lblNewLabel_3.setVisible(false);
        	}
        });
        lbCategoria.setFont(new Font("GeoSlab703 Md BT", Font.PLAIN, 14));
        lbCategoria.setBounds(10, 182, 84, 22);
        contentPane.add(lbCategoria);
        
        comboCategoria = new JComboBox<>(new String[]{" ","Juvenil", "Adulto", "Senior"});
        comboCategoria.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		lblNewLabel_3.setVisible(true);
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		lblNewLabel_3.setVisible(false);
        	}
        });
        comboCategoria.setBounds(183, 182, 157, 22);
        contentPane.add(comboCategoria);
        
        JLabel lbPrograma = new JLabel("Programa de formación:");
        lbPrograma.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		lblNewLabel_4.setVisible(true);
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		lblNewLabel_4.setVisible(false);
        	}
        });
        lbPrograma.setFont(new Font("GeoSlab703 Md BT", Font.PLAIN, 14));
        lbPrograma.setBounds(10, 214, 198, 51);
        contentPane.add(lbPrograma);
        
        comboPrograma = new JComboBox<>(new String[]{" ","Entrenamiento", "Competencia", "Recreación"});
        comboPrograma.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		lblNewLabel_4.setVisible(true);
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		lblNewLabel_4.setVisible(false);
        	}
        });
        comboPrograma.setBounds(183, 231, 157, 22);
        contentPane.add(comboPrograma);
        
        // Botón Añadir
        JButton btnAñadir = new JButton("AÑADIR");
        btnAñadir.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		lblNewLabel_6.setVisible(true);
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		lblNewLabel_6.setVisible(false);
        	}
        });
        btnAñadir.setForeground(Color.WHITE);
        btnAñadir.setBackground(new Color(2, 73, 89));
        btnAñadir.setBounds(50, 280, 120, 30);
        contentPane.add(btnAñadir);
        
        // Botón Eliminar
        JButton btnEliminar = new JButton("ELIMINAR");
        btnEliminar.setForeground(Color.WHITE);
        btnEliminar.setBackground(new Color(200, 0, 0));
        btnEliminar.setBounds(180, 280, 120, 30);
        contentPane.add(btnEliminar);
        
        // Lista de inscritos
        listaInscritos = new JTextArea();
        listaInscritos.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(listaInscritos);
        scrollPane.setBounds(400, 70, 400, 300);
        contentPane.add(scrollPane);
        
        
        // Acción Añadir
        btnAñadir.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                String registro = txNombre.getText() + " " + txApellido.getText() + ", Edad: " + txEdad.getValue() + 
                        ", " + comboCategoria.getSelectedItem() + ", " + comboPrograma.getSelectedItem();
                inscritos.add(registro);
                actualizarLista();
                
                txNombre.setText(" ");
                txApellido.setText(" ");
                comboCategoria.getItemAt(0);
                
                
                
            }
        });
        
        // Acción Eliminar
        btnEliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!inscritos.isEmpty()) {
                    inscritos.remove(inscritos.size() - 1); // Elimina el último agregado
                    actualizarLista();
                }
            }
        });
        btnEliminar.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		lblNewLabel_5.setVisible(true);
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		lblNewLabel_5.setVisible(false);
        	}
        });
        
    }
    
    private void actualizarLista() {
        listaInscritos.setText("");
        for (String inscrito : inscritos) {
            listaInscritos.append(inscrito + "\n");
        }
    }
}
