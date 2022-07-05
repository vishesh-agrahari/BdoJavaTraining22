package Buisness_logic;

import java.util.List;
import java.util.Scanner;

import entity.Product;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import SessionFactoryDemo.HibernateUtil;

public class ProductRepo {

	static Session session = null;
	static Transaction trans = null;
	static SessionFactory sessionfactory = null;

	// logic part create product or add product
	public static void createProduct() {
		session = HibernateUtil.getSessionFactory().openSession();// obtain the session for insert operations
		trans = session.beginTransaction();// start transaction
		Scanner sc = new Scanner(System.in);
		System.out.println("Product name: > ");
		   String name = sc.nextLine();
		   System.out.println("description: > ");
		   String desc = sc.nextLine();
		   System.out.println("color: > ");
		   String color = sc.nextLine();
		  Product p = new Product(name,desc,color);
		session.save(p);// this equivalent to "insert into table value()
		System.out.println("inserted Successfully");
		trans.commit();
		session.close();

	}

	// view product
	public static void viewProduct() {
		session = HibernateUtil.getSessionFactory().openSession();
		trans = session.beginTransaction();
		 Query query = session.createQuery("from Product");
		  List<Product> products = query.list();
		  for(Product p : products)
		  {
		System.out.println("Product name: "+p.getName()+", description: "+p.getDescription()+", Color: "+p.getColor());
		  }
		  trans.commit();
			session.close();

	}

	// update product
	public static void updateProduct() {
		session = HibernateUtil.getSessionFactory().openSession();
		trans = session.beginTransaction();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id : >");
		   long ID = sc.nextLong();
		Product product = (Product) session.get(Product.class, ID);
		System.out.println("Enter new color : >");
		String color = sc.next();
		product.setColor(color);
		System.out.println("Enter new description : >");
		String desc = sc.next();
		product.setDescription(desc);
		System.out.println("Updated Successfully");
		  trans.commit();
			session.close();

	}

// delete product
	public static void deleteProduct() {
		session = HibernateUtil.getSessionFactory().openSession();
		trans = session.beginTransaction();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id to delete : >");
		   long ID = sc.nextLong();
		Product product = (Product) session.get(Product.class, ID);
		session.delete(product);
		System.out.println("Updated Successfully");
		  trans.commit();
			session.close();

	}
}
	   