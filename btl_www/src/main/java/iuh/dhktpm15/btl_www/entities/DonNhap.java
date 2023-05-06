package iuh.dhktpm15.btl_www.entities;

import jakarta.persistence.*;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name = "DonNhap")
public class DonNhap {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "ngayLap")
    private Date date;

    @Column(name = "diaChiGiao")
    private String diaChiGiao;

    @OneToMany(mappedBy = "donNhap", cascade = CascadeType.ALL)
    private List<CT_DonNhap> ctDonNhaps;

    @ManyToOne
    @JoinColumn(name = "idNhanVien")
    private NhanVien nhanVien;

}
