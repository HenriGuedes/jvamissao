package br.com.lightyear.model;

/**
 * Representa uma missão espacial sustentável voltada à solução de problemas reais da sociedade.
 * Cada missão contém informações sobre seu objetivo, área de impacto, tecnologia utilizada,
 * ODS relacionado, prioridade e status atual.
 *
 * @author Seu Nome
 * @version 1.0
 */
public class Missoes {

    /** Nome da missão espacial. */
    private String nomeDaMissao;

    /** Área de impacto da missão (ex: agricultura, clima, saúde). */
    private String areaDeImpacto;

    /** Objetivo principal da missão. */
    private String objetivoDaMissao;

    /** Objetivo de Desenvolvimento Sustentável relacionado à missão. */
    private String ods;

    /** Tipo de tecnologia utilizada na missão (ex: satélite, sensor, IA). */
    private String tipoDeTecnologiaUtilizada;

    /** Grau de prioridade da missão: "baixa" ou "alta". */
    private String prioridade;

    /** Status atual da missão: "Em andamento", "Concluída" ou "Cancelada". */
    private String status;

    /**
     * Construtor padrão sem parâmetros.
     * Cria uma missão vazia para preenchimento posterior via setters.
     */
    public Missoes() {
    }

    /**
     * Construtor com todos os parâmetros da missão (sobrecarga).
     * Permite criar uma missão já com todos os dados preenchidos.
     *
     * @param nomeDaMissao            Nome da missão
     * @param areaDeImpacto           Área de impacto da missão
     * @param objetivoDaMissao        Objetivo principal da missão
     * @param ods                     ODS relacionado à missão
     * @param tipoDeTecnologiaUtilizada Tecnologia utilizada na missão
     * @param prioridade              Prioridade da missão ("baixa" ou "alta")
     * @param status                  Status da missão ("Em andamento", "Concluída" ou "Cancelada")
     */
    public Missoes(String nomeDaMissao, String areaDeImpacto, String objetivoDaMissao, String ods,
            String tipoDeTecnologiaUtilizada, String prioridade, String status) {
        this.nomeDaMissao = nomeDaMissao;
        this.areaDeImpacto = areaDeImpacto;
        this.objetivoDaMissao = objetivoDaMissao;
        this.ods = ods;
        this.tipoDeTecnologiaUtilizada = tipoDeTecnologiaUtilizada;
        this.prioridade = prioridade;
        this.status = status;
    }

    /**
     * Retorna uma representação textual completa da missão.
     *
     * @return String com todos os dados da missão formatados
     */
    @Override
    public String toString() {
        return " Missoes{" + "\n" +
                " nome= " + nomeDaMissao + "," + "\n" +
                " area De Impacto = " + areaDeImpacto + "," + "\n" +
                " Objetivo Da Missão = " + objetivoDaMissao + "," + "\n" +
                " ODS = " + ods + "," + "\n" +
                " Tipo De Tecnologia Utilizada= " + tipoDeTecnologiaUtilizada + "," + "\n" +
                " Prioridade = " + prioridade + "," + "\n" +
                " Status = " + status +
                '}';
    }

    /**
     * Retorna o nome da missão.
     * @return nome da missão
     */
    public String getNomeDaMissao() {
        return nomeDaMissao;
    }

    /**
     * Define o nome da missão.
     * @param nomeDaMissao nome a ser definido
     */
    public void setNomeDaMissao(String nomeDaMissao) {
        this.nomeDaMissao = nomeDaMissao;
    }

    /**
     * Retorna a área de impacto da missão.
     * @return área de impacto
     */
    public String getAreaDeImpacto() {
        return areaDeImpacto;
    }

    /**
     * Define a área de impacto da missão.
     * @param areaDeImpacto área a ser definida
     */
    public void setAreaDeImpacto(String areaDeImpacto) {
        this.areaDeImpacto = areaDeImpacto;
    }

    /**
     * Retorna o objetivo da missão.
     * @return objetivo da missão
     */
    public String getObjetivoDaMissao() {
        return objetivoDaMissao;
    }

    /**
     * Define o objetivo da missão.
     * @param objetivoDaMissao objetivo a ser definido
     */
    public void setObjetivoDaMissao(String objetivoDaMissao) {
        this.objetivoDaMissao = objetivoDaMissao;
    }

    /**
     * Retorna o ODS relacionado à missão.
     * @return ODS da missão
     */
    public String getOds() {
        return ods;
    }

    /**
     * Define o ODS relacionado à missão.
     * @param ods ODS a ser definido
     */
    public void setOds(String ods) {
        this.ods = ods;
    }

    /**
     * Retorna o tipo de tecnologia utilizada na missão.
     * @return tipo de tecnologia
     */
    public String getTipoDeTecnologiaUtilizada() {
        return tipoDeTecnologiaUtilizada;
    }

    /**
     * Define o tipo de tecnologia utilizada na missão.
     * @param tipoDeTecnologiaUtilizada tecnologia a ser definida
     */
    public void setTipoDeTecnologiaUtilizada(String tipoDeTecnologiaUtilizada) {
        this.tipoDeTecnologiaUtilizada = tipoDeTecnologiaUtilizada;
    }

    /**
     * Retorna a prioridade da missão.
     * @return prioridade ("baixa" ou "alta")
     */
    public String getPrioridade() {
        return prioridade;
    }

    /**
     * Define a prioridade da missão.
     * @param prioridade prioridade a ser definida ("baixa" ou "alta")
     */
    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    /**
     * Retorna o status atual da missão.
     * @return status da missão
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define o status atual da missão.
     * @param status status a ser definido ("Em andamento", "Concluída" ou "Cancelada")
     */
    public void setStatus(String status) {
        this.status = status;
    }
}