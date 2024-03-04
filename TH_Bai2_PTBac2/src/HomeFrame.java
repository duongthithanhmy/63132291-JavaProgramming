import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class HomeFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtKetQua;
	public HomeFrame() {
		setTitle("GIẢI PHƯƠNG TRÌNH BẬC 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 806, 537);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số a: ");
		lblNewLabel.setBounds(32, 125, 87, 42);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblNewLabel);
		
		txtA = new JTextField();
		txtA.setHorizontalAlignment(SwingConstants.CENTER);
		txtA.setBounds(129, 129, 87, 39);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		JLabel lblNhpSB = new JLabel("Nhập số b: ");
		lblNhpSB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSB.setBounds(302, 125, 87, 42);
		contentPane.add(lblNhpSB);
		
		JLabel lblNhpSC = new JLabel("Nhập số c: ");
		lblNhpSC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSC.setBounds(577, 125, 87, 42);
		contentPane.add(lblNhpSC);
		
		JLabel lblNewLabel_1 = new JLabel("GIẢI PHƯƠNG TRÌNH BẬC 2 CÓ DẠNG: ax^2 + bx + c = 0");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(143, 29, 540, 42);
		contentPane.add(lblNewLabel_1);
		
		txtB = new JTextField();
		txtB.setHorizontalAlignment(SwingConstants.CENTER);
		txtB.setColumns(10);
		txtB.setBounds(399, 129, 87, 39);
		contentPane.add(txtB);
		
		txtC = new JTextField();
		txtC.setHorizontalAlignment(SwingConstants.CENTER);
		txtC.setColumns(10);
		txtC.setBounds(680, 129, 87, 39);
		contentPane.add(txtC);
		
		JButton btnGiaiPT = new JButton("GIẢI PHƯƠNG TRÌNH");
		btnGiaiPT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GiaiPhuongTrinhBac2();
			}
		});
		btnGiaiPT.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnGiaiPT.setBounds(298, 213, 202, 49);
		contentPane.add(btnGiaiPT);
		
		JLabel lblNewLabel_2 = new JLabel("KẾT QUẢ: ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(45, 331, 87, 71);
		contentPane.add(lblNewLabel_2);
		
		txtKetQua = new JTextField();
		txtKetQua.setEditable(false);
		txtKetQua.setEnabled(false);
		txtKetQua.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKetQua.setBounds(162, 333, 540, 94);
		contentPane.add(txtKetQua);
		txtKetQua.setColumns(10);
	}
	void GiaiPhuongTrinhBac2() {
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		String str_soC = txtC.getText();
		
		if(str_soA.isEmpty() || str_soB.isEmpty() || str_soC.isEmpty()) {
			JOptionPane hopThoai = new JOptionPane();
			hopThoai.showMessageDialog(this, "Vui lòng nhập đầy đủ các trường");
		}
		
		else {
			double a = Double.parseDouble(str_soA);
			double b = Double.parseDouble(str_soB);
			double c = Double.parseDouble(str_soC);
			
			if(a == 0) {
				if(b == 0) {
					if(c== 0) {
						txtKetQua.setText("Phương trình có vô số nghiệm");
					}
					else {
						txtKetQua.setText("Phương trình vô nghiệm");
					}
				}
				else {
					txtKetQua.setText("Nghiệm của phương trình là x = " + (-c/(float)b));
				}
			}
			else {
				Double detal = Math.pow(b, 2) - 4*a*c;
				if(detal < 0) {
					txtKetQua.setText("Phương trình vô nghiệm");
				}
				else {
					if(detal == 0) {
						txtKetQua.setText("Phương trình có nghiệm kép x = " + (-b/(float)(2*a)));
					}
					else {
						txtKetQua.setText("Phương trình có 2 nghiệm phân biệt: x1 = " + (-b + Math.sqrt(detal))/(float)(2*a) + ", x2 = " + (-b - Math.sqrt(detal))/(float)(2*a));
					}
				}
			}
		}

	}
}
