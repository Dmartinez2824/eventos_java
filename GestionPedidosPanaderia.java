package eventos;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;

public class GestionPedidosPanaderia extends JFrame {
	 private JComboBox<String> comboProductos;
	    private JButton btnAgregar, btnFinalizar;
	    private JTextArea areaPedido;
	    private ArrayList<String> listaPedidos = new ArrayList<>();

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txcantidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionPedidosPanaderia frame = new GestionPedidosPanaderia();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GestionPedidosPanaderia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 825, 416);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(220, 187, 159));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(32, 61, 58));
		panel.setBounds(10, 10, 791, 61);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbDibujo = new JLabel("");
		lbDibujo.setIcon(new ImageIcon("C:\\Users\\Daniel\\Downloads\\pan-removebg-preview (1).png"));
		lbDibujo.setBounds(580, 0, 45, 61);
		lbDibujo.setVisible(false);
		panel.add(lbDibujo);
		
		
		
		
		
		
		
		
		JLabel lbTitulo = new JLabel("PANADERIA PANPAN");
		lbTitulo.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				lbDibujo.setVisible(true);
			}
			
			public void mouseExited(MouseEvent e) {
				lbDibujo.setVisible(false);
			}
		});
		lbTitulo.setForeground(new Color(255, 255, 255));
		lbTitulo.setFont(new Font("High Tower Text", Font.PLAIN, 20));
		lbTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitulo.setBounds(0, 0, 791, 61);
		panel.add(lbTitulo);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(191, 163, 138));
		panel_1.setBounds(10, 81, 791, 288);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbProductos = new JLabel("Productos:");
		lbProductos.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbProductos.setForeground(new Color(0, 0, 0));
		lbProductos.setBackground(new Color(64, 128, 128));
		lbProductos.setBounds(44, 34, 70, 29);
		panel_1.add(lbProductos);
		
		comboProductos = new JComboBox<>(new String[]{"Pan francés", "Croissant", "Donut", "Pastel de chocolate", "Galletas", "Milhoja","Bizcocho", "empanada"});
		comboProductos.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		comboProductos.setForeground(new Color(255, 255, 255));
		comboProductos.setBackground(new Color(64, 128, 128));
		comboProductos.setBounds(133, 40, 260, 21);
		panel_1.add(comboProductos);
		
		txcantidad = new JTextField();
		txcantidad.setForeground(new Color(0, 0, 0));
		txcantidad.setBackground(new Color(105, 180, 180));
		txcantidad.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txcantidad.setBounds(569, 40, 70, 19);
		panel_1.add(txcantidad);
		txcantidad.setColumns(10);
		
		JLabel lbcantidad = new JLabel("Cantidad:");
		lbcantidad.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lbcantidad.setBounds(484, 42, 75, 13);
		panel_1.add(lbcantidad);

        btnAgregar = new JButton("Agregar al Pedido");
        btnAgregar.addMouseListener(new MouseAdapter() {
        	
        	public void mouseEntered(MouseEvent e) {
				lbDibujo.setVisible(true);
				lbDibujo.setBounds(200, 0, 45, 61);
			}
			
			public void mouseExited(MouseEvent e) {
				lbDibujo.setVisible(false);
				lbDibujo.setBounds(580, 0, 45, 61);
			}
        });
        btnAgregar.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        btnAgregar.setBackground(new Color(32, 61, 58));
        btnAgregar.setForeground(Color.WHITE);
        btnAgregar.setBounds(44, 198, 203, 29);
        panel_1.add(btnAgregar);
        
   
        
        
        JLabel lblNewLabel_1 = new JLabel("PANADERIA PANPAN");
        lblNewLabel_1.setForeground(new Color(220, 187, 159));
        lblNewLabel_1.setFont(new Font("High Tower Text", Font.PLAIN, 35));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(123, 237, 567, 51);
        panel_1.add(lblNewLabel_1);
        
        JButton btnPedido = new JButton("Realizar Pedido");
        btnPedido.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				lbDibujo.setVisible(true);
			}
			
			public void mouseExited(MouseEvent e) {
				lbDibujo.setVisible(false);
			}
		});
        btnPedido.setBackground(new Color(32, 61, 58));
        btnPedido.setForeground(new Color(255, 255, 255));
        btnPedido.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        btnPedido.setBounds(569, 198, 203, 29);
        panel_1.add(btnPedido);
        
        JTextArea areaPedido = new JTextArea();
        areaPedido.setBackground(new Color(191, 163, 138));
        areaPedido.setBounds(300, 82, 218, 145);
        areaPedido.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        panel_1.add(areaPedido);
        
        
        btnAgregar.addActionListener(e -> {
            String producto = (String) comboProductos.getSelectedItem();
            String cantidad = txcantidad.getText();
            listaPedidos.add(producto + "  " +cantidad);
            areaPedido.append(producto  + "  " + cantidad +"\n");
            areaPedido.repaint();
        });
        
        btnPedido.addActionListener(e -> {
            if (listaPedidos.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No hay productos en el pedido.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Pedido finalizado: \n" + String.join(",\n ", listaPedidos), "Confirmación", JOptionPane.INFORMATION_MESSAGE);
                listaPedidos.clear();
                areaPedido.setText("");
            }
        });
	}
}
