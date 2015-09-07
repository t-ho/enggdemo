package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.TransferHandler;

import core.AppConstant;
import core.MidiBlocks;
import data.ArpeggiatorBlock;
import data.Block;
import data.ChordifyBlock;
import data.GateBlock;
import data.MonophonicBlock;
import data.PitchShiftBlock;

/**
 *
 * @author ToanHo
 */
public class BlockPanelUI extends javax.swing.JPanel {

	protected JButton btnDelete;
	private JButton btnEdit;
	protected JButton btnShiftLeft;
	protected JButton btnShiftRight;
	protected JLabel lblBlockName;
	protected JLabel lblParameter1;
	protected JLabel lblParameter2;
	protected JLabel lblInfo;
	protected JLabel lblOrdinalNumber;



	/**
	 * Creates new form BlockPanelUI
	 */
	public BlockPanelUI() {
		initComponents();
	}

	/**
	 * Sets background for panel
	 */
	/*
	 * @Override public void paintComponent(Graphics g) {
	 * super.paintComponents(g); ImageIcon icon = new
	 * ImageIcon(getClass().getResource("/icons/blue_180x130.png"));
	 * setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
	 * g.drawImage(icon.getImage(), 0 , 0, this); }
	 */

	/**
	 * This method is called from within the constructor to initialize the form.
	 */
	private void initComponents() {
	}

}
