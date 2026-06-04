package br.com.lightyear.teste;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.lightyear.model.Missoes;
/**
 * Representa uma missão espacial sustentável voltada à solução de problemas reais da sociedade.
 * Cada missão contém informações sobre seu objetivo, área de impacto, tecnologia utilizada,
 * ODS relacionado, prioridade e status atual.
 *
 * @author Henrique Guedes - RM562474
 * @author Laura tigre - RM565281
 * @author Eduardo Duran - RM562017
 * @author Henrique Castro - RM564560
 * @author Caio Nascimento Caminha - RM564789
 * @version 1.0
 */
 class Teste {

    /**
     * Método principal que inicializa e executa o sistema.
     * Exibe um menu com opções para gerenciar missões espaciais.
     *
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {

        boolean parar = true;
        Scanner scan = new Scanner(System.in);
        ArrayList<Missoes> listaDeMissoes = new ArrayList<>();

        while (parar == true) {
            System.out.println("  ");
            System.out.println("Prevenção de desastres naturais".toUpperCase());
            System.out.println("1 - Cadastrar missão");
            System.out.println("2 - Listar missões");
            System.out.println("3 - Buscar missões");
            System.out.println("4 - Alterar Status da missão");
            System.out.println("5 - Sair");
            System.out.println("\n" + " Digite a alterativa desejada: ");

            int numero = scan.nextInt();
            scan.nextLine();

            // Opção 1: Cadastrar nova missão
            if (numero == 1) {
                boolean cadastrando = true;
                while (cadastrando == true) {
                    Missoes missoes = new Missoes();

                    System.out.println("Nome da missão:");
                    String nome = scan.nextLine();
                    missoes.setNomeDaMissao(nome);

                    System.out.println("Área de impacto:");
                    String area = scan.nextLine();
                    missoes.setAreaDeImpacto(area);

                    System.out.println("Objetivo:");
                    String objetivo = scan.nextLine();
                    missoes.setObjetivoDaMissao(objetivo);

                    System.out.println("ODS:");
                    String ods = scan.nextLine();
                    missoes.setOds(ods);

                    System.out.println("Tecnologia:");
                    String tecnologia = scan.nextLine();
                    missoes.setTipoDeTecnologiaUtilizada(tecnologia);

                    System.out.println("Prioridade:");
                    System.out.println("Coloque a prioridade como baixa ou alta ");
                    String prioridade = scan.nextLine();
                    missoes.setPrioridade(prioridade);

                    System.out.println("Status:");
                    System.out.println("Coloque apenas como 'Em andamento', 'Concluída' ou 'Cancelada' ");
                    String status = scan.nextLine();
                    missoes.setStatus(status);

                    listaDeMissoes.add(missoes);
                    System.out.println("Missao cadastrada com sucesso!!");

                    System.out.println("Digite 'sair' para voltar ao menu inicial ou 'cadastrar novamente' para cadastrar uma nova missão");
                    String sair = scan.nextLine();

                    if (sair.equalsIgnoreCase("sair")) {
                        cadastrando = false;
                    }
                }

            // Opção 2: Listar todas as missões cadastradas
            } if (numero == 2) {
                int contador = 0;
                for (int n = 0; n < listaDeMissoes.size(); n++) {
                    contador++;
                    System.out.println(contador + "-" + listaDeMissoes.get(n));
                }
                if (listaDeMissoes.size() == 0) {
                    System.out.println("Nenhuma missão foi cadastrada ainda ");
                }

            // Opção 3: Buscar missão por nome ou área de impacto
            } if (numero == 3) {
                boolean encontrou = false;
                System.out.println("Digite o nome da missão que deseja procurar ou a area de impacto");
                String busca = scan.nextLine();
                for (int e = 0; e < listaDeMissoes.size(); e++) {
                    if (busca.equalsIgnoreCase(listaDeMissoes.get(e).getNomeDaMissao()) ||
                        busca.equalsIgnoreCase(listaDeMissoes.get(e).getAreaDeImpacto())) {
                        System.out.println("Missao: " + listaDeMissoes.get(e));
                        encontrou = true;
                    }
                }
                if (encontrou == false) {
                    System.out.println("\nMissão não encontrada");
                }

            // Opção 4: Alterar o status de uma missão
            } if (numero == 4) {
                System.out.println("Digite o nome da missão que deseja alterar o seu Status");
                String buscaDeStatus = scan.nextLine();
                for (int s = 0; s < listaDeMissoes.size(); s++) {
                    if (buscaDeStatus.equalsIgnoreCase(listaDeMissoes.get(s).getNomeDaMissao())) {
                        System.out.println("Status da missão atual " + listaDeMissoes.get(s).getStatus());
                        System.out.println("Digite o novo status da missão: " + listaDeMissoes.get(s).getNomeDaMissao());
                        String novoStatus = scan.nextLine();
                        listaDeMissoes.get(s).setStatus(novoStatus);
                        System.out.println("novo status definido " + listaDeMissoes.get(s).getStatus());
                    }
                }

            // Opção 5: Exibir resumo final e encerrar o sistema
            } if (numero == 5) {
                int contagemC = 0;
                int contagemN = 0;
                int contagemE = 0;

                for (int e = 0; e < listaDeMissoes.size(); e++) {
                    if ("alta".equalsIgnoreCase(listaDeMissoes.get(e).getPrioridade())) {
                        System.out.println("Missões de maior prioridade " + listaDeMissoes.get(e).getNomeDaMissao());
                    }
                    if ("concluida".equalsIgnoreCase(listaDeMissoes.get(e).getStatus())) {
                        contagemC++;
                    }
                    if ("em andamento".equalsIgnoreCase(listaDeMissoes.get(e).getStatus())) {
                        contagemE++;
                    }
                    if ("cancelada".equalsIgnoreCase(listaDeMissoes.get(e).getStatus())) {
                        contagemN++;
                    }
                }

                System.out.println("Total de missoes cadastrada:  " + listaDeMissoes.size());
                System.out.println("Missões concluidas: " + contagemC);
                System.out.println("Missões em andamento: " + contagemE);
                System.out.println("Missões canceladas: " + contagemN);
                System.out.println("\n Obrigado por utilizar nossos serviços!");
                parar = false;
            }
        }
    }
}