package by.bsuir.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "AviatourStatus")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AviatourStatus {
    @Id
    @Column(name = "aviatourStatusId", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "aviatour_status_seq")
    @SequenceGenerator(name = "aviatour_status_seq", sequenceName = "aviatour_status_seq")
    private long aviatourStatusId;
    @Column(name = "status", nullable = false)
    private String status;

    @OneToMany(mappedBy = "aviatourStatus", fetch = FetchType.LAZY)
    private List<Aviatour> aviatours;
}
