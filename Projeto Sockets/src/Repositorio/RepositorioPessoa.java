/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorio;

import java.util.ArrayList;
import java.util.List;
import jdk.internal.util.xml.impl.Input;
import model.Pessoa;

/**
 *
 * @author Robson de Jesus
 */
public class RepositorioPessoa implements IRepositorioPessoa {

    List<Pessoa> listarPessoas = new ArrayList<Pessoa>();

    @Override
    public boolean salvarPessoa(Pessoa pessoa) {

        try {
            listarPessoas.add(pessoa);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean deletarPessoaPorCPF(String cpf) {

        for (Pessoa pessoa : listarPessoas) {
            if (pessoa.getCpf() == cpf) {
                listarPessoas.remove(pessoa);
            }
        }
        return false;
    }

    @Override
    public List<Pessoa> listarPessoa() {
        return listarPessoas;
    }

    @Override
    public Pessoa buscaPessoaCpf(String cpf) {
        for(Pessoa pessoa : listarPessoas){
            if(pessoa.getCpf() == cpf){
                System.out.println(pessoa.getCpf());
                System.out.println(pessoa.getNome());
                System.out.println(pessoa.getEndereco());
            }
        }
        return null;
    }

    @Override
    public boolean alterarPessoa(Pessoa pessoa) {

        for (Pessoa pessoa1 : listarPessoas){
            if(pessoa1.getCpf() == pessoa.getCpf()){
                listarPessoas.remove(pessoa1);
                listarPessoas.add(pessoa);
            }
            
        }
        return false;
    }

}
