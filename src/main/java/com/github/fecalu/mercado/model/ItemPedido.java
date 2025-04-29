package com.github.fecalu.mercado.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Double desconto;
    private Integer quantidade;
    private Double preco;
    @ManyToOne
    @JoinColumn(name = "produto_id") //será a chave estrangeira que conecta a tabela ItemPedido à tabela Produto.
    private Produto produtos;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido peidido;



}
