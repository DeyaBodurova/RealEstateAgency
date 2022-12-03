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
@Table(name = "towns")
public class Town extends BaseEntity{

    @Column(name = "town_name", unique = true)
    @Min(value = 2)
    private String townName;

    @Column
    @Min(value = 1)
    private Long population;
}
