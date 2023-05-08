package iuh.dhktpm15.btl_www.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="NongSan")
public class NongSan {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "tenNongSan")
    private String tenNongSan;

    @Column(name = "hinhAnh")
    private String hinhAnh;

    @Column(name = "dkBaoQuan")
    private String dkBaoQuan;

    @Column(name = "moTa")
    private String moTa;

    @ManyToOne
    @JoinColumn(name = "idLoai")
    private Loai loai;

    @OneToMany(mappedBy = "nongSan", cascade = CascadeType.ALL)
    private List<CT_DonNhap> ctDonNhaps;

    @OneToMany(mappedBy = "nongSan")
    private List<CT_DonBan> ctDonBans;
}
