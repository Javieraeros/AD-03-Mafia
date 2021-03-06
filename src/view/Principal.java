package view;

import java.util.Date;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import factorys.DonFactory;
import model.Don;

public class Principal {

	private static SessionFactory sessionFactory = null;
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		Session session = null;
        try {
            try {
                sessionFactory = DonFactory.getSessionFactory();
                session = sessionFactory.openSession();
 
                System.out.println("Insertando registro");
                Transaction tx = session.beginTransaction();
                
                Don javier=new Don(0,"Javier","Ruiz","El Pajas","Utrera");
        		System.out.println("Nombre:"+javier.getNombre());
        		System.out.println("Apellidos : "+javier.getApellidos());
        		System.out.println("Apodo: "+javier.getApodo());
                session.save(javier);

                tx.commit();
                
                tx=session.beginTransaction();
                System.out.println("Introduce el nuevo apodo");
        		javier.setApodo(teclado.nextLine());
        		System.out.println("Vete al ssms");
        		tx.commit();
        		
                System.out.println("Finalizado...");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } finally {
            session.close();
        }

	}

}
