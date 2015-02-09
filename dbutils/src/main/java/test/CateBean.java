package test;

import java.io.Serializable;

public class CateBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String lineName;
	private String lineNameEn;
	
	
	public String getLineName() {
		return lineName;
	}
	public void setLineName(String lineName) {
		this.lineName = lineName;
	}
	public String getLineNameEn() {
		return lineNameEn;
	}
	public void setLineNameEn(String lineNameEn) {
		this.lineNameEn = lineNameEn;
	}
	
	
	
	

}
