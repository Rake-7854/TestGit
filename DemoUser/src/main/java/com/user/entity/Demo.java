package com.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "demo_tx")
public class Demo implements Comparable<Demo>{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "d_id")
	private Integer id;
	
	@Column(name = "d_name")
	private String name;

	@Override
	public int compareTo(Demo o) {
		return this.name.compareTo(o.name);
	}
	
}
