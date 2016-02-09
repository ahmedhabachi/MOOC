package entities;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Rating
 *
 */
@Entity

public class Rating implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer note;
	private static final long serialVersionUID = 1L;

	public Rating() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public Integer getNote() {
		return this.note;
	}

	public void setNote(Integer note) {
		this.note = note;
	}
   
}
