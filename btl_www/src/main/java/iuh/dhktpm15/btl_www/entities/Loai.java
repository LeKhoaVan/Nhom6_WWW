package iuh.dhktpm15.btl_www.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Loai")
public class Loai {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "tenLoai")
    private String tenLoai;

    @OneToMany(mappedBy = "loai")
    private List<NongSan> nongSans;
}
