package com.example.hangkhong.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "maybay")
public class MayBay {
    @Id
    @Column(name = "mamb")
    private int maMb;

    @Column
    private String loai;

    @Column(name = "tambay")
    private int tamBay;
}
