package com.guild.mannagent.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter
@Setter
@Table(name= "tb_aventureiro")
public class Aventureiro {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "aventureiro_id")
private Long aventureiroId;

@Column(name = "nome")
private String nome;

@Column(name = "classe")
private String classe;

@Column(name = "carteira")
private Long carteira;

@Column(name = "rank")
private Long rank;

@OneToOne
@JoinColumn(name = "inventario_id")
private Inventario inventario;
    
}
