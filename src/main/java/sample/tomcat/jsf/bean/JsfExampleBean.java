package sample.tomcat.jsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.Date;


@ManagedBean
@SessionScoped
public class JsfExampleBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String value;
	private Date dateValue;
	
	private static java.text.SimpleDateFormat timestampFormat = new java.text.SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");

	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Date getDateValue() {
		return dateValue;
	}
	public void setDateValue(Date dateValue) {
		this.dateValue = dateValue;
	}
	public String getDateValueText() {
		return timestampFormat.format(dateValue);
	}
}