package br.com.medicamento.utility;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class Message {

	public static void info(String string) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, string , null);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}
	
	public static void erro(String string) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, string , null);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}
}
