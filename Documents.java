package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "documentstable")
public class Documents  extends BaseEntity{
	
	@Column(name = "panNo",length = 50)
	private String panNo;
	
	@Column(name = "panPhoto")
	private String panPhoto;
	
	@Column(name = "aadharNo",length = 12)
	private String aadharNo;
	
	@Column(name = "aadharPhoto")
	private String aadharPhoto;
	
	@Column(name = "fsaiiNo",length = 14)
	private String fsaiiNo;
	
	@Column(name = "fsaiiPhoto")
	private String fsaiiPhoto;
	
	@Column(name = "hotelphoto")
	private String hotelPhoto;
	
	
	
	
	

}
