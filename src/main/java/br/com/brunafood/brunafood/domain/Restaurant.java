package br.com.brunafood.brunafood.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class Restaurant extends BaseEntity{
    private String name;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private String adressId;


}
