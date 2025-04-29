package com.github.fecalu.mercado.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Double preco;
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categorias;
    @OneToMany(mappedBy = "produtos")//indica um relacionamento de um para muitos entre Produto e ItemPedido.
    private List<ItemPedido> itemPedidos;
    //mappedBy = "produto" ta dizendo que a propriedade produto dentro de ItemPedido é quem controla o relacionamento.




}
