package core;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import data.ArpeggiatorBlock;
import data.ChordifyBlock;
import data.GateBlock;
import data.MonophonicBlock;
import data.PitchShiftBlock;
import gui.AddingBlockDialogUI;

/**
 * @author ToanHo
 *
 */
public class AddingBlockDialog extends AddingBlockDialogUI{

	private MidiBlocks midiBlocks;

	public AddingBlockDialog(JFrame parent, boolean modal) {
		super(parent, modal);
	}
	
	private void init() {
		
		cbbBlockType.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});

		btnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});

		btnCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
	}

	protected void btnOkActionPerformed(ActionEvent e) {
	}

	protected void btnCancelActionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}

	protected void cbbBlockTypeActionPerformed(ActionEvent e) {
	}

}
