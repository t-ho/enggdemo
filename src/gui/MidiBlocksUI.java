package gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.ScrollPaneConstants;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import core.AppConstant;

/**
 *
 * @author ToanHo
 */
public class MidiBlocksUI extends JFrame {
	protected JButton btnAddBlock;
	protected JButton btnLoad;
	protected JButton btnChange;
	protected JButton btnSave;
	protected JButton btnSaveConfig;
	protected JButton btnUndo;
	private JButton btnConnect;
	protected JButton[] btnNotes;
	protected JButton btnShiftOneKeyLeft;
	protected JButton btnShiftOneOctaveLeft;
	protected JButton btnShiftOneKeyRight;
	private JButton btnStart;
	private JButton btnStop;
	protected JButton btnShiftOneOctaveRight;
	protected JComboBox<String> cbbMode;
	protected JComboBox<String> cbbScale;
	protected JComboBox<String> cbbInputSource;
	private JLabel lblMode;
	private JLabel lblPerMin;
	private JLabel lblScale;
	private JLabel lblTempo;
	private JLabel lblConfigFile;
	private JLabel lblTotalBlocks;
	private JLabel lblInputSource;
	private JLabel lblMidiFileName;
	private JPanel pnlInfoFirstRow;
	private JPanel pnlInfoSecondRow;
	private JPanel pnlInfoThirdRow; // scpBlockingChain
	protected JPanel pnlBlockingChain;
	private JPanel pnlBottom; // contains pnlPianoKey, pnlKeyboard,
								// pnlEmptyLower
	private JPanel pnlEmptyLower;
	private JPanel pnlPianoKey;
	private JPanel pnlKeyboard;
	private JPanel pnlMiddle; // contains pnlProcessingBlockConfig
	private JPanel pnlProcessingBlockConfig; // contains pnlInfoFirstRow,
												// pnlInfoSecondRow,
												// pnlInfoThirdRow
	private JPanel pnlTop; // contains pnlTopLeft, pnlTopRight
	private JPanel pnlTopLeft; // contains pnlTopLeftTop, pnlTopLeftMiddle,
								// pnlTopLeftBottom
	private JPanel pnlTopLeftBottom;
	private JPanel pnlTopLeftMiddle;
	private JPanel pnlTopRightTop;
	private JPanel pnlTopRightMiddle;
	private JPanel pnlTopRightBottom;
	private JPanel pnlTopLeftTop;
	private JPanel pnlTopRight; // contains pnlTopRightTop, pnlTopRightMiddle,
								// pnlTopRightBottom
	private JScrollPane scpBlockingChain; // contains pnlBlockingChain
	protected JSpinner spnTempo;
	private JToolBar toolBar;
	protected JTextField txfMidiFileName;
	protected JTextField txfConfigFile;
	protected JTextField txfTotalBlocks;
	protected JTextField[] txfKeyboards;

	/**
	 * Creates new form MidiBlocksUI
	 */
	public MidiBlocksUI() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 */
	private void initComponents() {

	}

}
