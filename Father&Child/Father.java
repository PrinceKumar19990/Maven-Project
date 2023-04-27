package MavenProject.cfg.xml;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="father_infor")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Father {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String name;
private String address;
public Father() {
}
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getAddress() {
return address;
}
public void setAddress(String address) {
this.address = address;
}
public Father(int id, String name, String address) {
super();//1st statement first call will be call to super class constructor
this.id = id;
this.name = name;
this.address = address;
}
@Override
public String toString() {
return "Father [id=" + id + ", name=" + name + ", address=" + address + "]";
}
}
