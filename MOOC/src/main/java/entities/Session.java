package entities;

import java.io.Serializable;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;





/**
 * Entity implementation class for Entity: Session
 *
 */
@Entity
public class Session implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Date duration;
	private Boolean certified;
	private Date startDate;
	private Date dateToBeAnnonced;
	private String description;
	private String picture;
	private String requirement;
	private String videos;
	private String name;
	private LearningMaterial material;
	private static final long serialVersionUID = 1L;
	public Session() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public Date getDuration() {
		return this.duration;
	}

	public void setDuration(Date duration) {
		this.duration = duration;
	}   
	public Boolean getCertified() {
		return this.certified;
	}

	public void setCertified(Boolean certified) {
		this.certified = certified;
	}   
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}   
	public Date getDateToBeAnnonced() {
		return this.dateToBeAnnonced;
	}

	public void setDateToBeAnnonced(Date dateToBeAnnonced) {
		this.dateToBeAnnonced = dateToBeAnnonced;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}   
	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}   
	public String getRequirement() {
		return this.requirement;
	}

	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}   
	public String getVideos() {
		return this.videos;
	}

	public void setVideos(String videos) {
		this.videos = videos;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@OneToMany
	public LearningMaterial getMaterial() {
		return material;
	}
	public void setMaterial(LearningMaterial material) {
		this.material = material;
	}

   
	
}
