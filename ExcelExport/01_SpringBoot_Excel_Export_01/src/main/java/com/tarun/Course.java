package com.tarun;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
//@Table(name="COURS")
public class Course {
	
	@Id
	private Integer cid;
	private String name;
	private Double price;

}
