package com.ivoronline.springboot.entity_recommended.entitites;

import lombok.Data;
import org.springframework.stereotype.Component;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@Component
public class PersonEntity {

  @Id
  private Long    id;
  private String  name;
  private Integer age;

}



