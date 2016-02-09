package entities;

import java.io.Serializable;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Certificate
 *
 */
@Entity

public class Certificate implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String mode;
	private Double fees;
	private static final long serialVersionUID = 1L;

	public Certificate() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}   
	public Double getFees() {
		return this.fees;
	}

	public void setFees(Double fees) {
		this.fees = fees;
	}
   
}
