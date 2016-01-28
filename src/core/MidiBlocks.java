//ToanHo
package core;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JSpinner;
import javax.swing.KeyStroke;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import data.Block;
import data.ConfigurationState;
import data.Scale;
import data.ScaleData;
import gui.FileChooserUI;
import gui.MidiBlocksUI;

/**
 *
 * @author ToanHo
 */
public class MidiBlocks extends MidiBlocksUI {

	/* Contains all the available scales that read from CSV file */
	private static ScaleData scaleData; 
	
	/* List of notes including 7 octaves */
	private List<String> listOfNotes;

	/*
	 * current index used on listOfNotes to keep where the notes is displayed on
	 * virtual keyboard
	 */
	private int currentIndex = 0;

	private List<Block> blockList;

	private List<BlockPanel> blockPanelList;

	/* Store configuration's states. The last element is current stage. */
	private List<ConfigurationState> history;

	public MidiBlocks() {

		super();
	}

	private void init() {

		btnSaveConfig.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});

		btnUndo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});

		cbbInputSource.setSelectedIndex(0);
		cbbInputSource.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});

		cbbMode.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cbbModeActionPerformed(e);
			}
		});

		cbbScale.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});


		spnTempo.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
			}
		});
		
		btnLoad.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});

		btnAddBlock.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}

		});

		btnShiftOneOctaveLeft.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});

		btnShiftOneKeyLeft.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});

		btnShiftOneKeyRight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});

		btnShiftOneOctaveRight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
	}

	protected void spnTempoStateChanged(ChangeEvent e) {
	}

	protected void cbbInputSourceActionPerformed(ActionEvent e) {
	}

	protected void btnLoadActionPerformed(ActionEvent e) {
	}

	protected void btnSaveConfigActionPerformed(ActionEvent e) {
	}

	protected void btnUndoActionPerformed(ActionEvent e) {
	}

	protected void btnAddBlockActionPerformed(ActionEvent e) {
	}

	protected void cbbScaleActionPerformed(ActionEvent e) {
	}

	protected void cbbModeActionPerformed(ActionEvent e) {
	}

	protected void btnShiftOneKeyRightActionPerformed(ActionEvent e) {
	}

	protected void btnShiftOneKeyLeftActionPerformed(ActionEvent e) {
	}

	protected void btnShiftOneOctaveLeftActionPerformed(ActionEvent e) {
	}

	protected void btnShiftOneOctaveRightActionPerformed(ActionEvent e) {
	}

	/**
	 * Set virtual keyboard's layout
	 * 
	 * @param listOfNotes
	 *            a list of 15 notes
	 */
	public void setKeyboardLayout(List<String> listOfNotes) {
	}

	/**
	 * Add key binding to a list of buttons
	 * 
	 * @param listOfNotes
	 *            a list of 15 notes
	 */
	public void addKeyBindingToListOfButtons(List<String> listOfNotes) {
	}

	/**
	 * Make key binding to a button
	 * 
	 * @param button
	 *            JButton
	 * @param key
	 *            Character
	 * @param note
	 *            String
	 */
	public void addKeyBindingToButton(final JButton button, String key, final String note) {
		Action keyPressedAction = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		};

		Action keyReleasedAction = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		};
	}

	/**
	 * Remove key binding from a button
	 * 
	 * @param button
	 *            JButton
	 * @param key
	 *            Character
	 */
	public void removeKeyBindingFromButton(JButton button, String key) {
	}

	/**
	 * Enable keyboard input (virtual and physical keyboard)
	 * 
	 * @param listOfNotes
	 * @param enable
	 *            boolean
	 */
	public void setEnabledKeyboardInput(List<String> listOfNotes, boolean enable) {
	}

	/**
	 * Get a list of keyboards
	 * 
	 * @return
	 */
	private List<String> getKeyList() {
		return null;
	}

	/**
	 * Construct a full list of full 7-octave notes
	 * 
	 * @param octaves
	 * @param scale
	 * @return
	 */
	private List<String> constructNoteList(List<String> octaves, List<String> scale) {
		return null;
	}

	/**
	 * Shift the virtual piano keyboard by specified number of notes in given
	 * direction
	 * 
	 * @param direction
	 * @param noOfNotes
	 */
	private void shiftPianoKeyboard(int direction, int noOfNotes) {
	}

	/**
	 * Get the current list notes used to layout the current virtual keyboard
	 * 
	 * @return
	 */
	private List<String> getCurrentListNotes() {
		return null;
	}

	/**
	 * Get current scale
	 * 
	 * @return
	 */
	private Scale getCurrentScale() {
		return null;
	}

	/**
	 * Add new processing block
	 * 
	 * @param block
	 */
	public void addBlock(Block block) {
	}

	/**
	 * Remove a block at given position
	 * 
	 * @param position
	 */
	public void removeBlock(int position) {
	}

	/**
	 * Update block's position after remove one block. Only update from delete
	 * position to the end of the list
	 * 
	 * @param position
	 */
	private void updateBlockPosition(int position) {
	}

	/**
	 * Shift processing block by specified number of blocks in given direction
	 * 
	 * @param direction
	 *            AppConstant.LEFT or AppConstant.Right
	 * @param position
	 *            the position of desired block
	 * @param noOfBlocks
	 *            the number of blocks
	 */
	public void shiftBlock(int direction, int position, int noOfBlocks) {
	}

	private void addStateToHistory() {
	}

	/**
	 * Undo recent action
	 */
	private void undo() {
	}

	/**
	 * Set configuration state
	 * 
	 * @param state
	 */
	private void setConfigState(ConfigurationState state) {
	}

	/**
	 * Set PnlBlockingChain with a specified block list
	 * 
	 * @param blockList
	 *            a list of processing block
	 */
	private void setPnlBlockingChain(List<Block> blockList) {
	}
	
	
	/** Get absolute path of the recent directory 
	 * @return absolute path of the recent directory, otherwise empty string */
	private String getRecentDirectory(String absolutePath) {
		return null;
	}
}
