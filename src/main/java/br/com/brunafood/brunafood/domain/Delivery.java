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
public class Delivery extends BaseEntity{
    @ManyToOne
    @JoinColumn(name = "delivery_man_user_id")
    private User deliveryManUser;
    @ManyToOne
    @JoinColumn(name = "target_user_id")
    private User targetUser;
    private String adress;
}
