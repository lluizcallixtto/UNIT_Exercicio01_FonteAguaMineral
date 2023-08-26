public class Produto {
    private String descricao;
    private double precoCusto;
    private int codigoProduto;
    private int estoque;

    // Construtor para criar um produto com os valores iniciais
    public Produto(String descricao, double precoCusto, int codigoProduto) {
        this.descricao = descricao;
        this.precoCusto = precoCusto;
        this.codigoProduto = codigoProduto;
        this.estoque = 0;
    }

    public Produto() {
    }

    // Métodos Getter para os atributos
    public String getDescricao() {
        return descricao;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public int getEstoque() {
        return estoque;
    }

    // Método para registrar produção
    public void registrarProducao(int quantidade) {
        if (quantidade > 0) {
            estoque += quantidade;
        } else {
            System.out.println("Quantidade inválida para produção!");
        }
    }

    // Método para registrar saída
    public void registrarSaida(int quantidade) {
        if (quantidade > 0 && estoque >= quantidade) {
            estoque -= quantidade;
        } else {
            System.out.println("Estoque insuficiente ou quantidade inválida!");
        }
    }

    public void cadastrarProduto(String string, double d, int i) {
    }
}
