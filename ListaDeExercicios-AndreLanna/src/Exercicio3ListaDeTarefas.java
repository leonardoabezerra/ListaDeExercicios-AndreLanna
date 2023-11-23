import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.lang.String;

public class Exercicio3ListaDeTarefas {
    
    public static void main(String[] args) {

        // Declaração de Variáveis
            String comando;
            int sair = 0, escolha;

            String lista = new String();
            ArrayList<String> tarefas = new ArrayList<String>();

        do {

            comando = (String)JOptionPane.showInputDialog(null, "Comandos disponíveis:\n" +
                            "- \"adicionar\" para adicionar uma nova tarefa\n" + 
                            "- \"listar\" para listar as tarefas\n" + 
                            "- \"concluir\" para marcar uma tarefa como concluida\n" +
                            "- \"sair\" para sair do programa\n\n" + 
                            "Digite um comando: ");

            switch (comando) {
                case "adicionar":
                    String tarefa = JOptionPane.showInputDialog("Digite a tarefa que deseja adicionar");
                    tarefas.add(tarefa);

                    break;
                case "listar":
                    if (tarefas.size() == 0) {
                        JOptionPane.showMessageDialog(null, "(Nenhuma tarefa pendente)");
                    } else {
                        lista = "";
                        for (int i = 0; i < tarefas.size(); i++) {
                            lista += (i+1) + ". " + tarefas.get(i) + "\n";
                        }

                        JOptionPane.showMessageDialog(null, "Tarefas pendentes:\n" + lista);
                    }
                    
                    break;
                case "concluir":
                    lista = "";
                        for (int i = 0; i < tarefas.size(); i++) {
                            lista += (i+1) + ". " + tarefas.get(i) + "\n";
                        }

                    String strescolha = JOptionPane.showInputDialog("Digite o número da tarefa a ser concluída:\n" + lista + "\n");
                    escolha  = Integer.parseInt(strescolha);

                    tarefas.remove(escolha-1);  // Remover da lista


                    break;
                case "sair":
                    sair++;
            }

        } while (sair != 1);
    }

}
