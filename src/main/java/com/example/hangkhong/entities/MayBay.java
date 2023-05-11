package com.example.hangkhong.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@NamedQueries({
        @NamedQuery(name = "MayBay.getAllMayBay", query = "FROM MayBay"),
        @NamedQuery(name = "MayBay.getAllBoeing", query = "FROM MayBay WHERE loai LIKE 'Boeing%'"),
        @NamedQuery(name = "MayBay.getAllAirbus", query = "FROM MayBay WHERE loai LIKE 'Airbus%'"),
        @NamedQuery(name = "MayBay.getAllOther", query = "FROM MayBay WHERE loai NOT LIKE 'Boeing%'" +
                " AND loai NOT LIKE 'Airbus%'"),
        @NamedQuery(name = "MayBay.getMayBayById", query = "FROM MayBay WHERE maMb = :maMb")
})

@Table(name = "maybay")
public class MayBay {
    @Id
    @Column(name = "mamb")
    private Integer maMb;

    @Column
    private String loai;

    @Column(name = "tambay")
    private int tamBay;
}
