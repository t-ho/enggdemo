package gui;

import java.io.File;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileView;

/**
 * @author ToanHo
 *
 */
public class FileChooserUI extends JFileChooser {
	/**
	 * Construct FileChooserUI
	 * 
	 * @param fileSelectionMode
	 *            (e.g. JFileChooser.FILES_AND_DIRECTORIES)
	 * @param fileExtension
	 *            file extension (e.g. cfg, mid, or mp4)
	 * @param iconPath
	 *            Path to icon
	 * @param decription
	 *            File description (e.g. "Configuration File (.cfg)")
	 */
	public FileChooserUI(int fileSelectionMode, final String fileExtension, final String iconPath,
			final String decription) {
		super();
		this.setFileSelectionMode(fileSelectionMode);
		this.setAcceptAllFileFilterUsed(false);
		this.addChoosableFileFilter(new FileFilter() {

			@Override
			public String getDescription() {
				return decription;
			}

			@Override
			public boolean accept(File f) {
				return false;
			}
		});

		this.setFileView(new FileView() {
			public String getTypeDescription(File f) {
				return null;
			}

			public Icon getIcon(File f) {
				return null;
			}
		});
	}

	/**
	 * Get the file extension
	 * 
	 * @return file extension (lower case), otherwise null
	 */
	private String getFileExtension(File f) {
		return null;
	}

}
