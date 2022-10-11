package com.Assignment.shopRookies.Entity;

import java.sql.Timestamp;
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
@Table(name="size")
public class Size {
	@Id
	@GeneratedValue
	private UUID id;
	
	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
	private List<Product> listProduct;
	
//	@ManyToMany(mappedBy = "product_model")
//	private List<ProductModel> listModel;

	
//	------------------------------------------------------
	@Column(name="name", nullable = false, length = 50)
	private String name;
	
	@Column(name="status", nullable = false)
	private boolean status;

	@Column(name="time_create")
	private Timestamp time_create;

	@Column(name="time_update")
	private Timestamp time_update;
	
}
