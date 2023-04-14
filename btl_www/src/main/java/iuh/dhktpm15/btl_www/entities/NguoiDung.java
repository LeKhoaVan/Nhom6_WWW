package iuh.dhktpm15.btl_www.entities;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "nguoi-dung")
public class NguoiDung {
    @Id
    @Column(name = "id",nullable = false, unique = true)
    private String id;

    @Column(name = "ho-ten",nullable = false)
    private String hoTen;

    @Column(name = "dia-chi",nullable = false)
    private String diaChi;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id-tai-khoan")
    private TaiKhoan taiKhoan;

    @OneToMany(mappedBy = "nguoiDung", cascade = CascadeType.ALL)
    private Set<HoaDon> hoaDons;


    public NguoiDung() {
    }

    public NguoiDung(String hoTen, String diaChi, TaiKhoan taiKhoan, Set<HoaDon> hoaDons) {
        int startId = 100;
        this.id = "ND"+String.format("%05d"+startId++);
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.taiKhoan = taiKhoan;
        this.hoaDons = hoaDons;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setTaiKhoan(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public void setHoaDons(Set<HoaDon> hoaDons) {
        this.hoaDons = hoaDons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NguoiDung nguoiDung = (NguoiDung) o;
        return Objects.equals(id, nguoiDung.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "NguoiDung{" +
                "id='" + id + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", taiKhoan=" + taiKhoan +
                ", hoaDons=" + hoaDons +
                '}';
    }
}
