package br.edu.ads.lpii.lista_contatos_jpa;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@Entity

public class Contato {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    Long id;
    
    String Nome;
    String Idade;
    String Email;
    String Senha;;
  

}