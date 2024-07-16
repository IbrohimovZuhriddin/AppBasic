package uz.classmates.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class AppEntity {

    @Id
    private Integer id;
    private String name ;
    private String surname;
    private Integer phoneNumber;

}