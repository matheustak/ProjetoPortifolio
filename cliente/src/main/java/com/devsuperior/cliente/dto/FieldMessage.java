/**
 * 
 */
package com.devsuperior.cliente.dto;

/**
 * @author matheus
 *
 */
public class FieldMessage {
	
	private String fieldName;
	private String menssage;
	private String path;
	
	public FieldMessage(String fieldName, String menssage, String path) {
		super();
		this.fieldName = fieldName;
		this.menssage = menssage;
		this.path = path;
	}

	public String getFieldName() {
		return fieldName;
	}

	public String getMenssage() {
		return menssage;
	}
	
	public String getPath() {
		return path;
	}
	
	

}
