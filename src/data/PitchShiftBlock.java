package data;

import core.AppConstant;

/**
 *
 * @author ToanHo
 */
public class PitchShiftBlock extends Block {

	private int numberOfNotes;
	
	public PitchShiftBlock(int numberOfNotes) {
	}
	
	@Override
	public void processing() {
		// TODO Auto-generated method stub
		
	}

	public int getNumberOfNotes() {
		return numberOfNotes;
	}

	public void setNumberOfNotes(int numberOfNotes) {
		this.numberOfNotes = numberOfNotes;
	}

}
