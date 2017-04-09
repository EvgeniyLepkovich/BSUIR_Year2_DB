package by.bsuir.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Account")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Account {
   @Id
   @Column(name = "accountId", nullable = false)
   @GeneratedValue(strategy = GenerationType.AUTO, generator = "account_seq")
   @SequenceGenerator(name = "account_seq", sequenceName = "account_seq")
   private long accountId;
   @Column(name = "roleId", nullable = false)
   private long roleId;
   @Column(name = "profileId")
   private long profileId;
   @Column(name = "login", nullable = false)
   private String login;
   @Column(name = "password", nullable = false)
   private String password;
   @Column(name = "email")
   private String email;

   @ManyToOne(fetch = FetchType.LAZY, optional = true)
   @JoinColumn(name = "roleId", insertable = false, updatable = false)
   private Role role;

   @OneToOne(mappedBy = "account", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
   private Profile profile;

   @OneToMany(mappedBy = "account", fetch = FetchType.LAZY)
   private List<Booking> bookings;

}
