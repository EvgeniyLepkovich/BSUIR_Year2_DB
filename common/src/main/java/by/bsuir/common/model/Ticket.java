package by.bsuir.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Ticket")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Ticket {
   @Id
   @Column(name = "ticketId", nullable = false)
   @GeneratedValue(strategy = GenerationType.AUTO, generator = "ticket_seq")
   @SequenceGenerator(name = "ticket_seq", sequenceName = "ticket_seq")
   private long ticketId;
   @Column(name = "flightId", nullable = false)
   private long flightId;
   @Column(name = "seat", nullable = false)
   private String seat;
   @Column(name = "cost", nullable = false)
   private double cost;

   @ManyToOne(fetch = FetchType.LAZY, optional = true)
   @JoinColumn(name = "flightId", insertable = false, updatable = false)
   private Flight flight;

   @OneToOne(mappedBy = "ticket", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
   private Booking booking;
}
