package br.edu.unifip.ecommerceapi.models;

import br.edu.unifip.ecommerceapi.dtos.EnderecoDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "enderecos")
@Entity(name = "Endereco")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Endereco {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String uf;
    private String bairro;
    private String rua;
    @OneToOne(mappedBy = "endereco")
    private User usuario;
    


    public Endereco(EnderecoDto dados) {
        this.uf = dados.uf();
        this.bairro = dados.bairro();
        this.rua = dados.rua();
    }   

}