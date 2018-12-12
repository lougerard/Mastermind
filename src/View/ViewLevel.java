package View;
import mastermind.GameController;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JScrollPane;

public class ViewLevel extends JFrame implements ActionListener {

	private JPanel contentPane;
	String temp="";
	private JLabel label_3;
	GameController GameController = new GameController();
	private JTextField textField;
	ViewGameSolo ViewGameSolo = new ViewGameSolo();
	private JLabel lblEncoderLadresseIp;
	private JLabel lblHardh;
	private JLabel lblNormaln;
	private JLabel lblEasye;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLevel frame = new ViewLevel();
					frame.setVisible(true);
					frame.setTitle("Number Mastermind");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewLevel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{10, 90, 20, 50, 50, 20, 20,20, 80};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		contentPane.setLayout(gbl_contentPane);
		
		label_3 = new JLabel("Number Mastermind");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setFont(new Font("Lucida Grande", Font.PLAIN, 37));
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.gridwidth = 3;
		gbc_label_3.insets = new Insets(0, 0, 5, 0);
		gbc_label_3.gridx = 0;
		gbc_label_3.gridy = 1;
		contentPane.add(label_3, gbc_label_3);
		
		lblEncoderLadresseIp = new JLabel("Please enter your difficulty:");
		GridBagConstraints gbc_lblEncoderLadresseIp = new GridBagConstraints();
		gbc_lblEncoderLadresseIp.anchor = GridBagConstraints.WEST;
		gbc_lblEncoderLadresseIp.gridwidth = 2;
		gbc_lblEncoderLadresseIp.insets = new Insets(0, 0, 5, 0);
		gbc_lblEncoderLadresseIp.gridx = 1;
		gbc_lblEncoderLadresseIp.gridy = 3;
		contentPane.add(lblEncoderLadresseIp, gbc_lblEncoderLadresseIp);
		
		
		JButton btnIp = new JButton("Enter");
		GridBagConstraints gbc_btnIp = new GridBagConstraints();
		gbc_btnIp.insets = new Insets(0, 0, 5, 5);
		gbc_btnIp.gridx = 0;
		gbc_btnIp.gridy = 4;
		contentPane.add(btnIp, gbc_btnIp);
		btnIp.addActionListener(this);
		
		textField = new JTextField();
		textField.setColumns(10);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 4;
		contentPane.add(textField, gbc_textField);
		
		lblHardh = new JLabel("Hard = 'H'        5 chances");
		GridBagConstraints gbc_lblHardh = new GridBagConstraints();
		gbc_lblHardh.anchor = GridBagConstraints.WEST;
		gbc_lblHardh.insets = new Insets(0, 0, 5, 5);
		gbc_lblHardh.gridx = 1;
		gbc_lblHardh.gridy = 5;
		contentPane.add(lblHardh, gbc_lblHardh);
		
		lblNormaln = new JLabel("Normal = 'N'      9 chances");
		GridBagConstraints gbc_lblNormaln = new GridBagConstraints();
		gbc_lblNormaln.anchor = GridBagConstraints.WEST;
		gbc_lblNormaln.insets = new Insets(0, 0, 5, 5);
		gbc_lblNormaln.gridx = 1;
		gbc_lblNormaln.gridy = 6;
		contentPane.add(lblNormaln, gbc_lblNormaln);
		
		lblEasye = new JLabel("Easy = 'E'        12 chances");
		GridBagConstraints gbc_lblEasye = new GridBagConstraints();
		gbc_lblEasye.anchor = GridBagConstraints.WEST;
		gbc_lblEasye.insets = new Insets(0, 0, 5, 5);
		gbc_lblEasye.gridx = 1;
		gbc_lblEasye.gridy = 7;
		contentPane.add(lblEasye, gbc_lblEasye);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String textOrigine="";
		
		switch(e.getActionCommand()){
	
		case"Enter":
			ViewGameSolo.setVisible(true);
			
		case"Exit":
			
			this.dispose();
		}
	}

}
