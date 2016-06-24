package classes;

public class ProdutoBean {
    private String nome;
    private String descricao;
    private int ID;
    private int quantidade;

    public ProdutoBean() {
        this.nome = "";
        this.descricao = "";
        this.quantidade= 0;
        this.ID = 0;
    }

    public ProdutoBean(int ID, int quant, String nomeProduto, String desc) {
        this.nome = nomeProduto;
        this.quantidade= quant;
        this.descricao = desc;
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
