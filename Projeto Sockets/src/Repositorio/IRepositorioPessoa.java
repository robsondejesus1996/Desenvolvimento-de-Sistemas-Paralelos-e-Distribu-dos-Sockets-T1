/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorio;

import java.util.List;
import model.Pessoa;

/**
 *
 * @author Robson de Jesus
 */

// interface serve para um contrado que o repositorio tem que ter se alguma classe implementar ela 
public interface IRepositorioPessoa {
    
    
    public boolean salvarPessoa(Pessoa pessoa);
    public boolean deletarPessoaPorCPF(String cpf);
    public List<Pessoa> listarPessoa();
    public boolean buscaPessoaCpf(String cpf);
    public boolean alterarPessoa(Pessoa pessoa);
    
    
    
}
