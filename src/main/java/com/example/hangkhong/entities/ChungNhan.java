package com.example.hangkhong.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "chungnhan")
public class ChungNhan {
    @Id
    @Column(name = "machungnhan")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maChungNhan;

    @ManyToOne
    @JoinColumn(name = "manv")
    private NhanVien maNv;

    @ManyToOne
    @JoinColumn(name = "mamb")
    private MayBay maMb;
}
