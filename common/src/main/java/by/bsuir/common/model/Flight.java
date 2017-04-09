package by.bsuir.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Flight")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Flight
{
   @Id
   @Column(name = "flightId", nullable = false)
   @GeneratedValue(strategy = GenerationType.AUTO, generator = "flight_seq")
   @SequenceGenerator(name = "flight_seq", sequenceName = "flight_seq")
   private long flightId;
   @Column(name = "aviatourId", nullable = false)
   private long aviatourId;
   @Column(name = "aircraftId", nullable = false)
   private long aircraftId;
   @Column(name = "date", nullable = false)
   private Date date;

   @ManyToOne(fetch = FetchType.LAZY, optional = true)
   @JoinColumn(name = "aviatourId", insertable = false, updatable = false)
   private Aviatour aviatour;

   @ManyToOne(fetch = FetchType.LAZY, optional = true)
   @JoinColumn(name = "aircraftId", insertable = false, updatable = false)
   private Aircraft aircraft;

   @OneToMany(mappedBy = "flight", fetch = FetchType.LAZY)
   private List<Ticket> tickets;
}
