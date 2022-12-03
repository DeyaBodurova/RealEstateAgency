package softuni.exam.models.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Min;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "agents")
public class Agent extends BaseEntity{

    @Column(name = "first_name",unique = true)
    @Min(value = 2)
    private String firstName;

    @Column(name = "last_name")
    @Min(value = 2)
    private String lastName;

    @Column(name = "email")
    @Email
    private String email;
}
