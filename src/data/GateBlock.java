package data;

import core.AppConstant;

/**
 *
 * @author ToanHo
 */
public class GateBlock extends Block{
	
	private float notesPerTick;
	private String mode;

	public GateBlock(String mode, float notesPerTick) {
	}
	
	@Override
	public void processing() {
		// TODO Auto-generated method stub
		
	}

	public float getNotesPerTick() {
		return notesPerTick;
	}

	public void setNotesPerTick(float notesPerTick) {
		this.notesPerTick = notesPerTick;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

}
