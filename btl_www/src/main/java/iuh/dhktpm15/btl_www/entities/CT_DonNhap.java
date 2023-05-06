package iuh.dhktpm15.btl_www.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "CT_DonNhap")
public class CT_DonNhap {
    @EmbeddedId
    private CTDonNhapKey id;

    @ManyToOne
    @MapsId("idNongSan")
    @JoinColumn(name = "idNongSan")
    private NongSan nongSan;

    @ManyToOne
    @MapsId("idDonNhap")
    @JoinColumn(name = "idDonNhap")
    private DonNhap donNhap;

    @Column(name = "giaNhap")
    private float giaNhap;

    @Column(name = "soLuong")
    private int soLuong;

}
