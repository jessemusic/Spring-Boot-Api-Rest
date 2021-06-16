
package br.com.jmcmusicmattec.forum.controller.form;

import br.com.jmcmusicmattec.forum.modelo.Topico;
import br.com.jmcmusicmattec.forum.repositories.TopicoRepository;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class AtualizacaoTopicoForm {
        
    @NotNull @NotEmpty @Length(min = 5)
	private String titulo;
	@NotNull @NotEmpty @Length(min = 10)
        private String mensagem;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Topico atualizar(Long id, TopicoRepository topicoRepository) {
        Topico topico = topicoRepository.getOne(id);
        
        topico.setTitulo(this.titulo);
        topico.setMensagem(this.mensagem);
       
        return topico;
    }
        
        
        
    
}
