import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKetQua;

	public ManHinhTinhToan() {
		setFont(new Font("Dialog", Font.PLAIN, 16));
		setTitle("Chương trình Tính toán");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 359);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Nhập số thứ hai (b)");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(56, 135, 159, 36);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Nhập số thứ nhất (a)");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(56, 70, 159, 36);
		contentPane.add(lblNewLabel_1);

		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setBounds(237, 70, 233, 36);
		contentPane.add(txtA);
		txtA.setColumns(10);

		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(237, 135, 233, 36);
		contentPane.add(txtB);

		JButton btnCong = new JButton("CỘNG");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Code xử lý Cộng
				HamXuLyCong();
			}
		});
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCong.setBounds(101, 209, 85, 36);
		contentPane.add(btnCong);

		JButton btnTru = new JButton("TRỪ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Code xử lý Trừ
				HamXuLyTru();
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTru.setBounds(211, 209, 85, 36);
		contentPane.add(btnTru);

		JButton btnNhan = new JButton("NHÂN");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Code xử lý Nhân
				HamXuLyNhan();
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNhan.setBounds(324, 209, 85, 36);
		contentPane.add(btnNhan);

		JButton btnChia = new JButton("CHIA");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Code xử lý Chia
				HamXuLyChia();
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChia.setBounds(437, 209, 85, 36);
		contentPane.add(btnChia);

		JLabel lblKtQuTnh = new JLabel("Kết quả tính toán: ");
		lblKtQuTnh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQuTnh.setBounds(56, 265, 159, 36);
		contentPane.add(lblKtQuTnh);

		txtKetQua = new JTextField();
		txtKetQua.setEditable(false);
		txtKetQua.setEnabled(false);
		txtKetQua.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKetQua.setColumns(10);
		txtKetQua.setBounds(237, 265, 233, 36);
		contentPane.add(txtKetQua);
	}

	void HamXuLyCong() {
		// Lấy dữ liệu
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		// Ép kiểu về số
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		
		// Tính toán
		double tong = soA + soB;
		// Hiển thị lên kết quả
		txtKetQua.setText(String.valueOf(tong));
		
	}

	void HamXuLyTru() {
		// Lấy dữ liệu
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		// Ép kiểu về số
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		
		// Tính toán
		double hieu = soA - soB;
		// Hiển thị lên kết quả
		txtKetQua.setText(String.valueOf(hieu));
		
	}
	void HamXuLyNhan() {
		// Lấy dữ liệu
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		// Ép kiểu về số
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		
		// Tính toán
		double nhan = soA * soB;
		// Hiển thị lên kết quả
		txtKetQua.setText(String.valueOf(nhan));
		
	}
	void HamXuLyChia() {
		// Lấy dữ liệu
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		// Ép kiểu về số
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		
		// Tính toán
		double chia = soA / soB;
		// Hiển thị lên kết quả
		txtKetQua.setText(String.valueOf(chia));
		
	}
}
