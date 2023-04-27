package Hibernet.cfg.xml;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Student_name")
public class Student {
     @javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="per_id")
	private int Id;
	private String name;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Student_id")
	private Student id;
	public int getId() {
	return Id;
	}
	public void setId(int Id) {
	this.Id = Id;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	
	public Student getID() {
	return id;
	}
	public void setID(Student id) {
	this.id = id;
	}
	public Student(String name) {
	super();
	this.name = name;
	}
	
	
	}