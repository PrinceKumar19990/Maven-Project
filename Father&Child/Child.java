package MavenProject.cfg.xml;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="child_infor")
public class Child extends Father{
private String email;
public String getEmail() {
return email;
}
public void setEmail(String email) {
this.email = email;
}
public Child(int id, String name, String address, String email) {
super(id, name, address);
this.email = email;
}
public Child() {
super();
// TODO Auto-generated constructor stub
}
@Override
public String toString() {
return "Child [email=" + email + "]";
}
}
