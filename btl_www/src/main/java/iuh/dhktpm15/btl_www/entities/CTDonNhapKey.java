package iuh.dhktpm15.btl_www.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CTDonNhapKey implements Serializable{
    @Column(name = "idNongSan")
    private String idNongSan;

    @Column(name = "idDonNhap")
    private String idDonNhap;

    public CTDonNhapKey(){
    }

    public CTDonNhapKey(String idNongSan, String idDonNhap){
        this.idDonNhap = idDonNhap;
        this.idNongSan = idNongSan;
    }

    public String getIdNongSan() {
        return idNongSan;
    }

    public void setIdNongSan(String idNongSan) {
        this.idNongSan = idNongSan;
    }

    public String getIdDonNhap() {
        return idDonNhap;
    }

    public void setIdDonNhap(String idDonNhap) {
        this.idDonNhap = idDonNhap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CTDonNhapKey that = (CTDonNhapKey) o;
        return Objects.equals(idNongSan, that.idNongSan) && Objects.equals(idDonNhap, that.idDonNhap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNongSan, idDonNhap);
    }
}
