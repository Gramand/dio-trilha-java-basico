package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        imprimirSelecionados();
    }
    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimindo lista de candidatos informando o indice do elemento");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println(candidatos[i] + " " + i);
        }

        System.out.println("Forma abreviada com for each");
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando){
                tentativasRealizadas++;
            } else System.out.println("CONTATO REALIZADO COM SUCESSO");

        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("Conseguimos contato com o candidato " + candidato + " na " + tentativasRealizadas + " tentativa");
        } else System.out.println("Não conseguimos contato com o candidato " + candidato + ", numero maximo de tentativas: " + tentativasRealizadas);

    }
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato" + candidato + "solicitou um salário de: R$" + salarioPretendido);
            if (salarioPretendido <= salarioBase){
                candidatosSelecionados++;
            }
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PO CANDIDATO");
        } else if(salarioBase == salarioPretendido){
            System.out.println("FAZER CONTRA PROPOSTA");
        } else {
            System.out.println("ANALISANDO OS OTRO");
        }

    }
}
