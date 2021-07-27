package com.PFSchool.SchoolApp.Module;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "module")
public class Module {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Module_ID")
	private Integer moduleID;
	
	@Column(name = "module name")
	@NotNull
	private ModuleName moduleName;
	

}
