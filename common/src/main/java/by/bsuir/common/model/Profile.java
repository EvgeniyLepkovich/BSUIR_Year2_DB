package by.bsuir.common.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Profile")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Profile {
   @Id
   @Column(name = "profileId", nullable = false)
   @GeneratedValue(strategy = GenerationType.AUTO, generator = "profile_seq")
   @SequenceGenerator(name = "profile_seq", sequenceName = "profile_seq")
   private long profileId;
   @Column(name = "accountId", nullable = false)
   private long accountId;
   @Column(name = "passportId")
   private long passportId;
   @Column(name = "hobby")
   private String hobby;
   @Column(name = "achivements")
   private String achivements;
   @Column(name = "vk")
   private String vk;
   @Column(name = "facebook")
   private String facebook;
   @Column(name = "twitter")
   private String twitter;

   @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
   @JoinColumn(name = "accountId", insertable = false, updatable = false)
   private Account account;

   @OneToOne(mappedBy = "profile", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
   private Passport passport;
}
