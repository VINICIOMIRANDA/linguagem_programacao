package br.edu.ads.lpii.lista_contatos_jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller //Define que minha classe será um controller - informa a resposta para o usuário, passando os atributos visiveis e recebendo os parametros vindos do view
public class ContatosHistorico {
    
    Historico historico = new Historico();

    @Autowired
    OperacaoRepository operacaoRepository;

@PostMapping(value="/contato")// @PostMappingOs métodos anotados manipulam as POSTsolicitações HTTP correspondentes à expressão de URI fornecida. nesse caso o index.html está utilizando o metodo post <form action="/calcula" method="POST"> este será chamado nessa função.
public ModelAndView postContato(@RequestParam String nome,@RequestParam String idade,@RequestParam String email,@RequestParam String senha){
   
  
       
        // iniciando a varíavel com valor zerado
        String nomeContato = nome.toString();
       String idadeContato = idade.toString(); 
       String emailContato = email.toString(); 
       String senhaContato = senha.toString();

        System.out.println("Passei por aqui");
       // System.out.println(nomeContato);
      //  System.out.println(senhaContato);
        
  
     
        Contato contato = new Contato();
        
        
        contato.setNome(nomeContato);
        contato.setIdade(idadeContato);
        contato.setEmail(emailContato);
        contato.setSenha(senhaContato);

        //String resultado = "Nome :"+ nomeContato+" Idade:  "+ idadeContato+" E-mail: "+emailContato;

       
        operacaoRepository.save(contato);
        historico.adicionar(contato);


        
        
        ModelAndView modelAndView = new ModelAndView("index"); // Criando um construtor chamando o templates/index

        modelAndView.addObject("mensagem", "Nome :"+ contato.Nome +" Idade: "+contato.Idade+" E-mail: "+ contato.Email);
        modelAndView.addObject("historico", operacaoRepository.findAll());

       


    return modelAndView;
}

}