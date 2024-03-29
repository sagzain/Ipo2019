package Presentation;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JSplitPane;
import javax.swing.border.LineBorder;

import Domain.Client;
import Domain.User;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ScrollPaneConstants;

@SuppressWarnings("serial")
public class PanelClients extends JPanel {
	
	private GridBagConstraints gbc_lblInformacionDelCliente;
	private GridBagLayout gbl_panel_4;
	private JLabel lblInformacionDelCliente;
	private JPanel panel;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JSplitPane splitPane;
	private JScrollPane scrollPane_2;
	private JPanel panel_6;
	private JPanel panel_1;
	
	public PanelClients() throws ClassNotFoundException, SQLException {
		setBorder(null);
		setLayout(new GridLayout(1, 0, 0, 0));
		
		splitPane = new JSplitPane();
		splitPane.setDividerSize(1);
		splitPane.setDividerLocation(700);
		splitPane.setEnabled(false);
		splitPane.setContinuousLayout(true);
		splitPane.setBorder(null);
		add(splitPane);
		
		panel_2 = new JPanel();
		splitPane.setRightComponent(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.add(panel_4, BorderLayout.NORTH);
		gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_4.rowHeights = new int[]{30, 0, 30, 0};
		gbl_panel_4.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		lblInformacionDelCliente = new JLabel("Informacion del Cliente");
		lblInformacionDelCliente.setFont(new Font("Tahoma", Font.PLAIN, 19));
		gbc_lblInformacionDelCliente = new GridBagConstraints();
		gbc_lblInformacionDelCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblInformacionDelCliente.gridx = 1;
		gbc_lblInformacionDelCliente.gridy = 1;
		panel_4.add(lblInformacionDelCliente, gbc_lblInformacionDelCliente);
		
		scrollPane_1 = new JScrollPane();
		panel_2.add(scrollPane_1, BorderLayout.CENTER);
		
		panel_1 = new JPanel();
		scrollPane_1.setViewportView(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		splitPane.setLeftComponent(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		panel_3 = new JPanel();
		panel_3.setBorder(null);
		panel.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBorder(null);
		scrollPane_2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel_3.add(scrollPane_2);
		
		panel_6 = new JPanel();
		panel_6.setBorder(null);
		scrollPane_2.setViewportView(panel_6);
		panel_6.setLayout(new GridLayout(1, 0, 0, 0));
		
		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel.add(scrollPane, BorderLayout.CENTER);
		
		panel_5 = new JPanel();
		scrollPane.setViewportView(panel_5);
		panel_5.setLayout(new GridLayout(0, 1, 0, 0));
		
		Client client = new Client();
		ArrayList<Client> client_list = client.getAllClients();
		
		for(int i = 0; i < client_list.size(); i++)
		{
			panel_5.add(new ReusableClient(client_list.get(i)));
		}
		
		for(int i = 1; i <= 2; i++)
		{
			panel_6.add(new ReusableSelection(i, this.getClass().getName()));
		}
		
		panel_1.add(new InfoClient());
	}
}
