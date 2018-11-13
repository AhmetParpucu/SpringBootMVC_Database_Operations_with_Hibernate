package com.ahmet.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ahmet.springdemo.entity.Student;

@Repository // Data Access Object'te veri tabanindan data almak için DAO'ya eklenmelidir.
public class StudentDAOImpl implements StudentDAO{

	@Autowired // Nesneyi new keyword'u ile bizim olusturmamiza gerek kalmadan arka planda dependency islemi gerceklestirilir. Yoksa NullPointerException hatası almamiza neden olur.
	private SessionFactory sessionFactory; // (oturum anlamına gelmektedir) Hibernate ile calismaya baslamak için gerekli olan nesne.
	
	@Override
	public List<Student> getStudents() {
		
		Session currentSession = sessionFactory.getCurrentSession(); // Uygulama ile veritabani arasinda fiziksel bir connection acarak, bu connection uzerinden veritabani uzerinde select, insert, update, delete islemlerinin yapilmasini saglar.
		Query<Student> theQuery = currentSession.createQuery("from Student", Student.class); // Butun student listesini almaya yarar.
		
		List<Student> students = theQuery.getResultList(); // Query ile cekilen butun nesneleri listeye ekler.
		
		return students;
	}
	
	@Override
	public void saveStudent(Student theStudent) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.saveOrUpdate(theStudent);
	}

	@Override
	public Student getStudents(int theID) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Student theStudent = currentSession.get(Student.class,theID);
		
		return theStudent;
	}

	@Override
	public void deleteStudent(int theID) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query theQuery = currentSession.createQuery("delete from Student where id=:studentID");
		theQuery.setParameter("studentID", theID);
		
		theQuery.executeUpdate();
	}
}















