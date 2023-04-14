package iuh.dhktpm15.btl_www.entities;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "nong-san")
public class NongSan {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "ten")
    private String ten;

    @Column(name = "dk-bao-quan")
    private String dkBaoQuan ;

    @Column(name = "gia")
    private double gia;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id-loai")
    private Loai loai;

    @OneToMany(mappedBy = "nongSan")
    private Set<CT_HoaDon> ct_hoaDonSet;

    public NongSan() {
    }

    public NongSan(String ten, String dkBaoQuan, double gia, Loai loai, Set<CT_HoaDon> ct_hoaDonSet) {
        int startId = 100;
        this.id = "NS"+String.format("%05d"+startId++);
        this.ten = ten;
        this.dkBaoQuan = dkBaoQuan;
        this.gia = gia;
        this.loai = loai;
        this.ct_hoaDonSet = ct_hoaDonSet;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDkBaoQuan(String dkBaoQuan) {
        this.dkBaoQuan = dkBaoQuan;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public void setLoai(Loai loai) {
        this.loai = loai;
    }

    public void setCt_hoaDonSet(Set<CT_HoaDon> ct_hoaDonSet) {
        this.ct_hoaDonSet = ct_hoaDonSet;
    }

    public String getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public String getDkBaoQuan() {
        return dkBaoQuan;
    }

    public double getGia() {
        return gia;
    }

    public Loai getLoai() {
        return loai;
    }

    public Set<CT_HoaDon> getCt_hoaDonSet() {
        return ct_hoaDonSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NongSan nongSan = (NongSan) o;
        return Objects.equals(id, nongSan.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "NongSan{" +
                "id='" + id + '\'' +
                ", ten='" + ten + '\'' +
                ", dkBaoQuan='" + dkBaoQuan + '\'' +
                ", gia=" + gia +
                ", loai=" + loai +
                ", ct_hoaDonSet=" + ct_hoaDonSet +
                '}';
    }
}
