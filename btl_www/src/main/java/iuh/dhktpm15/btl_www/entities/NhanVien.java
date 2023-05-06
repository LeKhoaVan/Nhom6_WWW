package iuh.dhktpm15.btl_www.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "NhanVien")
public class NhanVien {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "hoTen")
    private String hoTen;

    @Column(name = "sdt")
    private String sdt;

    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "nhanVien")
    private List<DonNhap> donNhaps;
}
