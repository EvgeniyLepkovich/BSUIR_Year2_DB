package by.bsuir.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Aviatour")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Aviatour {
   @Id
   @Column(name = "aviatourId", nullable = false)
   @GeneratedValue(strategy = GenerationType.AUTO, generator = "aviatour_seq")
   @SequenceGenerator(name = "aviatour_seq", sequenceName = "aviatour_seq")
   private long aviatourId;
   @Column(name = "aviatourStatusId", nullable = false)
   private long aviatourStatusId;
   @Column(name = "aviacompanyId", nullable = false)
   private long aviacompanyId;
   @Column(name = "goalId", nullable = false)
   private long goalId;
   @Column(name = "endDate", nullable = false)
   private Date endDate;
   @Column(name = "name", nullable = false)
   private String name;
   @Column(name = "description", nullable = false)
   private String description;

   @ManyToOne(fetch = FetchType.LAZY, optional = true)
   @JoinColumn(name = "goalId", insertable = false, updatable = false)
   private Goal goal;

   @ManyToOne(fetch = FetchType.LAZY, optional = true)
   @JoinColumn(name = "aviatourStatusId", insertable = false, updatable = false)
   private AviatourStatus aviatourStatus;

   @ManyToOne(fetch = FetchType.LAZY, optional = true)
   @JoinColumn(name = "aviacompanyId", insertable = false, updatable = false)
   private Aviacompany aviacompany;

   @OneToMany(mappedBy = "aviatour", fetch = FetchType.LAZY)
   private List<Flight> flights;

}
