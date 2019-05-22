import java.util.Calendar;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
public class CadastroBean {

	private String nome;

	private String cpf;

	private int idade;
	
	private int estrelas;
	
	private String dataNascimento;

	public void validar() {
		System.out.println("Estrelas: "+ estrelas);
		System.out.println("DataNascimento: "+ dataNascimento);
	}

	public CadastroBean() {
		super();
	}

	public CadastroBean(String nome, String cpf, int idade) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getEstrelas() {
		return estrelas;
	}

	public void setEstrelas(int estrelas) {
		this.estrelas = estrelas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void validaDado(FacesContext context, UIComponent component, Object value)
		throws ValidatorException{
		String valor = value.toString();
		if (valor.contains("@") || valor.contains("#") || valor.contains("*"))
		throw new ValidatorException(new FacesMessage("Nome não pode contem especiais"));
		if(valor.length() < 2 || valor.length() > 20)
			throw new ValidatorException(new FacesMessage("Valor entre 2 a 20 caracteres"));
	
	}

}
