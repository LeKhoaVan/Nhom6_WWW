package iuh.dhktpm15.btl_www.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tai-khoan")
public class TaiKhoan {
    @Id
    @Column(name = "id",nullable = false, unique = true)
    private String id;

    @Column(name = "so-dt",nullable = false, unique = true, length = 10)
    private String soDT;

    @Column(name = "password",nullable = false,length = 50)
    private String password;

    public TaiKhoan() {
    }

    public TaiKhoan(String soDT, String password) {
        int startId = 100;
        this.id = "TK"+String.format("%05d"+startId++);
        this.soDT = soDT;
        this.password = password;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getSoDT() {
        return soDT;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaiKhoan taiKhoan = (TaiKhoan) o;
        return Objects.equals(id, taiKhoan.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "TaiKhoan{" +
                "id='" + id + '\'' +
                ", soDT='" + soDT + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
