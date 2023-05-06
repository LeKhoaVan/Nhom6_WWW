package iuh.dhktpm15.btl_www.entities;

import jakarta.persistence.*;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "DonBan")
public class DonBan {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "ngayLap")
    private Date ngayLap;

    @Column(name = "diaChiGiao")
    private String diaChiGiao;

    @ManyToOne
    @JoinColumn(name = "nhanVienId")
    private NhanVien nhanVien;

    @ManyToOne
    @JoinColumn(name = "khachHangId")
    private KhachHang khachHang;

    @OneToMany(mappedBy = "donBan")
    private List<CT_DonBan> ctDonBans;
}
