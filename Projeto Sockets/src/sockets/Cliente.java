/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockets;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Robson de Jesus
 */
public class Cliente {

    private static final String SERVER_ADDRESS = "127.0.0.1";
    private Socket clienteSocket;
    private PrintWriter out;

    public void start() throws IOException {
        clienteSocket = new Socket(SERVER_ADDRESS, Server.PORT);
        this.out = new PrintWriter(clienteSocket.getOutputStream(), true);

        System.out.println("Cliente conectado ao servidor em " + SERVER_ADDRESS + ": " + Server.PORT);
        dadosLoop();

    }

    private void dadosLoop() throws IOException {
        Scanner entrada = new Scanner(System.in);
        String cpf;
        String nome;
        String endereco;
        //fazer o menu aqui 
        do {
            System.out.println("Digite o nome:");
            nome = entrada.nextLine();
            System.out.println("Digite o CPF:");
            cpf = entrada.nextLine();
            System.out.println("Digite o endereco: ");
            endereco = entrada.nextLine();
            out.println(nome);
            out.println(cpf);
            out.println(endereco);
            out.flush();
        } while (!nome.equalsIgnoreCase("sair"));

    }

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        try {
            cliente.start();
        } catch (IOException ex) {
            System.out.println("Erro ao iniciar cliente: " + ex.getMessage());
        }

        //System.out.println("Cliente finalizado!");
    }

}
