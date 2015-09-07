package data;

import java.io.Serializable;

/**
 *
 * @author ToanHo
 */
public abstract class Block implements Serializable{

	protected String type;
	public abstract void processing();
	
	public String getType() {
		return type;
	}
}
