package eu.cec.digit.comref.interview.persistent.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ISP")
public class InternetServiceProvider implements Serializable {


	private static final long serialVersionUID = -4292369331387884243L;

	@Id
	@Column(name = "NAME")
	private String name;

	@Column(name = "SPEED")
	private Integer speed;

	@Column(name = "AVAILABLE")
	private Boolean available;
/*
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer value) {
		this.speed = value;
	}

	public Boolean getAvailable() {
			return this.available;
		
	}
	public void setAvailable(Boolean available) {
			this.available = available;

	}
*/
	}
