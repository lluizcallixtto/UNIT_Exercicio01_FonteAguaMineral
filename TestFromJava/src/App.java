public class App {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.cadastrarProduto("Água Mineral", 2.50, 123);
        
        produto.registrarProducao(1000);
        produto.registrarProducao(2000);
        
        produto.registrarSaida(2500);
        produto.registrarSaida(1000);

        // Exibindo informações após as operações
        System.out.println("Descrição do Produto: " + produto.getDescricao());
        System.out.println("Preço de Custo: " + produto.getPrecoCusto());
        System.out.println("Código do Produto: " + produto.getCodigoProduto());
        System.out.println("Estoque Atual: " + produto.getEstoque());
    }
}
