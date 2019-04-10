import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CarrinhoBean {
	
	private List<String> produtos;
	
	public void comprar() {
		for (String p : produtos) {
			System.out.println(p);
		}
		
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
	

	
	
	
	
	

}
