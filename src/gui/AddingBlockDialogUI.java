package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import core.AppConstant;
import core.MidiBlocks;
import data.ArpeggiatorBlock;
import data.ChordifyBlock;
import data.GateBlock;
import data.MonophonicBlock;
import data.PitchShiftBlock;

/**
 *
 * @author ToanHo
 */
public class AddingBlockDialogUI extends JDialog {

	protected JButton btnCancel;
	protected JButton btnOk;
	protected JComboBox<String> cbbBlockType;
	protected JComboBox<String> cbbGateMode;
	protected JComboBox<String> cbbPattern;
	private JSeparator jSeparator1;
	private JLabel lblBlockType;
	private JLabel lblFirstParameter;
	private JLabel lblSecondParameter;
	private JPanel pnlMain;
	private JPanel pnlBottom;
	private JPanel pnlFirstParameter;
	private JPanel pnlSecondParameter;
	private JPanel pnlTop;
	protected JFormattedTextField txfNoOfNotes;
	protected JFormattedTextField txfNotesPerTick;
	protected JLabel lblStatus;

	public AddingBlockDialogUI(JFrame parent, boolean modal) {
		super(parent, modal);
	}

	private void initComponents() {
	}

	protected void showPitchShiftBlock() {
	}

	protected void showArpeggiatorBlock() {
	}

	protected void showMonophonicBlock() {
	}

	protected void showChordifyBlock() {
	}

	protected void showGateBlock() {
	}
}
