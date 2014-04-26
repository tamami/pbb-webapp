package lab.aikibo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="REF_PROPINSI")
public class RefPropinsi {
	
	private String kdPropinsi;
	
	public RefPropinsi(String kdPropinsi) {
		this.kdPropinsi = kdPropinsi;
	}

	@Id
	@Column(name="KD_PROPINSI")
	public String getKdPropinsi() {
		return kdPropinsi;
	}

	public void setKdPropinsi(String kdPropinsi) {
		this.kdPropinsi = kdPropinsi;
	}

}
