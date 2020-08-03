package ahrnuld.springhealthcare.model;

import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Specialty extends BaseEntity {

    private String description;
}
