package Hibernet.cfg.xml;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
	@Table(name="ID_num")
public class ID {
	@javax.persistence.Id
	@Column(name="Student_id")
	private int Id;
	private int id_num;
	public int getAdhaarNum() {
	return id_num;
	}
	public void setAdhaarNum(int id_num) {
	this.id_num = id_num;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
	this.Id = Id;
	}
	public ID(int Id) {
	super();
	this.Id=Id;
	}
	}
