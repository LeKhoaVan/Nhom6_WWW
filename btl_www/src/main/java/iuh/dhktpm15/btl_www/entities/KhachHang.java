package iuh.dhktpm15.btl_www.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "KhachHang")
public class KhachHang {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "hoTen")
    private String hoTen;

    @Column(name = "sdt")
    private String sdt;

    @Column(name = "password")
    private String password;
}
