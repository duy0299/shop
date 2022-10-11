package com.Assignment.shopRookies.Entity;


import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="role")
public class Role {
	@Id
	@GeneratedValue
	private UUID id;
	
	@OneToMany(mappedBy = "user_info", cascade = CascadeType.ALL)
	private List<UserInfo> listUserinfo;
	
	
//	-------------------------------------------------------------
	@Column(name="name", nullable = false, length = 50)
	private String name;
	
	@Column(name="description", length = 200)
	private String description;

	@Column(name="status", nullable = false)
	private short status;
	
}
