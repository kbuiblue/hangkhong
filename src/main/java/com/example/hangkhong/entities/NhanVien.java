package com.example.hangkhong.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "nhanvien")
public class NhanVien {
    @Id
    @Column(name = "manv")
    private String maNv;

    @Column
    private String ten;

    @Column
    private int luong;
}
