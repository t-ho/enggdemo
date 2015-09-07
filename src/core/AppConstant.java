package core;

import java.util.Arrays;
import java.util.List;

import data.ScaleData;

/**
 *
 * @author ToanHo
 */
public class AppConstant {
	public static final String APP_TITILE = "MIDIBlocks - Team 42";
	public static final int NUMBER_OF_NOTES = 15;
	public static final List<String> KEYS_LIST = Arrays.asList("Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "G", "H", "J", "K", "L");
	public static final List<String> OCTAVES = Arrays.asList("1", "2", "3", "4", "5", "6", "7");
	public static final int LEFT = -1;
	public static final int RIGHT = 1;
	public static final int HISTORY_SIZE = 15;
	public static final String CSV_SEPARATOR = ",";
	//public static final String SCALES_CSV_PATH = "src/configFiles/scales.csv";
	
	/* Contains all the available scales that read from CSV file */
	//public static final ScaleData SCALE_DATA = new ScaleData(AppConstant.SCALES_CSV_PATH);
	
	public static final String PITCH_SHIFT = "Pitch Shift";
	public static final String ARPEGGIATOR = "Arpeggiator";
	public static final String MONOPHONIC = "Monophonic";
	public static final String CHORDIFY = "Chordify";
	public static final String GATE = "Gate";
	
	public static final String ASCENDING_SCALE = "Ascending Scale";
	public static final String DESCENDING_SCALE = "Descending Scale";
	public static final String PING_PONG = "Ping Pong";
	public static final String RANDOM = "Random";
	
	public static final String QUEUE = "Queue";
	public static final String FIRST_HOLD = "First Hold";
	public static final String LAST_HOLD = "Last Hold";
	
	public static final String KEYBOARD = "Keyboard";
	public static final String SYSTEM_MIDI_DRIVER = "System Midi Driver";
	public static final String MIDI_FILE = "Midi File";
	
	public static final String CONFIG_FILE_EXTENSION = "mcfg";
	
	
}
