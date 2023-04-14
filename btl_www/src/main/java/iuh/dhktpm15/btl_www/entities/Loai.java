package iuh.dhktpm15.btl_www.entities;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "loai")
public class Loai {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "ten-loai")
    private String tenLoai;

    @OneToMany(mappedBy = "loai")
    Set<NongSan> nongSans;

    public Loai() {
    }

    public Loai(String tenLoai) {
        int startId = 100;
        this.id = "l"+String.format("%05d"+startId++);
        this.tenLoai = tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public String getId() {
        return id;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public Set<NongSan> getNongSans() {
        return nongSans;
    }

    public void setNongSans(Set<NongSan> nongSans) {
        this.nongSans = nongSans;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Loai loai = (Loai) o;
        return Objects.equals(id, loai.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Loai{" +
                "id='" + id + '\'' +
                ", tenLoai='" + tenLoai + '\'' +
                ", nongSans=" + nongSans +
                '}';
    }
}
