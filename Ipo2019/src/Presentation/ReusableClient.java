package Presentation;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ReusableClient extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	*/
	
	private Color color;
	private GridBagLayout gridBagLayout;
	private GridBagConstraints gbc_label;
	private GridBagConstraints gbc_lblNewLabel; 
	private GridBagConstraints gbc_lblNewLabel_1; 
	private GridBagConstraints gbc_btnNewButton;
	private JLabel label;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton;
	
	public ReusableClient() {
		iniciar();
	}
	
	private void iniciar()
	{
		setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{40, 0, 40, 0, 90, 0, 30, 0};
		gridBagLayout.rowHeights = new int[]{20, 0, 10, 0, 10, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(ReusableClient.class.getResource("/Resources/Images/icon_user.png")));
		gbc_label = new GridBagConstraints();
		gbc_label.gridheight = 3;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 1;
		add(label, gbc_label);
		
		lblNewLabel = new JLabel("Nombre del Usuario");
		gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Descripcion del Usuario");
		gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 3;
		gbc_lblNewLabel_1.gridy = 3;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		btnNewButton = new JButton("Ver Informacion");
		gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 5;
		gbc_btnNewButton.gridy = 3;
		add(btnNewButton, gbc_btnNewButton);

		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				color = getBackground();
				setBackground(new Color(250,250,190));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				setBackground(color);
			}
		});
	}

}