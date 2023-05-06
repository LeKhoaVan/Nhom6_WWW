package iuh.dhktpm15.btl_www.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class CTDonBanKey {
    @Column(name = "idNongSan")
    private String idNongSan;

    @Column(name = "idDonBan")
    private String idDonBan;

    public CTDonBanKey(){}

    public CTDonBanKey(String idNongSan, String idDonBan){
        this.idDonBan = idDonBan;
        this.idNongSan = idNongSan;
    }

    public String getIdNongSan() {
        return idNongSan;
    }

    public void setIdNongSan(String idNongSan) {
        this.idNongSan = idNongSan;
    }

    public String getIdDonBan() {
        return idDonBan;
    }

    public void setIdDonBan(String idDonBan) {
        this.idDonBan = idDonBan;
    }
}
