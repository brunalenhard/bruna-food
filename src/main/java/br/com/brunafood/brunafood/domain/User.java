package br.com.brunafood.brunafood.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class User extends BaseEntity {
    private String name;
    private int age;
    @Enumerated(EnumType.STRING)
    private SexEnum sex;
    private String email;
    private String password;
}
