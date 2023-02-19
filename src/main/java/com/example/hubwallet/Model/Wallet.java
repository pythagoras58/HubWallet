package com.example.hubwallet.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "wallet")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "wallet_gen")
    @SequenceGenerator(name = "wallet_gen", sequenceName = "wallet_seq")
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String w_type;
    private String account_number;
    private String account_scheme;
    private String created_at;
    private String owner;

}