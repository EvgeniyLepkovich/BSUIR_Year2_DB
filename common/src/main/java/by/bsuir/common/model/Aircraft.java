package by.bsuir.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Aircraft")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Aircraft {
   @Id
   @Column(name = "aircraftId", nullable = false)
   @GeneratedValue(strategy = GenerationType.AUTO, generator = "aircraft_seq")
   @SequenceGenerator(name = "aircraft_seq", sequenceName = "aircraft_seq")
   private long aircraftId;
   @Column(name = "model", nullable = false)
   private String model;
   @Column(name = "date", nullable = false)
   private Date date;
   @Column(name = "seatCount", nullable = false)
   private int seatCount;

   @OneToMany(mappedBy = "aircraft", fetch = FetchType.LAZY)
   private List<Flight> flights;
}
