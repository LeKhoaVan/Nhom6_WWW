package iuh.dhktpm15.btl_www.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "ct-hoadon")
public class CT_HoaDon {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "so-luong")
    private int soLuong;

    @ManyToOne
    @JoinColumn(name = "id-hoadon")
    private HoaDon hoaDon;

    @ManyToOne
    @JoinColumn(name = "id-nongsan")
    private NongSan nongSan;

    public CT_HoaDon() {
    }

    public CT_HoaDon(int soLuong, HoaDon hoaDon, NongSan nongSan) {
        int startId = 100;
        this.id = "CTHD"+String.format("%05d"+startId++);
        this.soLuong = soLuong;
        this.hoaDon = hoaDon;
        this.nongSan = nongSan;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public void setNongSan(NongSan nongSan) {
        this.nongSan = nongSan;
    }

    public String getId() {
        return id;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public NongSan getNongSan() {
        return nongSan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CT_HoaDon ctHoaDon = (CT_HoaDon) o;
        return Objects.equals(id, ctHoaDon.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "CT_HoaDon{" +
                "id='" + id + '\'' +
                ", soLuong=" + soLuong +
                ", hoaDon=" + hoaDon +
                ", nongSan=" + nongSan +
                '}';
    }
}
