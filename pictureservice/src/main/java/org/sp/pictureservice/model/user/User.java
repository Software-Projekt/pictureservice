package org.sp.pictureservice.model.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//Klasse aus Verteilte Systeme uebernommen
@Entity
@Table(name="user")
@NamedQuery(name="User.findUserByUsername", query="SELECT u from User u where u.username = :username")
			//darauf wird in Z. 16 verwiesen, sonst nirgends genutzt
public class User {

	public static final String FIND_BY_USERNAME = "User.findUserByUsername";
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="user_id")
	@SequenceGenerator(name="user_id", sequenceName="seq_user_id", allocationSize = 1)
	private Long id;
	
	@Column(length=80)
	private String username;
	private String password;
	private String rolle;
	private String sessionID;

	public User(){}

	public boolean logout() {
		
	}
	
	public boolean login() {
		
	}
	
	public boolean clearSID() {
		
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String name) {
		this.username = name;
	}

	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof User){
			User user = (User) obj;
			return user.getUsername().equals(getUsername());
		}
		
		return false;
	}

}
