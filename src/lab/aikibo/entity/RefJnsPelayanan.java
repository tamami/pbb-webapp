package lab.aikibo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="REF_JNS_PELAYANAN")
public class RefJnsPelayanan {
	
	private String kdJnsPelayanan;
	private String nmJenisPelayanan;
	
	@Id
	@Column(name="KD_JNS_PELAYANAN")
	public String getKdJnsPelayanan() {
		return kdJnsPelayanan;
	}
	
	public void setKdJnsPelayanan(String kdJnsPelayanan) {
		this.kdJnsPelayanan = kdJnsPelayanan;
	}

	@Column(name="NM_JENIS_PELAYANAN")
	public String getNmJenisPelayanan() {
		return nmJenisPelayanan;
	}

	public void setNmJenisPelayanan(String nmJenisPelayanan) {
		this.nmJenisPelayanan = nmJenisPelayanan;
	}

}
