import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CarrinhoBean {

	private List<String> produtos;

	private int tipoPagamento;

	private List<Pagamento> pgto;
	private String qtdItens;

	public void comprar() {
		for (String p : produtos)
			System.out.println("Produto Selecionado: "+p);
		
		System.out.println("Quantidade "+qtdItens);
		
		for(Pagamento p : pgto) if(p.getId() == tipoPagamento) 
				System.out.println("Forma: "+p.getNome());		
	}

	public List<Pagamento> getFormaPagamento() {
		pgto = new ArrayList<Pagamento>();
		pgto.add(new Pagamento(1, "Cartão Crédito"));
		pgto.add(new Pagamento(2, "Cartão Débito"));
		pgto.add(new Pagamento(3, "Boleto"));
		return pgto;
	}

	public List<Produto> getProdutosTodos() {
		List<Produto> p = new ArrayList<Produto>();
		p.add(new Produto(1, "Sabão"));
		p.add(new Produto(2, "Mesa"));
		p.add(new Produto(3, "Computador"));
		p.add(new Produto(4, "Teclado"));
		p.add(new Produto(5, "Mouse"));
		return p;
	}

	public CarrinhoBean() {
		super();
	}

	public CarrinhoBean(List<String> produtos) {
		super();
		this.produtos = produtos;
	}

	public List<String> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<String> produtos) {
		this.produtos = produtos;
	}

	public int getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(int tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public String getQtdItens() {
		return qtdItens;
	}

	public void setQtdItens(String qtdItens) {
		this.qtdItens = qtdItens;
	}

}
