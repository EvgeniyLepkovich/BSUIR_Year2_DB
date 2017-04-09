package by.bsuir.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Booking")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Booking {
   @Id
   @Column(name = "bookingId", nullable = false)
   @GeneratedValue(strategy = GenerationType.AUTO, generator = "booking_seq")
   @SequenceGenerator(name = "booking_seq", sequenceName = "booking_seq")
   private long bookingId;
   @Column(name = "ticketId", nullable = false)
   private long ticketId;
   @Column(name = "accountId", nullable = false)
   private long accountId;
   @Column(name = "date", nullable = false)
   private Date date;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "ticketId", insertable = false, updatable = false)
    private Ticket ticket;

   @ManyToOne(fetch = FetchType.LAZY, optional = true)
   @JoinColumn(name = "accountId", insertable = false, updatable = false)
   private Account account;
}
