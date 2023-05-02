package Com.Prince.Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
public static void main(String... args) {
ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
Employee e = (Employee) context.getBean("empl");
System.out.println("Name : "+e.getName());
System.out.println("Id : "+e.getId());
}
}
