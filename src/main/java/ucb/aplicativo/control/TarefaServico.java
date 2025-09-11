package ucb.aplicativo.control;

import ucb.aplicativo.model.Tarefas;
import java.util.ArrayList;
import java.util.List;

public class TarefaServico {
    private List<Tarefas> tarefas = new ArrayList<>();
    private Long contadorId = 1L;

    public Tarefas criarTarefa(String titulo, String descricao) {

        Tarefas tarefa = new Tarefas(contadorId++, titulo, descricao, false);
        tarefas.add(tarefa);
        return tarefa;
    }
    
    public List<Tarefas> listaTarefas() {
        return tarefas;
    }

    public void concluirTarefa(String titulo) {
        for (Tarefas t : tarefas) {
            if (t.getTitulo().equals(titulo)) {
                t.setCompleta(true);
                break;
            }
        }
    }

    public void atualizarTarefa(String titulo, String novaDescricao) {
        for (Tarefas t : tarefas) {
            if (t.getTitulo().equals(titulo)) {
                t.setDescricao(novaDescricao);
                break;
            }
        }
    }
}
