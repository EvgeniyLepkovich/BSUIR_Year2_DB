package by.bsuir.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Goal")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Goal {
   @Id
   @Column(name = "goalId", nullable = false)
   @GeneratedValue(strategy = GenerationType.AUTO, generator = "goal_seq")
   @SequenceGenerator(name = "goal_seq", sequenceName = "goal_seq")
   private long goalId;
   @Column(name = "value", nullable = false)
   private String value;

   @OneToMany(mappedBy = "goal", fetch = FetchType.LAZY)
   private List<Aviatour> aviatours;
}
