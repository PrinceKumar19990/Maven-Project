package Hibernate.cfg.xml2;

import org.hibernate.Session;
import org.hibernate.Transaction;
public class MainApp {
public static void main(String[] args) {
Person deepak = new Person("deepak kumar","Delhi");
Adhaar ada = new Adhaar(71122345);
deepak.setAdhar(ada);
Transaction txn;
try(Session session=HibernateUtil.getSessionFactory().openSession()){
txn = session.beginTransaction();
session.save(deepak);
txn.commit();
txn=session.beginTransaction();
Adhaar Prince= session.get(Adhaar.class, 0);
Prince.setAdhaarNum(0);
}
}
}
