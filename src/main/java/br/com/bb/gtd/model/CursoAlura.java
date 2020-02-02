package br.com.bb.gtd.model;

public class CursoAlura {

    public String urlName;
    public Integer id;
    public String nome;
    public Integer quantidade_aulas;
    public Integer minutos_video;
    public Integer dificuldade;
    public Integer tempo_estimado;
    public Integer quantidade_musicas;
    public String data_publicacao;

    public String getUrlName() {
        return urlName;
    }

    public void setUrlName(String urlName) {
        this.urlName = urlName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade_aulas() {
        return quantidade_aulas;
    }

    public void setQuantidade_aulas(Integer quantidade_aulas) {
        this.quantidade_aulas = quantidade_aulas;
    }

    public Integer getMinutos_video() {
        return minutos_video;
    }

    public void setMinutos_video(Integer minutos_video) {
        this.minutos_video = minutos_video;
    }

    public Integer getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(Integer dificuldade) {
        this.dificuldade = dificuldade;
    }

    public Integer getTempo_estimado() {
        return tempo_estimado;
    }

    public void setTempo_estimado(Integer tempo_estimado) {
        this.tempo_estimado = tempo_estimado;
    }

    public Integer getQuantidade_musicas() {
        return quantidade_musicas;
    }

    public void setQuantidade_musicas(Integer quantidade_musicas) {
        this.quantidade_musicas = quantidade_musicas;
    }

    public String getData_publicacao() {
        return data_publicacao;
    }

    public void setData_publicacao(String data_publicacao) {
        this.data_publicacao = data_publicacao;
    }
}
