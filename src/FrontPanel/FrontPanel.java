package FrontPanel;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class FrontPanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public FrontPanel() {
		setLayout(null);
		
		JLabel lblItemInformationManager = new JLabel("Item Information Manager");
		lblItemInformationManager.setFont(new Font("Dialog", Font.BOLD, 16));
		lblItemInformationManager.setBounds(244, 12, 248, 28);
		add(lblItemInformationManager);
		
		JLabel lblItemName = new JLabel("Item Name");
		lblItemName.setBounds(30, 50, 83, 15);
		add(lblItemName);
		
		JLabel lblItemClass = new JLabel("Item Class");
		lblItemClass.setBounds(30, 77, 83, 15);
		add(lblItemClass);
		
		JLabel lblItemValue = new JLabel("Item Value");
		lblItemValue.setBounds(30, 104, 83, 15);
		add(lblItemValue);
		
		JLabel lblItemProperty = new JLabel("Item Properties");
		lblItemProperty.setBounds(30, 158, 117, 15);
		add(lblItemProperty);
		
		JLabel lblItemNumber = new JLabel("Item Number");
		lblItemNumber.setBounds(30, 131, 95, 15);
		add(lblItemNumber);
		
		textField = new JTextField();
		textField.setBounds(116, 48, 114, 19);
		add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(115, 72, 117, 24);
		add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setBounds(116, 102, 114, 19);
		add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(244, 100, 77, 19);
		add(comboBox_1);

	}
}
