package by.bsuir.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Fene4ka_ on 05.04.2017.
 */
@Entity
@Table(name = "Role")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Role {
    @Id
    @Column(name = "roleId", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "role_seq")
    @SequenceGenerator(name = "role_seq", sequenceName = "role_seq")
    private long roleId;
    @Column(name = "value", nullable = false)
    private String value;

    @OneToMany(mappedBy = "role", fetch = FetchType.LAZY)
    private List<Account> accounts;
 }
