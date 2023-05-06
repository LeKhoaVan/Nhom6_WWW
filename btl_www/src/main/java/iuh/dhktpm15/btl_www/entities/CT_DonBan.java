package iuh.dhktpm15.btl_www.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "CT_DonBan")
public class CT_DonBan {

    @EmbeddedId
    private CTDonBanKey key;

    @ManyToOne
    @JoinColumn(name = "idNongSan")
    @MapsId("idNongSan")
    private NongSan nongSan;

    @ManyToOne
    @JoinColumn(name = "idDonBan")
    @MapsId("idDonBan")
    private DonBan donBan;

    @Column(name = "giaBan")
    private float giaNhap;

    @Column(name = "soLuong")
    private int soLuong;
}
