package com.example.hangkhong.entities;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "chuyenbay")
public class ChuyenBay {
    @Id
    @Column(name = "macb")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maCb;

    @Column(name = "gadi")
    private String gaDi;

    @Column(name = "gaden")
    private String gaDen;

    @Column(name = "dodai")
    private int doDai;

    @Column(name = "giodi")
    private LocalTime gioDi;

    @Column(name = "gioden")
    private LocalTime gioDen;

    @Column(name = "chiphi")
    private int chiPhi;
}
