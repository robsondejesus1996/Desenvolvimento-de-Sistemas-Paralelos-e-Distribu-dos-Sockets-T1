/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Robson de Jesus
 */
public class Server {

    //port e socket 
    public static final int PORT = 4000;
    private ServerSocket serverSocket;

    public void start() throws IOException {
        serverSocket = new ServerSocket(PORT);
        System.out.println("Servidor iniciando na porta " + PORT);
        clietConnectionLoop();
        //System.out.println("Servidor finalizado...");
    }

    private void clietConnectionLoop() throws IOException {
        while (true) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("Cliente " + clientSocket.getRemoteSocketAddress() + " connectou");
            //aguardando os dados
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String nome = in.readLine();
            String cpf = in.readLine();
            String endereco = in.readLine();
            System.out.println("Dados recebido do cliente "+ clientSocket.getRemoteSocketAddress() + ": "+nome);
             System.out.println("Dados recebido do cliente "+ clientSocket.getRemoteSocketAddress() + ": "+cpf);
              System.out.println("Dados recebido do cliente "+ clientSocket.getRemoteSocketAddress() + ": "+endereco);
            
        }
    }

    public static void main(String[] args) {

        Server server = new Server();
        try {
            server.start();
        } catch (IOException ex) {
            System.out.println("Erro ao iniciar o servidor: " + ex.getMessage());
        }

    }

}
