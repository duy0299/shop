package com.Assignment.shopRookies.Entity;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="user_info")
public class UserInfo {
	@Id
	@GeneratedValue
	private UUID id;

	
	@OneToMany(mappedBy = "rating", cascade = CascadeType.ALL)
	private List<Rating> listRatings;
	
	@OneToMany(mappedBy = "feedback", cascade = CascadeType.ALL)
	private List<Feedback> listFeedbacks;
	
	@OneToMany(mappedBy = "wishlist", cascade = CascadeType.ALL)
	private List<Wishlist> listWishlists;
	
	@ManyToMany(mappedBy = "role")
	private List<Role> listRole;
	
	@ManyToOne
	@JoinColumn(name="role_id")
	private Role role;
	
//	---------------------------------------------------------
	@Column(name="first_name", nullable = false, length = 20)
	private String first_name;

	@Column(name="last_name", nullable = false, length = 20)
	private String last_name;

	@Column(name="phone_number", nullable = true, length = 15)
	private String phone_number;

	@Column(name="gender", nullable = false, length = 10)
	private String gender;

	@Column(name="email", nullable = false, length = 50)
	private String email;

	@Column(name="avatar", nullable = true, length = 35)
	private String avatar;

	@Column(name="status", nullable = false)
	private boolean status;

	@Column(name="time_create")
	private Timestamp time_create;

	@Column(name="time_update")
	private Timestamp time_update;
	
	
}
