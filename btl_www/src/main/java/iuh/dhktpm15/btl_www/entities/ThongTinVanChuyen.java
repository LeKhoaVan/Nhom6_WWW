package iuh.dhktpm15.btl_www.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "thong-tin-van-chuyen")
public class ThongTinVanChuyen {
    @Id
    @Column(name = "id",nullable = false, unique = true)
    private String id;

    @Column(name = "dia-chi-nhan",nullable = false, length = 25)
    private String diaChiNhan;

    @Column(name = "thoi-gian-nhan")
    private Date thoiGianNhan;

    @Column(name = "thoi-gian-giao")
    private Date thoiGianGiao;

    @Column(name = "trang-thai",nullable = false,length = 2)
    private boolean trangThai;

    @Column(name = "yeu-cau",nullable = true)
    private String yeuCau;

    public ThongTinVanChuyen() {
    }

    public ThongTinVanChuyen(String diaChiNhan, Date thoiGianNhan, Date thoiGianGiao, boolean trangThai, String yeuCau) {
        int startId = 100;
        this.id = "VC"+String.format("%05d",startId++);
        this.diaChiNhan = diaChiNhan;
        this.thoiGianNhan = thoiGianNhan;
        this.thoiGianGiao = thoiGianGiao;
        this.trangThai = trangThai;
        this.yeuCau = yeuCau;
    }

    public void setDiaChiNhan(String diaChiNhan) {
        this.diaChiNhan = diaChiNhan;
    }

    public void setThoiGianNhan(Date thoiGianNhan) {
        this.thoiGianNhan = thoiGianNhan;
    }

    public void setThoiGianGiao(Date thoiGianGiao) {
        this.thoiGianGiao = thoiGianGiao;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public void setYeuCau(String yeuCau) {
        this.yeuCau = yeuCau;
    }

    public String getId() {
        return id;
    }

    public String getDiaChiNhan() {
        return diaChiNhan;
    }

    public Date getThoiGianNhan() {
        return thoiGianNhan;
    }

    public Date getThoiGianGiao() {
        return thoiGianGiao;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public String getYeuCau() {
        return yeuCau;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ThongTinVanChuyen that = (ThongTinVanChuyen) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    @Override
    public String toString() {
        return "ThongTinVanChuyen{" +
                "id='" + id + '\'' +
                ", diaChiNhan='" + diaChiNhan + '\'' +
                ", thoiGianNhan=" + thoiGianNhan +
                ", thoiGianGiao=" + thoiGianGiao +
                ", trangThai=" + trangThai +
                ", yeuCau='" + yeuCau + '\'' +
                '}';
    }
}
