package ucb.aplicativo.model;

import java.time.LocalDateTime;

public class Tarefas {


    private long ID = 0;
    private String titulo = "";
    private String descricao = "";
    private LocalDateTime dataAgora = null;
    private boolean completa = false;


    public Tarefas(){
        this.dataAgora = LocalDateTime.now();
        this.completa = false;
    }


    public  Tarefas(String titulo){
        this();
        this.titulo = titulo;
    }

    public Tarefas(String titulo, String descricao) {
        this(titulo);
        this.descricao = descricao;
    }

    //construtor completo

    public Tarefas(Long ID, String titulo, String descricao, boolean completa) {
        this(titulo, descricao);
        this.ID = ID;
        this.completa = completa;
    }

}
