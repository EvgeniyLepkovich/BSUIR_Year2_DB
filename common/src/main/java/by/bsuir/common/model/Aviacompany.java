package by.bsuir.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Aviacompany")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Aviacompany {
   @Id
   @Column(name = "aviacompanyId", nullable = false)
   @GeneratedValue(strategy = GenerationType.AUTO, generator = "aviacompany_seq")
   @SequenceGenerator(name = "aviacompany_seq", sequenceName = "aviacompany_seq")
   private long aviacompanyId;
   @Column(name = "name", nullable = false)
   private String name;

   @OneToMany(mappedBy = "aviacompany", fetch = FetchType.LAZY)
   private List<Aviatour> aviatours;
}
