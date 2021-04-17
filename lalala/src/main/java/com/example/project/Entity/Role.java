package com.example.project.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import javax.persistence.*;
import java.util.Set;
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Roles")
public class Role implements GrantedAuthority {

    @Id
    @SequenceGenerator(name = "Role_seq",
            sequenceName = "Role_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Role_seq")
    @Column(name = "role_ID")
    private Long id;
    private String name;

    @Transient
    @ManyToMany(mappedBy = "roles")
    @Column(name = "users")
    private Set<User> users;

    public Role(String name) {
        this.name = name;
    }

    public Role(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String getAuthority() {
        return getName();
    }
}