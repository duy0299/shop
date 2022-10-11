package com.Assignment.shopRookies.Entity;


import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="categories")
public class Categories {
	@Id
	@GeneratedValue
	private UUID id;
	
	@OneToMany(mappedBy = "categories_product_model", cascade = CascadeType.ALL)
	private List<CategoriesProductModel> listCategoriesProductModels;
	
	@ManyToMany(mappedBy = "product_model")
	private List<ProductModel> listModel;
	
	
//	------------------------------------------------------
	@Column(name="parent_categories_id", nullable = true)
	private String parent_categories_id;
	
	@Column(name="name", nullable = false, length = 50)
	private String name;
	
	@Column(name="description", nullable = false, length = 200)
	private String description;

	@Column(name="status", nullable = false)
	private boolean status;

	@Column(name="time_create")
	private Timestamp time_create;

	@Column(name="time_update")
	private Timestamp time_update;
	
	
}
