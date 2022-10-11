package com.Assignment.shopRookies.Entity;

import java.sql.Timestamp;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="password")
public class UserPassword {
//	OK???? 
	@Id
	@GeneratedValue
	private UUID user_id;
	
	@OneToOne
    @JoinColumn(name = "user_id")
	private UserInfo userInfo;
	
	
	@Column(name="password", nullable = false, length = 30)
	private String password;
	
	@Column(name="time_create")
	private Timestamp time_create;

	@Column(name="time_update")
	private Timestamp time_update;
	
	
	
}
