package com.sbrfraj.tn.Gestiondestock.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class AbstractEntity implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    @CreatedDate
    @Column(name = "creationDate",nullable = false)
    @JsonIgnore
    private Date creationDate;
    @LastModifiedDate
    @Column(name = "lastModifiedDate",nullable = false)
    @JsonIgnore
    private Date lastCreationDate;
}
