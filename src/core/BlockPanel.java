package core;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.TransferHandler;

import data.ArpeggiatorBlock;
import data.Block;
import data.ChordifyBlock;
import data.GateBlock;
import data.MonophonicBlock;
import data.PitchShiftBlock;
import gui.BlockPanelUI;

/**
 * @author ToanHo
 *
 */
public class BlockPanel extends BlockPanelUI{

	private MidiBlocks midiBlocks;
	private int position;
	private static int sourcePosition;

	public BlockPanel(MidiBlocks midiBlocks, Block block, int position) {
		super();
	}
	
	private void init() {
		
		btnDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});

		btnShiftLeft.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});

		btnShiftRight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});

		MouseListener ml = new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
			}

		};

		lblInfo.addMouseListener(ml);

		TransferHandler handler = new TransferHandler("icon") {
			@Override
			public boolean importData(TransferSupport support) {
				return false;
			}

		};

	}

	protected void btnShiftRightActionPerformed(ActionEvent e) {
	}

	protected void btnShiftLeftActionPerformed(ActionEvent e) {
	}

	protected void btnDeleteActionPerformed(ActionEvent e) {
	}

	/**
	 * Set Pitch Shift Block's information on BlockPanelUI
	 * 
	 * @param pSBlock
	 * @param position
	 */
	private void setPitchShiftBlockInfo(PitchShiftBlock pSBlock, int position) {
	}

	/**
	 * Set Arpeggiator block's information on BlockPanelUI
	 * 
	 * @param aBlock
	 * @param position
	 */
	private void setArpeggiatorBlockInfo(ArpeggiatorBlock aBlock, int position) {
	}

	/**
	 * Set Monophic Block's information on BlockPanelUI
	 * 
	 * @param mBlock
	 * @param position
	 */
	private void setMonophicBlockInfo(MonophonicBlock mBlock, int position) {
	}

	/**
	 * Set Chordify Block's information on BlockPanelUI
	 * 
	 * @param cBlock
	 * @param position
	 */
	private void setChordifyBlockInfo(ChordifyBlock cBlock, int position) {
	}

	/**
	 * Set Gate Block's information on BlockPanelUI
	 * 
	 * @param gBlock
	 * @param position
	 */
	private void setGateBlockInfo(GateBlock gBlock, int position) {
	}

	/**
	 * Set Block's info on BlockPanelUI
	 * 
	 * @param block
	 * @param position
	 */
	public void setBlockInfo(Block block, int position) {
	}

	/**
	 * Set position for BlockPanel
	 * 
	 * @param position
	 */
	public void setPosition(int position) {
	}

	public void setBlockName(String blockName) {
	}
}
