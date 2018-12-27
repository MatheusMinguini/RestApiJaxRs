package br.ws.ui.dao.implementation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.BeanUtils;

import com.ws.ui.dto.UserDTO;

import br.ws.ui.dao.DAO;
import br.ws.ui.entity.HibernateUtils;
import br.ws.ui.entity.UserEntity;

public class MySQLImplementation implements DAO{
	
	Session session;

	public void openConnection() {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory(); //Get the sessionFactory created by the framework Hibernate
		session = sessionFactory.openSession();
	}

	public UserDTO getuserByUserName(String userName) {
		
		UserDTO userFound = null;
		
		String str = "SELECT * FROM UserEntity u WHERE u.email = :email";
		Query query = session.createQuery(str);
		query.setParameter(":email", userName);
		
		List<UserEntity> resultList = query.getResultList();
		
		if(resultList != null && !resultList.isEmpty()) {
			UserEntity userEntity = resultList.get(0);
			userFound = new UserDTO();
			
			BeanUtils.copyProperties(userEntity, userFound);
		}
		
		return userFound;
	}

	public void closeConnection() {
		if(session != null) {
			session.close();
		}
		
	}

}
