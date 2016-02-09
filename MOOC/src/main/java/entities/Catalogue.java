package entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Catalogue
 *
 */
@Entity

public class Catalogue implements Serializable {

	
	private Integer id;
	private String name;
	private String picture;
	private List<Categorie>categories;
	private static final long serialVersionUID = 1L;

	public Catalogue() {
		super();
	}  
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}
	@OneToMany(mappedBy="catalogue")
	public List<Categorie> getCategories() {
		return categories;
	}
	public void setCategories(List<Categorie> categories) {
		this.categories = categories;
	}
   
}
