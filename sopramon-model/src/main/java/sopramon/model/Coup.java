package sopramon.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Coup {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COUP_ID")
	private int coupid;

	@Temporal(TemporalType.TIMESTAMP)
	private Date date;

	@Column(name = "COUP_DEGATS", length = 50, nullable = false)
	@NotEmpty
	@Size(max = 50)
	private int degats;

	@Column(name = "COUP_PERSISTANCE", length = 50, nullable = false)
	@NotEmpty
	@Size(max = 50)
	private int peristance;

	// CLE ETRANGERE

	private int sopramonid;

	// CLE ETRANGERE
	private int combatid;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getDegats() {
		return degats;
	}

	public void setDegats(int degats) {
		this.degats = degats;
	}

}
