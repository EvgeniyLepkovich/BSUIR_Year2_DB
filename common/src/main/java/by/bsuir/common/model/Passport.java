package by.bsuir.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Passport")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Passport {
   @Id
   @Column(name = "passportId", nullable = false)
   @GeneratedValue(strategy = GenerationType.AUTO, generator = "passport_seq")
   @SequenceGenerator(name = "passport_seq", sequenceName = "passport_seq")
   private long passportId;
   @Column(name = "profileId", nullable = false)
   private long profileId;
   @Column(name = "beginDate", nullable = false)
   private Date beginDate;
   @Column(name = "number", nullable = false)
   private String number;
   @Column(name = "issuedBy", nullable = false)
   private String issuedBy;
   @Column(name = "issued", nullable = false)
   private String issued;
   @Column(name = "endDate", nullable = false)
   private Date endDate;

   @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
   @JoinColumn(name = "profileId", insertable = false, updatable = false)
   private Profile profile;

}
