package com.example.hangkhong.entities;

import com.example.hangkhong.dto.CountChungNhanDTO;
import com.example.hangkhong.dto.CountPhiCongDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@NamedNativeQueries({
        @NamedNativeQuery(name = "ChungNhan.getChungNhanByMaChungNhan",
                query = "SELECT * FROM chungnhan WHERE machungnhan = :machungnhan",
                resultClass = ChungNhan.class),
        @NamedNativeQuery(name = "ChungNhan.getAllChungNhanByMaMb",
                query = "SELECT * FROM chungnhan WHERE mamb = :mamb",
                resultClass = ChungNhan.class),
        @NamedNativeQuery(name = "ChungNhan.getAllChungNhanByMaNv",
                query = "SELECT * FROM chungnhan WHERE manv LIKE :manv",
                resultClass = ChungNhan.class),
        @NamedNativeQuery(name = "countChungNhanPerNhanVien",
                query = "SELECT manv AS manv, COUNT(mamb) AS sochungnhan FROM chungnhan GROUP BY manv",
                resultSetMapping = "countChungNhanPerNhanVienResult"),
        @NamedNativeQuery(name = "countChungNhanPerMaMb", query = "SELECT mamb AS mamb, COUNT(mamb) AS sophicong FROM chungnhan GROUP BY mamb HAVING mamb = :mamb",
                resultSetMapping = "countChungNhanPerMaMbResult")

})

@SqlResultSetMappings({
        @SqlResultSetMapping(name = "countChungNhanPerNhanVienResult",
                classes = {
                        @ConstructorResult(
                                targetClass = CountChungNhanDTO.class,
                                columns = {
                                        @ColumnResult(name = "manv", type = String.class),
                                        @ColumnResult(name = "sochungnhan", type = Long.class)
                                }
                        )
                }
        ),
        @SqlResultSetMapping(name = "countChungNhanPerMaMbResult",
                classes = {
                        @ConstructorResult(
                                targetClass = CountPhiCongDTO.class,
                                columns = {
                                        @ColumnResult(name = "mamb", type = Integer.class),
                                        @ColumnResult(name = "sophicong", type = Long.class)
                                }
                        )
                }
        )
})


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
