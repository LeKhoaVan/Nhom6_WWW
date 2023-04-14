package iuh.dhktpm15.btl_www.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "hoa-don")
public class HoaDon {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "ngay-tao")
    private Date ngayTao;

    @Column(name = "gia-tong")
    private double giaTong;

    @OneToOne
    @JoinColumn(name = "id-van-chuyen")
    private ThongTinVanChuyen thongTinVanChuyen;

    @ManyToOne
    @JoinColumn(name = "id-nguoi-dung")
    private NguoiDung nguoiDung;

    @OneToMany(mappedBy = "hoaDon", cascade = CascadeType.ALL)
    private Set<CT_HoaDon> ct_hoaDonSet;

    public HoaDon() {
    }

    public HoaDon(Date ngayTao, double giaTong, ThongTinVanChuyen thongTinVanChuyen, NguoiDung nguoiDung, Set<CT_HoaDon> ct_hoaDonSet) {
        int startId = 100;
        this.id = "HD"+String.format("%05d"+startId++);
        this.ngayTao = ngayTao;
        this.giaTong = giaTong;
        this.thongTinVanChuyen = thongTinVanChuyen;
        this.nguoiDung = nguoiDung;
        this.ct_hoaDonSet = ct_hoaDonSet;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public void setGiaTong(double giaTong) {
        this.giaTong = giaTong;
    }

    public void setThongTinVanChuyen(ThongTinVanChuyen thongTinVanChuyen) {
        this.thongTinVanChuyen = thongTinVanChuyen;
    }

    public void setNguoiDung(NguoiDung nguoiDung) {
        this.nguoiDung = nguoiDung;
    }

    public void setCt_hoaDonSet(Set<CT_HoaDon> ct_hoaDonSet) {
        this.ct_hoaDonSet = ct_hoaDonSet;
    }

    public String getId() {
        return id;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public double getGiaTong() {
        return giaTong;
    }

    public ThongTinVanChuyen getThongTinVanChuyen() {
        return thongTinVanChuyen;
    }

    public NguoiDung getNguoiDung() {
        return nguoiDung;
    }

    public Set<CT_HoaDon> getCt_hoaDonSet() {
        return ct_hoaDonSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HoaDon hoaDon = (HoaDon) o;
        return Objects.equals(id, hoaDon.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "id='" + id + '\'' +
                ", ngayTao=" + ngayTao +
                ", giaTong=" + giaTong +
                ", thongTinVanChuyen=" + thongTinVanChuyen +
                ", nguoiDung=" + nguoiDung +
                ", ct_hoaDonSet=" + ct_hoaDonSet +
                '}';
    }
}
