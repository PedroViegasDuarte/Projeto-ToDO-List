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

    // getters e setters

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDateTime getDataAgora() {
        return dataAgora;
    }
    public void setDataAgora(LocalDateTime dataAgora) {
        this.dataAgora = dataAgora;
    }
    public boolean isCompleta() {
        return completa;
    }
    public void setCompleta(boolean completa) {
        this.completa = completa;
    }

}
