package data;

import java.io.Serializable;
import java.util.List;

/**
 * @author ToanHo
 * 
 */
public class ConfigurationState implements Serializable{

	private String inputSource;
	private String mode;
	private String scale;
	private int tempo;
	private List<Block> blockList;
	
	public ConfigurationState(String inputSource, String mode, String scale, int tempo, List<Block> blockList) {
	}

	public String getInputSource() {
		return inputSource;
	}

	public void setInputSource(String inputSource) {
		this.inputSource = inputSource;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public List<Block> getBlockList() {
		return blockList;
	}

	public void setBlockList(List<Block> blockList) {
		this.blockList = blockList;
	}

}
