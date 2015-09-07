package data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import core.AppConstant;

/**
 *
 * @author ToanHo
 */
public class ScaleData {

	 private HashMap<String, List<Scale>> modeMap; // HashMap<mode, listScale>
	
	/**
	 * Constructor with CSV file
	 * @param csvFile Path to CSV file
	 */
	public ScaleData(String csvFile) {
	}
	
	/**
	 * Read data from the CSV file and build a hashmap<mode, listScale>
	 * @param csvFile
	 * @return 
	 */
	private HashMap<String, List<Scale>> buildModeMap(String csvFile) {
		return null;
	}
	
	/**
	 * Takes a line read from CSV file and return a scale
	 * @param line line read from CSV file
	 * @return Scale object
	 */
	private Scale extractScale(String line) {
		return null;
	}

	public HashMap<String, List<Scale>> getModeMap() {
		return modeMap;
	}

	public void setModeMap(HashMap<String, List<Scale>> modeMap) {
		this.modeMap = modeMap;
	}
	
	/**
	 * Get a sorted array of all available modes
	 * @return
	 */
	public String[] getArrayModes() {
		return null;
	}
	
	/**
	 * Get a list of all scales of given mode
	 * @param mode
	 * @return
	 */
	public List<Scale> getListScale(String mode) {
		return modeMap.get(mode);
	}
	
	/**
	 * Get an array of all available scales of the given mode
	 * @param mode
	 * @return
	 */
	public String[] getArrayScales(String mode) {
		return null;
	}
}
