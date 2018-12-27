package br.ws.ui.dao;

import com.ws.ui.dto.UserDTO;

public interface DAO {

	void openConnection();
	
	UserDTO getuserByUserName(String userName);
	void closeConnection();
	
}
